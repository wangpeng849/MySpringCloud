package com.wanp.sevicefeign;

import org.springframework.stereotype.Component;


/**
 * 熔断器返回参数
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String SayHiFromClientOne(String name) {
        return "sorry ~ "+ name;
    }
}
