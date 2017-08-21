package com.netease.product.component.redis;

import com.netease.product.component.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by bjlixing on 2017/8/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {
    @Autowired
    @Qualifier("longRedisTemplate")
    private RedisTemplate<String,Long> longRedisTemplate;

    @Test
    public void test() throws Exception {
        // 保存字符串
//        longRedisTemplate.opsForValue().set("aaa", 123L);
        Assert.assertEquals(java.util.Optional.ofNullable(Long.parseLong("123")).get(), longRedisTemplate.opsForValue().get("aaa"));
    }
}
