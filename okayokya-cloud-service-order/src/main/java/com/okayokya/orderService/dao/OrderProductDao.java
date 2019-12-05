package com.okayokya.orderService.dao;

import com.okayokya.orderService.model.OrderProduct;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductDao {
int addItem(OrderProduct orderProduct);
}
