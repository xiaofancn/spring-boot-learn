package org.snailteam.cloud.zookeeper.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class FeignConsumerClientHystrix implements FeignConsumerClient{
	@HystrixCommand(fallbackMethod = "fallback")
    public String getUser(@RequestParam("id") Long id) {
        return "error";
    }
}