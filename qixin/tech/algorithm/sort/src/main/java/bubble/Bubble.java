package bubble;

import common.Sort;

/**
 * Created by qixin on 2017/12/12.
 */
public class Bubble extends Sort {
    public int[] smallToBig(int[] input) {
        if (input == null || input.length == 0) {
            throw new NullPointerException("input is null");
        }

        int inputLength = input.length;

        for (int i = 0; i < inputLength - 1; i++) {
            boolean sort = true;
            for (int j = 0; j < inputLength - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    sort = false;
                }
            }
            if (sort == true) {
                break;
            }
        }

        return input;
    }
}
