package com.okayokya.catalogService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * @ClassName: CatalogServiceApplication
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/30 17:30
 * @version : V1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.okayokya.catalogService.dao")
@EnableCaching
public class CatalogServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class,args);
    }
}
