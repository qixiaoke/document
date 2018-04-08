package com.taskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by qixin on 2018/2/13.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(int i) {
        System.out.println("i = " + i);
    }

    public void executeAsyncTaskPlus(int i) {
        System.out.println("i + 1 =" + (i + 1));
    }
}
