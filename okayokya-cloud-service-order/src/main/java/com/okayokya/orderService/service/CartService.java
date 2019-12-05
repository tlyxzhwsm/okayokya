package com.okayokya.orderService.service;

import com.okayokya.orderService.dto.CartDto;
import com.okayokya.orderService.model.Product;
import com.okayokya.orderService.utils.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/***
 * @ClassName: CartService
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/2 18:34
 * @version : V1.0
 */
@Service
public class CartService {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public String addOneProductToCart(CartDto cartDto){
        String cartName=cartDto.getAccount()+"Cart";
       if(null==redisTemplate.opsForValue().get(cartName)){
           CartItem cartItem=new CartItem();
           cartItem.setKey(cartName);
           cartItem.setStatus("");
           cartItem.setTime(System.currentTimeMillis());
           Product p=new Product();
           cartItem.setProduct(p);
           redisTemplate.opsForList().leftPush(cartName,cartItem);
       }

        return "success";
    }
}
