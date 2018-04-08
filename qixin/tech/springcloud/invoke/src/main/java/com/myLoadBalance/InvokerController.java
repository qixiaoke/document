package com.myLoadBalance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qixin on 2018/1/21.
 */
@RestController
@Configuration
public class InvokerController {
    @Bean
    @MyLoadBalance
    public RestTemplate getMyRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/myRouter")
    public String router() {
        RestTemplate restTpl = getMyRestTemplate();
        String json = restTpl.getForObject("http://provider/hello", String.class);
        return json;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
