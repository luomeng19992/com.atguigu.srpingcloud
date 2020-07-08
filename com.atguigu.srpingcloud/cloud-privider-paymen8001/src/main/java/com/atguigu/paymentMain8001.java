package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@MapperScan()
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//启动服务暴露
public class paymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(paymentMain8001.class,args);
    }
}

