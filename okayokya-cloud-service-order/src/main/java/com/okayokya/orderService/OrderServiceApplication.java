package com.okayokya.orderService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * @ClassName: OrderServiceApplication
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/12/1 17:29
 * @version : V1.0
 */
@EnableCaching
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.okayokya.orderService.dao")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class,args);
    }
}
