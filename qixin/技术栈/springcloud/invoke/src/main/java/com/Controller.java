package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by qixin on 2018/1/21.
 */
@RestController
@Configuration
public class Controller {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplet() {
        return new RestTemplate();
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/router")
    public String invoke() {
        return getRestTemplet().getForObject("http://provider/person/1", String.class);
//        List<String> services = discoveryClient.getServices();
//        for(String service : services) {
//            System.out.println(service);
//        }

//        return "";
    }

    @GetMapping("/router1")
    public String metaData() {
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("provider");
        for(ServiceInstance service : serviceInstances) {
            System.out.println(service.getMetadata().get("company-name"));
        }
        return "";
    }
}
