package controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by qixin on 2017/12/17.
 */
@Component
public class BeanTest implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware,InitializingBean {
    private String arg;

    public BeanTest() {
        System.out.println("BeanTest()");
    }

    public String getArg() {
        System.out.println("BeanTest getArg");
        return arg;
    }

    @Value("abc")
    public void setArg(String arg) {
        System.out.println("BeanTest setArg");
        this.arg = arg;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("setBeanClassLoader");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
