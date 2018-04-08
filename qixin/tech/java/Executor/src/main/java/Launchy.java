import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by qixin on 2017/8/9.
 */
public class Launchy {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newFixedThreadPool(5);

        List<Future<String>> resultList = new ArrayList<Future<String>>();

        for(int i = 0; i < 5; i++) {
//            executorService1.execute(new TestRunnable());
            Future<String> future = executorService.submit(new TaskWithResult(i));
            resultList.add(future);
        }

        for(Future<String> future : resultList) {
            try {
                while (!future.isDone());
                String result = future.get();
                System.out.println(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }
        }
    }
}

class TestRunnable implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + "被调用");
        double i = 1/0;
    }
}

class TaskWithResult implements Callable<String> {
    private int i;

    public TaskWithResult(int i) {
        this.i = i;
    }

    public String call() throws Exception {
        Thread.sleep(2000);
        return Thread.currentThread().getName() + "返回结果:" + i;
    }
}
