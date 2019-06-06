package com;

import java.lang.reflect.Array;

/**
 * Created by qixin on 2017/7/23.
 */
public class Launchy {
    /**
     * int[]可以转换为Object， Object也可以转换为int[]
     */

    public static void main(String[] args) {
        int[] arrayInts = new int[]{1, 2, 3};
        Object objectArray = arrayGrows(arrayInts);
        int[] arrayIntsNew = (int[]) objectArray;

        printArray(arrayInts);
        printArray(arrayIntsNew);
        System.out.println("length: " + arrayInts.length);
        System.out.println("length: " + arrayIntsNew.length);
    }

    public static Object arrayGrows(Object array) {
        Class clazz = array.getClass();
        if(!clazz.isArray()) return null;

        Class type = clazz.getComponentType();
        int length = Array.getLength(array);
        Object arrayObject = Array.newInstance(type, length * 11 / 10 + 10);
        System.arraycopy(array, 0, arrayObject, 0, length);
        return arrayObject;
    }

    public static void printArray(int[] array) {
        System.out.println("\n print array");
        for(int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
