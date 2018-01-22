package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by qixin on 2018/1/21.
 */
@SpringBootApplication
//@EnableEurekaClient
//@RibbonClient(name = "provider", configuration = Myconfig.class)
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
