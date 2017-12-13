import bubble.Bubble;
import common.ArrayBuffer;
import common.Sort;
import insertion.Insertion;
import quickSort.QuickSort;
import selection.Selection;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by qixin on 2017/12/12.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final int[] input = {2, 4, 6, 1, 5, 3, 8, 7, 9, 0};
        System.out.println("input" + Arrays.toString(input) + "\n");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(() -> {
            Sort bubbleSort = new Bubble();
            ArrayBuffer bubble = bubbleSort.smallToBig0(input);
            System.out.println("bubbleSort" + bubble);
        });

        executorService.submit(() -> {
            Sort selectionSort = new Selection();
            ArrayBuffer selection = selectionSort.smallToBig0(input);
            System.out.println("selectionSort" + selection);
        });

        executorService.submit(() -> {
            Sort insertionSort = new Insertion();
            ArrayBuffer insertion = insertionSort.smallToBig0(input);
            System.out.println("insertionSort" + insertion);
        });

        executorService.submit(() -> {
            Sort quickSort = new QuickSort();
            ArrayBuffer quick = quickSort.smallToBig0(input);
            System.out.println("quickSort" + quick);
        });

        TimeUnit.SECONDS.sleep(1);
        executorService.shutdown();
    }
}
