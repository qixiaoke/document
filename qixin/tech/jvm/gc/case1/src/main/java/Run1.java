/**
 * Created by qixin on 2017/10/14.
 */
public class Run1 {
    public static void main(String[] args) {
        // -Xms64M -Xmx64M -XX:+PrintGCDetails
//        for(int i = 0; i < 5; i++) {
//            byte[] b = new byte[1024*1024];
//        }

        // -Xms1024M -Xmx1024M -XX:+UseSerialGC -XX:MaxTenuringThreshold=15 -XX:+PrintGCDetails
        for(int k = 0; k < 20; k++) {
            for(int j = 0; j < 300; j++) {
                byte[] b = new byte[1024*1024];
            }
        }
    }
}
