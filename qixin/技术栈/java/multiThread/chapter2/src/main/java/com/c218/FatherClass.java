package com.c218;

/**
 * Created by qixin on 2017/7/23.
 */
public class FatherClass {

    public synchronized void syncFunc() {
        try {
            System.out.println("syncFunc start. Thread.currentThread().getName(): " + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("syncFunc end. Thread.currentThread().getName(): " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
