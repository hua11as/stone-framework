package com.meyacom.stone.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * desc:
 * author: as
 * date: 2019/8/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void writeTest() {
        redisTemplate.opsForValue().set("as", "as haha");
    }

    @Test
    public void readTest() {
        String rs = redisTemplate.opsForValue().get("as");
        System.out.println(rs);
    }
}
