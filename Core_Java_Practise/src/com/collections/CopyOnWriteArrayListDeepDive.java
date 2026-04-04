package com.collections;
import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteArrayListDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Creation
        // ===============================
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // ===============================
        // 2. Adding Elements
        // ===============================
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List: " + list);

        // ===============================
        // 3. Iteration (Fail-Safe)
        // ===============================
        for (Integer i : list) {
            System.out.print(i + " ");
            list.add(100); // allowed!
        }

        System.out.println("\nAfter iteration: " + list);

        // ===============================
        // 4. Removing Elements
        // ===============================
        list.remove(Integer.valueOf(20));
        System.out.println("After remove: " + list);

        // ===============================
        // 5. Read Operations (Fast)
        // ===============================
        System.out.println("Get index 1: " + list.get(1));

        // ===============================
        // 6. Size & Contains
        // ===============================
        System.out.println("Size: " + list.size());
        System.out.println("Contains 10? " + list.contains(10));

        // ===============================
        // 7. Multi-thread Demo
        // ===============================
        Runnable reader = () -> {
            for (Integer i : list) {
                System.out.println(Thread.currentThread().getName() + " reads " + i);
            }
        };

        Runnable writer = () -> {
            list.add(999);
            System.out.println(Thread.currentThread().getName() + " added 999");
        };

        new Thread(reader).start();
        new Thread(writer).start();

        // ===============================
        // 8. Null & Duplicates
        // ===============================
        list.add(null);
        list.add(10);
        System.out.println("With null & duplicates: " + list);

        // ===============================
        // 9. Bulk Operations
        // ===============================
        list.addAll(Arrays.asList(1, 2, 3));
        list.removeIf(x -> x != null && x > 100);

        System.out.println("After bulk ops: " + list);

        System.out.println("Done");
    }
}