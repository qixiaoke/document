/**
 * -Xss128k
 * Created by qixin on 2017/9/10.
 */
public class StackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackSOF stackSOF = new StackSOF();
        try {
            stackSOF.stackLeak();
        } catch (Throwable e) {
            System.out.println("stackLength= " + stackSOF.stackLength);
            throw e;
        }
    }
}
