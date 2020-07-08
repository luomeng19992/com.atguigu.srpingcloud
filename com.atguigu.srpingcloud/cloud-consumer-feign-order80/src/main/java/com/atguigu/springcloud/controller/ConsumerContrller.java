package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommResult;
import com.atguigu.springcloud.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ConsumerContrller {
    @Resource
    FeignService feignService;

    @GetMapping("/consumer/get/{id}")
    public CommResult FeignTest(@PathVariable("id") Long id){

        return feignService.getPaymentById1111111111111111(id);

    }

}
