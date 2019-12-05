package com.okayokya.orderService.service;

import com.okayokya.orderService.dao.OrderDao;
import com.okayokya.orderService.dao.OrderProductDao;
import com.okayokya.orderService.dto.OrderDto;
import com.okayokya.orderService.model.Order;
import com.okayokya.orderService.model.OrderProduct;
import com.okayokya.orderService.utils.CartItem;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: OrderService
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/1 17:41
 * @version : V1.0
 */
@Service
public class OrderService {
    @Autowired
    OrderDao orderDao;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    OrderProductDao orderProductDao;
    @Autowired
    private AmqpTemplate amqpTemplate;

    public int select1() {
        System.out.println(orderDao.select1());
        return 0;
    }
    @Transactional
    public int createOrder(OrderDto orderDto) {
        int totalQuantity = 0;
        BigDecimal totalPrice = new BigDecimal("0.00");
        BigDecimal totalDeduction = new BigDecimal("0.00");
        List<CartItem> productList = new ArrayList<>();
        //从redis中获取购物车所有item
        String cartName = orderDto.getAccount() + "Cart";
        List<CartItem> list = redisTemplate.opsForList().range(cartName, 0, -1);
        //结算购物车所有状态为选中的item放入productList，并且将他们从redislist中删除
        for (int i = 0; i < list.size(); i++) {

            CartItem cartItem = (CartItem) redisTemplate.opsForList().index(cartName, i);
            if (cartItem.getStatus().equals("选中")) {
                redisTemplate.opsForList().set(cartName, i, "SELECTED");
                productList.add(cartItem);
            }
        }
        redisTemplate.opsForList().remove(cartName, 0, "SELECTED");
        //Q计算购物车取出商品相关数据，并把数据插入order表
        for (CartItem cartItem : productList) {
            BigDecimal deduction = cartItem.getProduct().getPrice().subtract(cartItem.getProduct().getPurchasePrice());
            BigDecimal quantity = new BigDecimal(cartItem.getQuantity());
            totalQuantity = totalQuantity + cartItem.getQuantity();
            totalPrice = totalPrice.add(new BigDecimal(cartItem.getProduct().getPrice().
                    multiply(quantity).toString()));
            totalDeduction = totalDeduction.add(deduction);
        }
        orderDao.createOrder(new Order());

        //取出购物车中选中商品的id并根据userid和状态查出刚才生成order表生成order-product关系表数据
        createTableOrderProduct(productList);

        //通过消息队列发送order_id到user服务，同步user-order关系表
        createTableOrderUser(productList, orderDto);

        //R通过消息队列发送（product_id，stock）到catalog服务，同步商品库存
        syncStockToCatalogService(productList);
        return 0;
    }

    @Transactional
    public void createTableOrderProduct(List<CartItem> productList) {

        for (CartItem cartItem : productList) {
            orderProductDao.addItem(new OrderProduct(
                    Integer.toString(orderDao.selectByUserIdAndStatus(0, "").getId()),
                    Integer.toString(cartItem.getProduct().getId())));
        }
    }

    @Transactional
    public void createTableOrderUser(List<CartItem> productList, OrderDto orderDto) {


            amqpTemplate.convertAndSend("OrderId",
                    String.format("%s#%s", orderDto.getAccount(),
                            Integer.toString(orderDao.selectByUserIdAndStatus(0, "").getId())));

    }

    @Transactional
    public void syncStockToCatalogService(List<CartItem> productList) {
        for (CartItem cartItem : productList) {

            amqpTemplate.convertAndSend("Product-stock",
                    String.format("%s#%s", Integer.toString(cartItem.getProduct().getId()),
                            Integer.toString(cartItem.getQuantity())));
        }
    }


    //需要编写事务补偿逻辑，处理消费者处理消息失败的情况
    //支付操作
    //如果支付失败以上Q操作order表更改状态为“取消”
    //支付成功
}
