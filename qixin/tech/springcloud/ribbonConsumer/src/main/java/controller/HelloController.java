package controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by qixin on 2017/12/16.
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return restTemplate.getForObject("http://hello-server/hello", String.class);
    }

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hystrixHello() {
        return restTemplate.getForObject("http://hello-server/hello", String.class);
    }

    public String helloFallback() {
        return "error";
    }
}
