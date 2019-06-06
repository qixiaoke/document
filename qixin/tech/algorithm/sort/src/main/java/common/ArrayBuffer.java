package common;

import java.util.Arrays;

/**
 * Created by qixin on 2017/12/12.
 */
public class ArrayBuffer {
    private int[] input;
    private long useTime;

    public ArrayBuffer(int[] input, long useTime) {
        this.input = input;
        this.useTime = useTime;
    }

    @Override
    public String toString() {
        return Arrays.toString(input) + ", " + useTime;
    }
}
