package com.okayokya.orderService.controller;

import com.okayokya.orderService.dto.CartDto;
import com.okayokya.orderService.model.Product;
import com.okayokya.orderService.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/***
 * @ClassName: CartController
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/2 18:16
 * @version : V1.0
 */
@RestController
public class CartController {

    /**
     * @Description: 处理购物车对象，将商品加入购物车之中
     * @return
     */
    @Autowired
    CartService cartService;

    @RequestMapping(value = "/addCart", method = RequestMethod.POST)
    public String addOneProductToCart(CartDto cartDto) {

        cartService.addOneProductToCart(cartDto);
        return "success";
    }
}
