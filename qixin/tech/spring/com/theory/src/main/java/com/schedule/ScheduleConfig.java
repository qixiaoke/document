package com.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by qixin on 2018/2/13.
 */
@Configuration
@ComponentScan("com.schedule")
@EnableScheduling
public class ScheduleConfig {
}
