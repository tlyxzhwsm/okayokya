package com.okayokya.orderService.controller;

import com.okayokya.orderService.dto.OrderDto;
import com.okayokya.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/***
 * @ClassName: OrderController
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/1 17:41
 * @version : V1.0
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * @Description: 点击结算后创建订单，此方法将redis缓
     * 存中cart中得product对象进行核算处理，生成订单对象
     * @return
     */

    @RequestMapping(value = "/createOrder",method = RequestMethod.POST)
    public String createOrder(OrderDto orderDto){
       orderService.createOrder(orderDto);

        return "success";
    }
}
