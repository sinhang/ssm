package com.he.config;

import com.he.component.RabbitMQComponent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RabbitMQConfigTest {

//    @Autowired
//    private RabbitTemplate rabbitTemplate;

    private AmqpTemplate amqpTemplate;

//    private RabbitMQComponent rabbitMQComponent;

    @Test
    public void testSendMessage() {
//        rabbitTemplate = new RabbitTemplate();
//        log.info("rabbitMQComponent: {}", rabbitTemplate);
        amqpTemplate.convertAndSend(
                "amqpExchange",
                "queue_key", "发送了一条消息");
    }

}