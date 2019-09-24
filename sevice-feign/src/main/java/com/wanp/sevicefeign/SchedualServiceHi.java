package com.wanp.sevicefeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@ FeignClient（“服务名”）
@FeignClient(value="service-hi-farling",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value="/hi",method= RequestMethod.GET)
    String SayHiFromClientOne(@RequestParam(value="name") String name);
}
