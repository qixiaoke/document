package com;

import java.util.concurrent.TimeUnit;

/**
 * Created by qixin on 2017/7/9.
 */
public class LockB implements Runnable {
    public void run() {
        try {
            while (true) {
                synchronized (DeadLockTest.objB) {
                    System.out.println("LockB lockB" + System.currentTimeMillis());
                    TimeUnit.SECONDS.sleep(3);
                    synchronized (DeadLockTest.objA) {
                        System.out.println("LockB lockA" + System.currentTimeMillis());
                        TimeUnit.SECONDS.sleep(3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
