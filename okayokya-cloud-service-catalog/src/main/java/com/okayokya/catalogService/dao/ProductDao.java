package com.okayokya.catalogService.dao;

import com.okayokya.catalogService.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * @ClassName: ProductDao
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/30 18:50
 * @version : V1.0
 */
@Repository
public interface ProductDao {
     List<Product> listByPage(int start,int count);
     List<Product> listAll();
}
