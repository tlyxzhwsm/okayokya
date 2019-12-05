package com.okayokya.catalogService.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.okayokya.catalogService.model.Product;
import com.okayokya.catalogService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * @ClassName: ProductApi
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/30 17:54
 * @version : V1.0
 */
@RestController
public class ProductApi {

    @Autowired
    ProductService productService;
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String listProductByPage(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage) {

        PageHelper.startPage(currentPage, 10);
        List<Product> list=productService.listAll();
        PageInfo<Product> page=new PageInfo<>(list);
        String resp= JSON.toJSONString(page);
        System.out.println(resp);
        return resp;
    }
}
