import java.util.ArrayList;
import java.util.List;

/**
 * Created by qixin on 2018/3/7.
 */
public class GCTest {

    private final static int BYTE_SIZE = 8 * 1024 * 1024;

    public static void main(String []args) throws InterruptedException {

        // -Xmn10m -Xms20m -Xmx20m -XX:+PrintGCDetails Hello
        Thread.sleep(30000);
        System.out.println("start");
        while (true) {

            List<Object> List = new ArrayList<>();
            for(int i = 0 ; i < 2 ; i ++) {
                System.out.println(i);
                List.add(new byte[BYTE_SIZE]);
                Thread.sleep(10000);
            }
        }



    }

}
