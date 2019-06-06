package com.reentrantCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qixin on 2017/9/3.
 */
public class ReenterConditionLock implements Runnable {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    @Override
    public void run() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " enter lock");
        try {
            // await后交出lock锁
            System.out.println(Thread.currentThread().getName() + " await");
            condition.await();
            System.out.println(Thread.currentThread().getName() + " is going on");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
    }

    public void signal() {
        condition.signal();
    }

    public void signalAll() {
        condition.signalAll();
    }
}
