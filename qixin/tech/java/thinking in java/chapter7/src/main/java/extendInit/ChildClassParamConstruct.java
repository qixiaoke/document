package extendInit;

/**
 * Created by qixin on 2017/7/22.
 */
public class ChildClassParamConstruct extends FatherClassParamConstruct {
    /**
     * java会自动在子类构造器中插入对父类构造器的调用
     * 没有无参的或默认的父类构造器，子类构造器就要调用super构造父类
     * @param i
     */
    public ChildClassParamConstruct(int i) {
        super(i);
    }

    public static void main(String[] args) {

    }
}
