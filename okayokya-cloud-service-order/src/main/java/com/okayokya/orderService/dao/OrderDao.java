package com.okayokya.orderService.dao;

import com.okayokya.orderService.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {

    Order select1();
    int createOrder(Order order);
    Order selectByUserIdAndStatus(int userId,String status);
}
