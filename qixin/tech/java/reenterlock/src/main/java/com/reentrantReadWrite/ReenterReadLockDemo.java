package com.reentrantReadWrite;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by qixin on 2017/9/3.
 */
public class ReenterReadLockDemo {
    private int i;

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    private Lock readLock = reentrantReadWriteLock.readLock();
    private Lock writeLock = reentrantReadWriteLock.writeLock();

    private void read() {
        readLock.lock();
        System.out.println("read: " + i);
        readLock.unlock();
    }

    private void write() {
        writeLock.lock();
        i = new Random().nextInt();
        System.out.println("write: " + i);
        writeLock.unlock();
    }

    public static void main(String[] args) {
        ReenterReadLockDemo demo = new ReenterReadLockDemo();
        for(int j = 0; j < 20; j++) {
            new Thread(() -> {
               demo.read();
            }).start();
            new Thread(() -> {
                demo.write();
            }).start();
        }
    }
}
