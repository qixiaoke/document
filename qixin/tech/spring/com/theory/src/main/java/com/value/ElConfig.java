package com.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Value注解测试
 * Created by qixin on 2018/2/14.
 */
@Configuration
@ComponentScan("com.value")
@PropertySource("classpath:test.properties")
public class ElConfig {

    @Value("hello")
    private String word;

    @Value("${book.author}")
    private String bookAuthor;

    public void output() {
        System.out.println(word);
        System.out.println(bookAuthor);
    }
}
