package com.he.cron;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class TestCron {

    @Scheduled(cron = "20 0/1 * * * ? ")
    public void cron() {
        Date date = new Date();
        log.error("cron: {}", date);
    }

}
