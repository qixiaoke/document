package com.aop;

import java.lang.annotation.*;

/**
 * Created by qixin on 2018/2/15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
