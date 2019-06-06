package common;

/**
 * Created by qixin on 2017/12/12.
 */
public abstract class Sort {
    public abstract int[] smallToBig(int[] input);

    public ArrayBuffer smallToBig0(int[] input) {
        long current = System.currentTimeMillis();
        int[] output = null;
        for(int i = 0; i < 50000; i++) {
            int[] inputCopy = input.clone();
            output = smallToBig(inputCopy);
        }
        ArrayBuffer arrayBuffer = new ArrayBuffer(output, System.currentTimeMillis() - current);
        return arrayBuffer;
    }
}
