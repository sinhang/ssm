package com.he.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.PingUrl;
import org.hibernate.validator.internal.util.Contracts;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;

@Configuration
public class MyRobbinFooConfig {

    public IPing robbinPing(IClientConfig config) {
        return new PingUrl();
    }

//    @Bean
//    public Contracts feignContract() {
//        return new feignContract().wait();
//    }
//
//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//        return new BasicAuthRequestInterceptor("user", "password");
//    }
    @Bean
    public BasicAuthorizationInterceptor basicAuthorizationInterceptor() {
        return new BasicAuthorizationInterceptor("user", "padd");
    }

}
