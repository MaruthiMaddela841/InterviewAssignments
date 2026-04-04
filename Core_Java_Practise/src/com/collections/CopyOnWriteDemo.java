package com.collections;
import java.util.concurrent.*;

public class CopyOnWriteDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);

        for (Integer i : list) {
            list.add(30); // allowed
        }

        System.out.println(list);
        
//        CopyOnWriteArraySet: 👉 Same as above but no duplicates
    }
}