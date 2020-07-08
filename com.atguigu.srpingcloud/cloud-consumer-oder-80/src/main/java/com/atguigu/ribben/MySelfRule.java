package com.atguigu.ribben;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    //根据ribben自定义 负载均衡随机规则  Irule为顶级接口 默认轮询机制
    @Bean
    public IRule getRandomRule(){
        return new RandomRule();
    }
}
