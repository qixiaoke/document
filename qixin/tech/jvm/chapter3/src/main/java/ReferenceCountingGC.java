/**
 * -XX:+PrintGCDetails
 * Created by qixin on 2017/9/10.
 */
public class ReferenceCountingGC {

    public Object instance;

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }
}
