package com;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by qixin on 2017/8/19.
 */
public class SequenceAtomicImpl implements Sequence {
    private static AtomicInteger seqNum = new AtomicInteger(0);

    @Override
    public int getNumber() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return seqNum.getAndIncrement();
    }
}
