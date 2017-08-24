package com;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by qixin on 2017/8/24.
 */
public class Run {

    private Timer timer;
    private long startTime;

    public Run() {
        timer = new Timer();
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


    public static void main(String[] args) {
        Run run = new Run();
        /////////////////////////////////////////////////////////////////
//        run.timeSchedule(1000);
        // 由于第一个定时器sleep4秒，第二个定时器延迟会有缺陷
//        run.timeSchedule(3000);

        /////////////////////////////////////////////////////////////////
        run.timeScheduleException(1000);
        // 由于第一个定时器抛出异常，定时器无法捕捉，直接退出
        run.timeScheduleException(3000);
    }
}
