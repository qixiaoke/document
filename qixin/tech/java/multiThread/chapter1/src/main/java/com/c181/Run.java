package com.c181;

/**
 * Created by qixin on 2017/7/23.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.suspend();
            System.out.println("main end");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
