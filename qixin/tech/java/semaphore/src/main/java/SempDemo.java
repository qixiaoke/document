import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by qixin on 2017/9/3.
 */
public class SempDemo implements Runnable {
    private Semaphore semaphore = new Semaphore(5);

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " run.");
            TimeUnit.MILLISECONDS.sleep(2000);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SempDemo demo = new SempDemo();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 20; i++) {
            executorService.submit(demo);
        }
        executorService.shutdown();
    }
}
