package com.he.config;

import com.he.component.RabbitMQComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
@Slf4j
public class RabbitMQConfig {

    @Autowired
    private RabbitMQComponent rabbitMQComponent;

    @Bean
    public Queue queue() {
        log.info("rabbitMQComponent.getDefaultExchange(): {}", rabbitMQComponent);
        return new Queue(rabbitMQComponent.getQueue(),
                true, false, false);
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(rabbitMQComponent.getDefaultExchange(),
                true, false);
    }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue())
                .to(directExchange())
                .with(rabbitMQComponent.getRouteKey());
    }
}
