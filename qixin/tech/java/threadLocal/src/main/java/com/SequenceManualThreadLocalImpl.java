package com;

import com.manualThreadLocal.ManualThreadLocal;

/**
 * Created by qixin on 2017/8/19.
 */
public class SequenceManualThreadLocalImpl implements Sequence {
    private static ManualThreadLocal<Integer> threadLocal = new ManualThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        int i = threadLocal.get();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadLocal.set(i + 1);
        return threadLocal.get();
    }
}
