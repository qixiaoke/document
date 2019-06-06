package com.count;

/**
 * Created by qixin on 2017/7/23.
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
        System.out.println("this.getName(): " + this.getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
        System.out.println("this.getName(): " + this.getName());
    }
}
