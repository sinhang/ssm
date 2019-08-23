package com.he.component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
//@PropertySource("mq.properties")
@ConfigurationProperties(prefix = "mq")
public class RabbitMQComponent {

    private String routeKey;

    private String defaultExchange;

    private String queue;

}
