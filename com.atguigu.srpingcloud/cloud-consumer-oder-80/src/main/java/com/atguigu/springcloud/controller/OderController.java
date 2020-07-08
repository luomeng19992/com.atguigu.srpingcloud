package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OderController {
   // private  static  final  String ODER_URL="http://localhost:8001/";
    //根据服务名称进行服务调用
    private  static  final  String ODER_URL="http://CLOUD-PAYMENT-SERVICE/";
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/consumer/create")
    public CommResult create(Payment payment){
        log.info(">>>>>>>>>>>>>>>"+payment);
        return  restTemplate.postForObject(ODER_URL+"payment/create",payment,CommResult.class);

    }
    @GetMapping("/consumer/get/{id}")
    public CommResult get(@PathVariable("id") Integer id){
        log.info("查询订单");
        return restTemplate.getForObject(ODER_URL+"payment/get/"+id,CommResult.class);

    }
}
