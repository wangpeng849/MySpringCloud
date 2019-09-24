package com.wangp.ribborn_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class RibbornApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbornApplication.class, args);
    }

    @Bean    //并且向程序的ioc注入一个bean: restTemplate
    @LoadBalanced  //表明这个restRemplate开启负载均衡的功能。
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
