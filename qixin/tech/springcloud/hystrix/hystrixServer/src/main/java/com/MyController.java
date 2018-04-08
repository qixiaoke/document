package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qixin on 2018/1/22.
 */
@RestController
public class MyController {

    @GetMapping("/normalHello")
    public String nornalHello() {
        return "hello world";
    }

    @GetMapping("/errorHello")
    public String errorHello() throws InterruptedException {
        Thread.sleep(10000);
        return "error hello world";
    }
}
