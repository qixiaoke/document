package com;

/**
 * Created by qixin on 2018/1/22.
 */
public class HelloMain {
    public static void main(String[] args) {
        String normalUrl = "http://localhost:8080/normalHello";
        HelloCommand command = new HelloCommand(normalUrl);
        String result = command.execute();
        System.out.println("result = " + result);
    }
}
