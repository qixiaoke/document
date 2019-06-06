package com.reentrantCondition;

import java.util.concurrent.TimeUnit;

/**
 * Created by qixin on 2017/9/1.
 */
public class Run {
    public static void main(String[] args) {
        /**
        ReenterReadLockDemo r1 = new ReenterReadLockDemo();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(r1.i);
         **/

        ReenterConditionLock r = new ReenterConditionLock();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.lock();
        r.signalAll();
        r.unlock();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t1 t2 thread end");
    }
}
