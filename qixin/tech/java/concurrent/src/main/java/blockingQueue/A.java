package blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by qixin on 2018/3/4.
 */
public class A {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(2);

        queue.put("1");
        queue.put("2");
        queue.put("3");
    }
}
