package com.collections;
import java.util.*;

public class LinkedHashSetDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Constructors
        // ===============================
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(20);
        LinkedHashSet<Integer> set3 = new LinkedHashSet<>(20, 0.75f);
        LinkedHashSet<Integer> set4 = new LinkedHashSet<>(set1);

        // ===============================
        // 2. Adding Elements (Maintains Order)
        // ===============================
        set1.add(10);
        set1.add(5);
        set1.add(20);
        set1.add(10); // duplicate ignored

        System.out.println("Set: " + set1); // insertion order

        // ===============================
        // 3. Null Handling
        // ===============================
        set1.add(null);
        System.out.println("With null: " + set1);

        // ===============================
        // 4. Removing Elements
        // ===============================
        set1.remove(5);
        System.out.println("After remove: " + set1);

        // ===============================
        // 5. Contains & Size
        // ===============================
        System.out.println("Contains 20? " + set1.contains(20));
        System.out.println("Size: " + set1.size());

        // ===============================
        // 6. Iteration (Ordered)
        // ===============================
        System.out.println("Iteration:");
        for (Integer i : set1) {
            System.out.print(i + " "); // maintains insertion order
        }

        // ===============================
        // 7. Fail-Fast Behavior
        // ===============================
        try {
            Iterator<Integer> it = set1.iterator();
            while (it.hasNext()) {
                set1.add(999); // modification
                it.next();
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("\nFail-Fast triggered!");
        }

        // ===============================
        // 8. Custom Object (Tricky)
        // ===============================
        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student(1, "A"));
        students.add(new Student(1, "A")); // depends on equals/hashCode

        System.out.println("Custom objects: " + students);

        // ===============================
        // 9. Conversion
        // ===============================
        Object[] arr = set1.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // ===============================
        // 10. Thread Safety
        // ===============================
        Set<Integer> syncSet = Collections.synchronizedSet(new LinkedHashSet<>());

        // ===============================
        // 11. Compare with HashSet
        // ===============================
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(20);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + set1);

        System.out.println("Done");
    }
}

// ===============================
// Custom Class
// ===============================
class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Uncomment to avoid duplicates
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id && Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    */

    @Override
    public String toString() {
        return id + "-" + name;
    }
}