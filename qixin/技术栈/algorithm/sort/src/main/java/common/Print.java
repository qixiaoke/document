package common;

/**
 * Created by qixin on 2017/12/12.
 */
public class Print <T> {
    public void printAttr(T[] input) {
        for(T item : input) {
            System.out.println(item + " ");
        }
    }
}
