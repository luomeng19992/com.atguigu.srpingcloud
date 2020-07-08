package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface FeignService {

    @GetMapping("/payment/get/{id}")
    public CommResult getPaymentById1111111111111111(@PathVariable("id") Long id);
}
