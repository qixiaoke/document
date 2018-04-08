package com;

/**
 * Created by qixin on 2017/8/19.
 */
public class SequenceThreadLocalImpl implements Sequence {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadLocal.set(threadLocal.get() + 1);
        return threadLocal.get();
    }
}
