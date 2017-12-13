package selection;

import common.Sort;

/**
 * Created by qixin on 2017/12/12.
 */
public class Selection extends Sort {
    public int[] smallToBig(int[] input) {
        if(input == null || input.length == 0) {
            throw new NullPointerException("input is null");
        }

        for(int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < input.length - 1; j++) {
                if(input[minIndex] > input[j + 1]) {
                    minIndex = j + 1;
                }
            }
            if(minIndex != i) {
                int temp = input[i];
                input[i] = input[minIndex];
                input[minIndex] = temp;
            }
        }

        return input;
    }
}
