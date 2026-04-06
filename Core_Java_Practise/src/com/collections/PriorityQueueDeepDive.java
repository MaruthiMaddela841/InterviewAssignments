package com.collections;
import java.util.*;

public class PriorityQueueDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Constructors
        // ===============================
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(pq1);

        // ===============================
        // 2. Adding Elements
        // ===============================
        pq1.add(30);
        pq1.add(10);
        pq1.add(50);
        pq1.add(20);

        System.out.println("PQ: " + pq1); // not sorted!

        // ===============================
        // 3. Peek (Top element)
        // ===============================
        System.out.println("Peek: " + pq1.peek()); // smallest element

        // ===============================
        // 4. Poll (Remove top)
        // ===============================
        System.out.println("Poll: " + pq1.poll());
        System.out.println("After poll: " + pq1);

        // ===============================
        // 5. Iteration (Tricky)
        // ===============================
        System.out.println("Iteration:");
        for (Integer i : pq1) {
            System.out.print(i + " "); // NOT sorted order ❗
        }

        // ===============================
        // 6. Custom Comparator (Max Heap)
        // ===============================
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                (a, b) -> b - a
        );

        maxHeap.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println("\nMaxHeap peek: " + maxHeap.peek());

        // ===============================
        // 7. Contains & Size
        // ===============================
        System.out.println("Contains 20? " + pq1.contains(20));
        System.out.println("Size: " + pq1.size());

        // ===============================
        // 8. Removing specific element
        // ===============================
        pq1.remove(20); // O(n)
        System.out.println("After remove: " + pq1);

        // ===============================
        // 9. Null Handling
        // ===============================
        try {
            pq1.add(null); // ❌
        } catch (NullPointerException e) {
            System.out.println("Null not allowed!");
        }

        // ===============================
        // 10. Custom Object (Tricky)
        // ===============================
        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(new Student(2, "B"));
        students.add(new Student(1, "A"));

        System.out.println("Students PQ: " + students);

        // ===============================
        // 11. Fail-Fast Behavior
        // ===============================
        try {
            for (Integer i : pq1) {
                pq1.add(999); // modification
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Fail-Fast triggered!");
        }

        // ===============================
        // 12. Conversion to sorted order
        // ===============================
        System.out.println("Sorted removal:");
        while (!pq1.isEmpty()) {
            System.out.print(pq1.poll() + " ");
        }

        System.out.println("\nDone");
    }
}

// ===============================
// Custom Comparable Class
// ===============================
class Student7 implements Comparable<Student7> {
    int id;
    String name;

    Student7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student7 o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}