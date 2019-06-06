package com.myLoadBalance;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by qixin on 2018/1/21.
 */
@Configuration
public class MyAutoConfiguration {
    @Autowired(required = false)
    @MyLoadBalance
    private List<RestTemplate> myTemplates = Collections.emptyList();

    @Bean
    public SmartInitializingSingleton myLoadBalanceRestTempleInitializer() {
        System.out.println("初始化");
        return new SmartInitializingSingleton() {
            @Override
            public void afterSingletonsInstantiated() {
                for(RestTemplate tpl : myTemplates) {
                    MyInterceptor mi = new MyInterceptor();
                    List list = new ArrayList(tpl.getInterceptors());
                    list.add(mi);
                    tpl.setInterceptors(list);
                }
            }
        };
    }
}
