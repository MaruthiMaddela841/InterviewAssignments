package com.collections;
import java.util.concurrent.*;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "A");
        map.put(2, "B");

        map.putIfAbsent(2, "C"); // won't replace
        map.replace(1, "Z");

        System.out.println(map);

        // Safe iteration
        for (Integer key : map.keySet()) {
            map.put(3, "X"); // no exception
        }

        System.out.println("Done");
    }
}