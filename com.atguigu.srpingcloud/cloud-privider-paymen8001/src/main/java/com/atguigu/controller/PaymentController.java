package com.atguigu.controller;
import com.atguigu.service.PaymentService;
import com.atguigu.springcloud.entities.CommResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class PaymentController {
    @Resource
    PaymentService paymentService;
    @Resource
    DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private  String serverPort;


    @PostMapping(value="/payment/create")
    public CommResult createPayment(@RequestBody Payment payment){

          Integer row=paymentService.createPayment(payment);

        if(row>0){
            log.info("插入成功"+payment);
            return new CommResult(200,"插入成功,serverPort:"+serverPort);

        }

            return new CommResult(444,"插入失败,serverPort:"+serverPort);

    }
    @GetMapping(value = "/payment/get/{id}")
    public CommResult getPaymentById(@PathVariable("id") Long id){
        System.out.println("================="+id);

        Payment paymentById = paymentService.getPaymentById(id);

        if(paymentById != null){
            log.info("查询成功");
            return  new CommResult(200,"查询成功,serverPort:"+serverPort,paymentById);
        }

        return new CommResult(444,"查询失败,serverPort:"+serverPort,null);

    }
    //暴露服务信息
    @GetMapping("/payment/getInfo")
    public Object getServiceInfo(){

        List<String> services = discoveryClient.getServices();

        for (String service :
                services) {
            log.info(">>>>>>>>>>>>>>>"+service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");

        for (ServiceInstance instance:instances
             ) {
            log.info("serviceId:"+instance.getServiceId()+"/t"+"host:"+instance.getHost()+"/t"+
                    "port"+instance.getPort()+"/t"+"uri:"+instance.getUri());
        }


        return discoveryClient;

    }


}
