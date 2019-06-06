package com;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by qixin on 2017/8/24.
 */
public class Run {

    private Timer timer;
    private ScheduledExecutorService scheduledExecutorService;
    private long startTime;

    public Run() {
        timer = new Timer();
        scheduledExecutorService = Executors.newScheduledThreadPool(2);
        startTime = System.currentTimeMillis();
    }

    public void timeSchedule(long delay) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("run timeSchedule time = " + (System.currentTimeMillis() - startTime));
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, delay);
    }

    public void timeScheduleException(long delay) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("run timeScheduleException time = " + (System.currentTimeMillis() - startTime));
                throw new RuntimeException("123");
            }
        }, delay);
    }

    public void timeScheduleExecutor(long delay) {
        scheduledExecutorService.schedule(new Runnable() {
            public void run() {
                System.out.println("run scheduledExecutorService time = " + (System.currentTimeMillis() - startTime));
                try {
                    TimeUnit.MILLISECONDS.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, delay, TimeUnit.MILLISECONDS);
    }

    public void timeScheduleExecutorException(long delay) {
        scheduledExecutorService.schedule(new Runnable() {
            public void run() {
                System.out.println("run scheduledExecutorService time = " + (System.currentTimeMillis() - startTime));
                throw new RuntimeException("123");
            }
        }, delay, TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) {
        Run run = new Run();
        /////////////////////////////////////////////////////////////////
//        run.timeSchedule(1000);
        // 由于第一个定时器sleep4秒，第二个定时器延迟会有缺陷
//        run.timeSchedule(3000);

        /////////////////////////////////////////////////////////////////
//        run.timeScheduleException(1000);
        // 由于第一个定时器抛出异常，定时器无法捕捉，直接退出
//        run.timeScheduleException(3000);

        /////////////////////////////////////////////////////////////////
        // 解决定时器延迟缺陷， 因为scheduledExecutorService = Executors.newScheduledThreadPool(2);
        // 如果改为单线程scheduledExecutorService = Executors.newScheduledThreadPool(1); 就跟timer差不多了
        run.timeScheduleExecutor(1000);
        run.timeScheduleExecutor(3000);

        ////////////////////////////////////////////////////////////////
        // 解决定时器无法捕捉异常的缺陷
//        run.timeScheduleExecutorException(1000);
//        run.timeScheduleExecutorException(3000);

    }
}
