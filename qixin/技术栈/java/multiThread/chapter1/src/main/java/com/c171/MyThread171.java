package com.c171;

/**
 * Created by qixin on 2017/7/23.
 */
public class MyThread171 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("myThread171.start()");
        for(int i = 0; i < 50000; i++) {
            System.out.println("i= " + i);
        }
        System.out.println("myThread171.end()");
    }
}
