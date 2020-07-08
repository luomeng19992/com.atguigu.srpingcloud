package com.atguigu.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymenDao {
    public Integer createPayment(Payment Payment);
    public Payment getPaymentById(@Param("id") Long id);
}
