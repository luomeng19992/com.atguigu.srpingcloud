package com.atguigu.service;

import com.atguigu.dao.PaymenDao;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymenDao  paymenDao;

    @Override
    public Integer createPayment(Payment Payment) {
        return paymenDao.createPayment(Payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymenDao.getPaymentById(id);
    }
}
