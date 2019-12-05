package com.okayokya.orderService.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @ClassName: RabbitMQConfig
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/4 17:10
 * @version : V1.0
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue queue() {
        return new Queue("Product-stock");
    }

    @Bean
    public Queue queue2() {
        return new Queue("OrderId");
    }
}
