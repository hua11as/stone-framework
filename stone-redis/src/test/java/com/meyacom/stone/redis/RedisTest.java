package com.meyacom.stone.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
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
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void writeTest() {
//        redisTemplate.opsForValue().set("as", "as haha");
    }

    @Test
    public void readTest() {

        String rs = stringRedisTemplate.opsForValue().get("as");
        System.out.println(rs);
    }

    @Test
    public void zsetTest() {
        stringRedisTemplate.opsForZSet().add("allocation.task.cc", "ads", 100);
//        redisTemplate.opsForZSet().add("asd", "xxxx", 100);
    }
}
