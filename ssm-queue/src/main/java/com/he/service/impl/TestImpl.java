package com.he.service.impl;

import com.he.service.ITestService;
import com.he.utils.mq.RabbitMQUtil;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestImpl implements ITestService {

    @Override
    @RabbitListener(queues = "${mq.queue}")
    public void receive(Message payload, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) {
        log.info("消费内容为: {}", payload);
        RabbitMQUtil.askMessage(channel, tag);
    }
}
