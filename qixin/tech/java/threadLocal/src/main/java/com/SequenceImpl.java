package com;

/**
 * Created by qixin on 2017/8/19.
 */
public class SequenceImpl implements Sequence {
    private static int seqNumber = 0;

    @Override
    public int getNumber() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return seqNumber++;
    }
}
