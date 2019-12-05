package com.okayokya.catalogService.service;

import com.okayokya.catalogService.dao.ProductDao;
import com.okayokya.catalogService.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @ClassName: ProductService
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/30 18:50
 * @version : V1.0
 */
@Service
public class ProductService {
    @Autowired
    ProductDao productDao;
    public List<Product> listByPage(int start,int count){
        productDao.listByPage(start,count);
        return null;

    }

    public List<Product> listAll(){

        return  productDao.listAll();

    }
}
