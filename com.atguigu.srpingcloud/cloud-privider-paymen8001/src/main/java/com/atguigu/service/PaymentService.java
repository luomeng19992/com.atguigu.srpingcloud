package com.atguigu.service;


import com.atguigu.springcloud.entities.Payment;

public interface PaymentService {

    public Integer createPayment(Payment Payment);
    public Payment getPaymentById( Long id);
}
