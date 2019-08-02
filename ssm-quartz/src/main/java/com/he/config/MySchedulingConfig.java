package com.he.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//import static java.util.concurrent.Executors.*;
//import static java.util.concurrent.Exchanger.*;
import static java.util.concurrent.Executors.*;

@Configuration
public class MySchedulingConfig implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        //newScheduledThreadPool()
        scheduledTaskRegistrar.setScheduler(newScheduledThreadPool(16));
    }
}
