package com.meyacom.stone.amqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * desc:
 * author: as
 * date: 2019/8/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AmqpTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void sendTest() {
//        rabbitTemplate.convertAndSend("hello.world.queue", "gaga");
        rabbitTemplate.convertAndSend("amq.direct", "hello.world.queue", "gaga");
    }

    @Test
    public void receiveTest() {
        String rs = rabbitTemplate.receiveAndConvert("hello.world.queue").toString();
        System.out.println(rs);
    }
}
