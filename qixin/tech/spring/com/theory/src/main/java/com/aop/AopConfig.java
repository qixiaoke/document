package com.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by qixin on 2018/2/15.
 */
@Configuration
@ComponentScan("com.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
