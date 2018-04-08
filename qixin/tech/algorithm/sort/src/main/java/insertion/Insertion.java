package insertion;

import common.Sort;

/**
 * Created by qixin on 2017/12/12.
 */
public class Insertion extends Sort {
    public int[] smallToBig(int[] input) {
        if(input == null || input.length == 0) {
            throw new NullPointerException("input is null");
        }

        int arrayLength = input.length;
        for(int i = 0; i < arrayLength; i++) {
            for(int j = i; j > 0; j--) {
                if(input[j] < input[j - 1]) {
                    int temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                }
            }
        }

        return input;
    }
}
