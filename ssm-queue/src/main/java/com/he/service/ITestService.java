package com.he.service;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;

public interface ITestService {

//    @RabbitListener(queues = "${mq.queue}")
    void receive(Message payload, Channel channel,
                 @Header(AmqpHeaders.DELIVERY_TAG) long tag);
}
