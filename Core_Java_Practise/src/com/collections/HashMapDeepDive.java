package com.collections;
import java.util.*;

public class HashMapDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Constructors
        // ===============================
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>(20);
        HashMap<Integer, String> map3 = new HashMap<>(20, 0.75f);
        HashMap<Integer, String> map4 = new HashMap<>(map1);

        // ===============================
        // 2. Adding Elements
        // ===============================
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        map1.put(2, "Z"); // overwrite

        System.out.println("Map: " + map1);

        // ===============================
        // 3. Null Handling
        // ===============================
        map1.put(null, "X");   // one null key allowed
        map1.put(4, null);     // multiple null values allowed

        System.out.println("With nulls: " + map1);

        // ===============================
        // 4. Accessing Elements
        // ===============================
        System.out.println("Get key 2: " + map1.get(2));
        System.out.println("Get missing key: " + map1.get(100)); // null

        // ===============================
        // 5. containsKey / containsValue
        // ===============================
        System.out.println("Contains key 1? " + map1.containsKey(1));
        System.out.println("Contains value Z? " + map1.containsValue("Z"));

        // ===============================
        // 6. Size & isEmpty
        // ===============================
        System.out.println("Size: " + map1.size());
        System.out.println("Is empty? " + map1.isEmpty());

        // ===============================
        // 7. Removing Elements
        // ===============================
        map1.remove(3);
        map1.remove(2, "Z"); // conditional remove

        System.out.println("After remove: " + map1);

        // ===============================
        // 8. Iteration
        // ===============================
        System.out.println("EntrySet:");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("KeySet:");
        for (Integer key : map1.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (String value : map1.values()) {
            System.out.println(value);
        }

        // ===============================
        // 9. Java 8 Methods
        // ===============================
        map1.putIfAbsent(5, "E");

        map1.compute(1, (k, v) -> v + "_updated");

        map1.computeIfAbsent(6, k -> "F");

        map1.merge(5, "_merged", (oldVal, newVal) -> oldVal + newVal);

        System.out.println("After Java 8 ops: " + map1);

        // ===============================
        // 10. Replace
        // ===============================
        map1.replace(1, "NEW");
        map1.replace(5, "E_merged", "FINAL");

        System.out.println("After replace: " + map1);

        // ===============================
        // 11. Fail-Fast Behavior
        // ===============================
        try {
            for (Integer key : map1.keySet()) {
                map1.put(999, "X"); // modification
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Fail-Fast triggered!");
        }

        // ===============================
        // 12. Hashing Behavior
        // ===============================
        HashMap<String, String> hm = new HashMap<>();
        hm.put("A", "1");
        hm.put("A", "2"); // overwrite

        System.out.println("Duplicate key: " + hm);

        // ===============================
        // 13. Custom Object (Tricky)
        // ===============================
        HashMap<Student, String> studentMap = new HashMap<>();

        studentMap.put(new Student(1, "A"), "X");
        studentMap.put(new Student(1, "A"), "Y"); // duplicate?

        System.out.println("Custom keys: " + studentMap);

        // ===============================
        // 14. Capacity & Load Factor
        // ===============================
        HashMap<Integer, Integer> capacityMap = new HashMap<>(4, 0.75f);

        capacityMap.put(1, 1);
        capacityMap.put(2, 2);
        capacityMap.put(3, 3);
        capacityMap.put(4, 4); // resize may happen

        System.out.println("Capacity grows internally");

        // ===============================
        // 15. LinkedHashMap (Order)
        // ===============================
        Map<Integer, String> linked = new LinkedHashMap<>();
        linked.put(3, "C");
        linked.put(1, "A");
        linked.put(2, "B");

        System.out.println("LinkedHashMap: " + linked);

        // ===============================
        // 16. TreeMap (Sorted)
        // ===============================
        Map<Integer, String> tree = new TreeMap<>();
        tree.put(3, "C");
        tree.put(1, "A");
        tree.put(2, "B");

        System.out.println("TreeMap: " + tree);

        // ===============================
        // 17. Thread Safety
        // ===============================
        Map<Integer, String> syncMap = Collections.synchronizedMap(new HashMap<>());

        System.out.println("Done");
    }
}

// ===============================
// Custom Class (Important)
// ===============================
class Student6 {
    int id;
    String name;

    Student6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Uncomment to fix duplicate key issue
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