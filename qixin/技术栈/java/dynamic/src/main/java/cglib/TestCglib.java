package cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by qixin on 2018/1/22.
 */
public class TestCglib {
    public static void main(String args[]) throws Exception {
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
        enhancer.setCallback(new TargetInterceptor());
        TargetObject targetObject2=(TargetObject)enhancer.create();
        System.out.println(targetObject2);
        System.out.println(targetObject2.method1("mmm1"));
        System.out.println(targetObject2.method2(100));
        System.out.println(targetObject2.method3(200));

//        DefaultGeneratorStrategy strategy = new DefaultGeneratorStrategy();
//        net.sf.cglib.core.KeyFactory.Generator gen = new net.sf.cglib.core.KeyFactory.Generator();
//
//        byte[] data = strategy.generate(gen);
//
//        String name = "ProxySubject";
//        FileOutputStream out =null;
//        try {
//            out = new FileOutputStream(name+".class");
//            System.out.println((new File("hello")).getAbsolutePath());
//            out.write(data);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(null!=out) try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
