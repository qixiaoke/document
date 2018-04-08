package com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qixin on 2017/7/21.
 */
public class Launchy {
    public static void main(String[] args) {
        Key key = new Key(1);
        Value value = new Value("2");

        Map<Key, Value> map = new HashMap<Key, Value>();
        map.put(key, value);
        System.out.println(map.containsKey(key));

        map.put(new Key(2), new Value("3"));
        System.out.println(map.containsKey(new Key(2)));
    }
}
