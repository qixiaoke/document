package com.manualThreadLocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qixin on 2017/8/19.
 */
public class ManualThreadLocal<T> {
    private Map<Thread, T> threadVariableMap = Collections.synchronizedMap(new HashMap<Thread, T>());

    protected T initialValue() {
        return null;
    }

    public void set(T variable) {
        threadVariableMap.put(Thread.currentThread(), variable);
    }

    public T get() {
        // 操作当前线程，不存在并发情况
        Thread currentThread = Thread.currentThread();
        if(!threadVariableMap.containsKey(currentThread)) {
            threadVariableMap.put(currentThread, initialValue());
        }
        return threadVariableMap.get(currentThread);
    }
}
