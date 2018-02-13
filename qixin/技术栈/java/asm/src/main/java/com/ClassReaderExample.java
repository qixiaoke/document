package com;

import jdk.internal.org.objectweb.asm.ClassReader;

import java.io.IOException;

/**
 * Created by qixin on 2018/2/6.
 */
public class ClassReaderExample {
    public static void main(String[] args) throws IOException {
        ClassReader classReader = new ClassReader("java.lang.String");
    }
}

