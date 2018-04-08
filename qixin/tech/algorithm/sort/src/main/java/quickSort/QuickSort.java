package quickSort;

import common.Sort;

/**
 * Created by qixin on 2017/12/13.
 */
public class QuickSort extends Sort {

    @Override
    public int[] smallToBig(int[] input) {
        if(input == null || input.length == 0) {
            throw new NullPointerException("input is null");
        }

        sort(0, input.length - 1, input);

        return input;
    }

    private void sort(int left, int right, int[] input) {
        if(left >= right) {
            return;
        }

        int privot = partition(left, right, input);
        sort(left, privot, input);
        sort(privot + 1, right, input);
    }

    private int partition(int leftIndex, int rightIndex, int[] input) {
        double base = input[leftIndex];
        while (leftIndex < rightIndex) {
            while (input[leftIndex] < base) {
                leftIndex++;
            }
            while (input[rightIndex] > base) {
                rightIndex--;
            }
            if(leftIndex < rightIndex) {
                int temp = input[leftIndex];
                input[leftIndex] = input[rightIndex];
                input[rightIndex] = temp;
            }
        }
        return leftIndex;
    }
}
