package com.okayokya.catalogService.rabbitmqConsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/***
 * @ClassName: ProductStockConsumer
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/4 18:29
 * @version : V1.0
 */

@Component
@RabbitListener(queues = "Product-stock")
public class ProductStockConsumer {
@RabbitHandler
    public void process(String message){
    System.out.println(message);
    //拿到Productid-stock，更改product表
}
}
