package com;

import java.util.concurrent.TimeUnit;

/**
 * Created by qixin on 2017/7/9.
 */
public class LockA implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                synchronized (DeadLockTest.objA) {
                    System.out.println("LockA lockA" + System.currentTimeMillis());
                    TimeUnit.SECONDS.sleep(3);
                    synchronized (DeadLockTest.objB) {
                        System.out.println("LockA lockB" + System.currentTimeMillis());
                        TimeUnit.SECONDS.sleep(3);
                        ;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
