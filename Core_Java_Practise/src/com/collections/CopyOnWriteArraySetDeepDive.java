package com.collections;
import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteArraySetDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Creation
        // ===============================
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

        // ===============================
        // 2. Adding Elements
        // ===============================
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate ignored

        System.out.println("Set: " + set);

        // ===============================
        // 3. Iteration (Fail-Safe)
        // ===============================
        for (Integer i : set) {
            System.out.print(i + " ");
            set.add(100); // allowed
        }

        System.out.println("\nAfter iteration: " + set);

        // ===============================
        // 4. Removing Elements
        // ===============================
        set.remove(20);
        System.out.println("After remove: " + set);

        // ===============================
        // 5. Contains & Size
        // ===============================
        System.out.println("Contains 10? " + set.contains(10));
        System.out.println("Size: " + set.size());

        // ===============================
        // 6. Multi-thread Demo
        // ===============================
        Runnable reader = () -> {
            for (Integer i : set) {
                System.out.println(Thread.currentThread().getName() + " reads " + i);
            }
        };

        Runnable writer = () -> {
            set.add(999);
            System.out.println(Thread.currentThread().getName() + " added 999");
        };

        new Thread(reader).start();
        new Thread(writer).start();

        // ===============================
        // 7. Null Handling
        // ===============================
        set.add(null);
        System.out.println("With null: " + set);

        // ===============================
        // 8. Bulk Operations
        // ===============================
        set.addAll(Arrays.asList(1, 2, 3));
        set.removeIf(x -> x != null && x > 100);

        System.out.println("After bulk ops: " + set);

        System.out.println("Done");
    }
}