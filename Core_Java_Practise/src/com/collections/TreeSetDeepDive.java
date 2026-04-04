package com.collections;
import java.util.*;

public class TreeSetDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Creating SortedSet (TreeSet)
        // ===============================
        SortedSet<Integer> set = new TreeSet<>();

        // ===============================
        // 2. Adding Elements (Auto Sorted)
        // ===============================
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        System.out.println("SortedSet: " + set);

        // ===============================
        // 3. Duplicate Handling
        // ===============================
        set.add(30); // ignored
        System.out.println("After duplicate: " + set);

        // ===============================
        // 4. Access Methods
        // ===============================
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        // ===============================
        // 5. Range Views
        // ===============================
        System.out.println("HeadSet (<30): " + set.headSet(30));
        System.out.println("TailSet (>=30): " + set.tailSet(30));
        System.out.println("SubSet (20-40): " + set.subSet(20, 40));

        // ===============================
        // 6. Iteration (Sorted Order)
        // ===============================
        System.out.println("Iteration:");
        for (Integer i : set) {
            System.out.print(i + " ");
        }

        // ===============================
        // 7. Comparator (Custom Sorting)
        // ===============================
        SortedSet<Integer> descSet = new TreeSet<>(Comparator.reverseOrder());
        descSet.addAll(set);
        System.out.println("\nDescending: " + descSet);

        // ===============================
        // 8. Custom Object (Tricky)
        // ===============================
        SortedSet<Student3> students = new TreeSet<>();
        students.add(new Student3(2, "B"));
        students.add(new Student3(1, "A"));

        System.out.println("Custom objects: " + students);

        // ===============================
        // 9. Null Handling (Important)
        // ===============================
        try {
            set.add(null); // ❌ NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null not allowed!");
        }

        // ===============================
        // 10. Fail-Fast Behavior
        // ===============================
        try {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                set.add(999); // modification
                it.next();
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Fail-Fast triggered!");
        }

        // ===============================
        // 11. Conversion
        // ===============================
        Object[] arr = set.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // ===============================
        // 12. Thread Safety
        // ===============================
        SortedSet<Integer> syncSet = Collections.synchronizedSortedSet(new TreeSet<>());

        System.out.println("Done");
    }
}

// ===============================
// Custom Comparable Class
// ===============================
class Student3 implements Comparable<Student3> {
    int id;
    String name;

    Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Required for TreeSet
    @Override
    public int compareTo(Student3 o) {
        return this.id - o.id; // sort by id
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}