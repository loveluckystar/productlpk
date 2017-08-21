package com.netease.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bjlixing on 2017/8/21.
 */
@RestController
public class TestController {
    @Autowired
    @Qualifier("longRedisTemplate")
    private RedisTemplate<String,Long> longRedisTemplate;

    @RequestMapping("/test")
    public String test(){
        return longRedisTemplate.opsForValue().get("aaa")+"";
    }
}
