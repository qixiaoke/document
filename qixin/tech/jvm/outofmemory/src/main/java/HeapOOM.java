import java.util.*;

/**
 * -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
	static class HeapObject {}

    public static void main(String[] args) {
        List<HeapObject> list = new ArrayList<HeapObject>();
        while (true) {
            list.add(new HeapObject());
        }
    }
}