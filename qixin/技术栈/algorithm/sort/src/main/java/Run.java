import bubble.Bubble;
import common.Print;
import common.Sort;

/**
 * Created by qixin on 2017/12/12.
 */
public class Run {
    public static void main(String[] args) {
        Sort sort = new Bubble();
        Double[] input = {2.0, 4.0, 6.0, 1.0, 5.0, 3.0};
        sort.smallToBig(input);

        Print print = new Print();
        print.printAttr(input);
    }
}
