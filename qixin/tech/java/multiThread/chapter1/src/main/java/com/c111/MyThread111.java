package com.c111;

/**
 * Created by qixin on 2017/7/23.
 */
public class MyThread111 extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 50000; i++) {
            System.out.println("i= " + i);
        }
    }
}
