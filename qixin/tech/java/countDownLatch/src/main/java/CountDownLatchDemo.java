import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by qixin on 2017/9/3.
 */
public class CountDownLatchDemo implements Runnable {
    private static CountDownLatch countDownLatch =  new CountDownLatch(10);

    @Override
    public void run() {
        System.out.println("count");
        countDownLatch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatchDemo demo = new CountDownLatchDemo();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 10; i++) {
            executorService.submit(demo);
        }
        countDownLatch.await();
        System.out.println("go");
        executorService.shutdown();
    }
}
