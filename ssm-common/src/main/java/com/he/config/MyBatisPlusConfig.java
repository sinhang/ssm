package com.he.config;

import com.baomidou.mybatisplus.mapper.ISqlInjector;
import com.baomidou.mybatisplus.mapper.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.he.mapper*")
public class MyBatisPlusConfig {


    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }

}
