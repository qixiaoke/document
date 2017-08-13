package com;

import sun.misc.ProxyGenerator;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * Created by qixin on 2017/8/13.
 */
public class Launchy {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        DynamicProxy proxy = new DynamicProxy(hello);

        Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), proxy);
        helloProxy.sayHello(1);

        createClassFile("proxyClassName", hello.getClass().getInterfaces());
    }

    public static void createClassFile(String proxyClassName, Class<?>[] interfaces) {
        byte[] bytes = ProxyGenerator.generateProxyClass(proxyClassName, interfaces);
        try {
            FileOutputStream os = new FileOutputStream(proxyClassName + ".class");
            BufferedOutputStream bos = new BufferedOutputStream(os);
            bos.write(bytes);

            bos.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
