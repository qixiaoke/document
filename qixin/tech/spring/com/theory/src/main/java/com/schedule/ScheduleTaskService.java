package com.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by qixin on 2018/2/13.
 */
@Service
public class ScheduleTaskService {

    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime() {
        System.out.println(new Date());
    }
}
