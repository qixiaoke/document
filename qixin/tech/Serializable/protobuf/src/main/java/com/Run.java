package com;

import com.message.PersonProtos.Person;
/**
 * Created by qixin on 2017/8/24.
 */
public class Run {
    public static void main(String[] args) {
        Person.Builder personBuilder = Person.newBuilder();
        personBuilder.setEmail("test@gmail.com");
        personBuilder.setId(1000);

        personBuilder.setName("张三");

        Person person = personBuilder.build();
    }
}
