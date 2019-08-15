package com.meyacom.stone.amqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
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

    @Autowired
    private AmqpAdmin amqpAdmin;

    @Test
    public void sendTest() {
//        rabbitTemplate.convertAndSend("hello.world.queue", "gaga");
//        Queue queue = new Queue("cc.task.flow.start");
//        amqpAdmin.declareQueue(queue);
//        Binding binding = new Binding("cc.task.flow.start", Binding.DestinationType.QUEUE,
//                "", "cc.task.flow.start", null);
//        amqpAdmin.declareBinding(binding);
        rabbitTemplate.convertAndSend("cc.task.flow.start", "gaga");
        rabbitTemplate.convertAndSend("amq.direct","cc.task.flow.start", "gaga");
    }

    @Test
    public void receiveTest() {
        String rs = rabbitTemplate.receiveAndConvert("hello.world.queue").toString();
        System.out.println(rs);
    }
}
