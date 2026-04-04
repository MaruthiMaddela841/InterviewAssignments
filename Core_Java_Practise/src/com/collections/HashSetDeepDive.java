package com.collections;
import java.util.*;

public class HashSetDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Constructors
        // ===============================
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>(20);          // initial capacity
        HashSet<Integer> set3 = new HashSet<>(20, 0.75f);   // capacity + load factor
        HashSet<Integer> set4 = new HashSet<>(set1);        // copy

        // ===============================
        // 2. Adding Elements
        // ===============================
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(10); // duplicate (ignored)

        System.out.println("Set: " + set1);

        // ===============================
        // 3. Null Handling
        // ===============================
        set1.add(null); // only one null allowed
        System.out.println("With null: " + set1);

        // ===============================
        // 4. Removing Elements
        // ===============================
        set1.remove(20);
        System.out.println("After remove: " + set1);

        // ===============================
        // 5. Contains
        // ===============================
        System.out.println("Contains 10? " + set1.contains(10));

        // ===============================
        // 6. Size
        // ===============================
        System.out.println("Size: " + set1.size());

        // ===============================
        // 7. Iteration
        // ===============================
        System.out.println("Iteration:");
        for (Integer i : set1) {
            System.out.print(i + " "); // no order guarantee
        }

        System.out.println("\nIterator:");
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // ===============================
        // 8. Fail-Fast Behavior
        // ===============================
        try {
            Iterator<Integer> it2 = set1.iterator();
            while (it2.hasNext()) {
                set1.add(999); // modification
                it2.next();
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("\nFail-Fast triggered!");
        }

        // ===============================
        // 9. Hashing Behavior
        // ===============================
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("A"); // duplicate ignored

        System.out.println("HashSet: " + hs);

        // ===============================
        // 10. Custom Object (Tricky)
        // ===============================
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(1, "A"));
        students.add(new Student(1, "A")); // duplicate? depends on equals & hashCode

        System.out.println("Custom objects: " + students);

        // ===============================
        // 11. Load Factor & Capacity
        // ===============================
        HashSet<Integer> capacitySet = new HashSet<>(4, 0.75f);
        capacitySet.add(1);
        capacitySet.add(2);
        capacitySet.add(3);
        capacitySet.add(4); // resize may happen

        System.out.println("Capacity grows internally");

        // ===============================
        // 12. Conversion
        // ===============================
        Object[] arr = set1.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // ===============================
        // 13. Thread Safety
        // ===============================
        Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());

        // ===============================
        // 14. LinkedHashSet (Order)
        // ===============================
        Set<Integer> linked = new LinkedHashSet<>();
        linked.add(3);
        linked.add(1);
        linked.add(2);

        System.out.println("LinkedHashSet (order): " + linked);

        // ===============================
        // 15. TreeSet (Sorted)
        // ===============================
        Set<Integer> tree = new TreeSet<>();
        tree.add(3);
        tree.add(1);
        tree.add(2);

        System.out.println("TreeSet (sorted): " + tree);

        System.out.println("Done");
    }
}

// ===============================
// Custom Class (Important)
// ===============================
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Uncomment to fix duplicate issue
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