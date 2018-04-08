package com.c181;

/**
 * Created by qixin on 2017/7/23.
 */
public class MyThread extends Thread {
    private long i;
    @Override
    public void run() {
        super.run();
        while (true) {
            i++;
            System.out.println("i");
        }
    }
}
