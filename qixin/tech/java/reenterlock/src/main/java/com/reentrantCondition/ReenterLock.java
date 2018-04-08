package com.reentrantCondition;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qixin on 2017/9/1.
 */
public class ReenterLock implements Runnable {
    private static ReentrantLock lock = new ReentrantLock();

    public static int i = 0;

    @Override
    public void run() {
        for(int j = 0; j < 10000; j++) {
            lock.lock();
            i++;
            lock.unlock();
        }
    }
}
