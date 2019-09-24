package com.wangp.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

//@EnableDiscoveryClient基于spring-cloud-commons,
// @EnableEurekaClient基于spring-cloud-netflix。
//就是如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，
// 如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableZuulProxy
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

}
