package com.collections;

import java.util.*;

public class ArrayListDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Constructors
        // ===============================
        ArrayList<Integer> list1 = new ArrayList<>();          // default (capacity 10 internally)
        ArrayList<Integer> list2 = new ArrayList<>(20);        // initial capacity
        ArrayList<Integer> list3 = new ArrayList<>(list1);     // copy constructor

        // ===============================
        // 2. Adding Elements
        // ===============================
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(1, 15); // insert at index

        System.out.println("Add: " + list1);

        // ===============================
        // 3. Accessing Elements
        // ===============================
        System.out.println("Get index 2: " + list1.get(2));

        // ===============================
        // 4. Updating Elements
        // ===============================
        list1.set(2, 25);
        System.out.println("After set: " + list1);

        // ===============================
        // 5. Removing Elements
        // ===============================
        list1.remove(1);               // remove by index
        list1.remove(Integer.valueOf(30)); // remove by object
        System.out.println("After remove: " + list1);

        // ===============================
        // 6. Size & Contains
        // ===============================
        System.out.println("Size: " + list1.size());
        System.out.println("Contains 25? " + list1.contains(25));

        // ===============================
        // 7. Iteration Ways
        // ===============================
        System.out.println("For loop:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println("\nEnhanced for:");
        for (Integer i : list1) {
            System.out.print(i + " ");
        }

        System.out.println("\nIterator:");
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // ===============================
        // 8. Sorting
        // ===============================
        list1.add(5);
        list1.add(100);
        Collections.sort(list1);
        System.out.println("\nSorted: " + list1);

        // ===============================
        // 9. Searching
        // ===============================
        System.out.println("Index of 25: " + list1.indexOf(25));
        System.out.println("Last Index of 25: " + list1.lastIndexOf(25));

        // ===============================
        // 10. Conversion
        // ===============================
        Object[] arr = list1.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // ===============================
        // 11. Null Handling
        // ===============================
        list1.add(null);
        System.out.println("With null: " + list1);

        // ===============================
        // 12. Duplicate Elements
        // ===============================
        list1.add(25);
        System.out.println("Duplicates allowed: " + list1);

        // ===============================
        // 13. Capacity Growth (Concept)
        // ===============================
        ArrayList<Integer> capList = new ArrayList<>(2);
        capList.add(1);
        capList.add(2);
        capList.add(3); // capacity grows (old * 1.5)
        System.out.println("Capacity grows internally");

        // ===============================
        // 14. Fail-Fast Behavior
        // ===============================
        try {
            Iterator<Integer> iterator = list1.iterator();
            while (iterator.hasNext()) {
                list1.add(999); // modifying during iteration
                iterator.next();
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Fail-Fast triggered!");
        }

        // ===============================
        // 15. Thread Safety
        // ===============================
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add(10);

        // ===============================
        // 16. SubList (Tricky)
        // ===============================
        List<Integer> sub = list1.subList(0, 2);
        System.out.println("SubList: " + sub);

        // modifying original list affects sublist
        list1.set(0, 999);
        System.out.println("After modifying original: " + sub);

        // ===============================
        // 17. RemoveIf (Java 8)
        // ===============================
        list1.removeIf(x -> x != null && x > 50);
        System.out.println("After removeIf: " + list1);

        // ===============================
        // 18. Streams (Java 8)
        // ===============================
        list1.stream()
                .filter(x -> x != null)
                .forEach(System.out::println);

        // ===============================
        // 19. Immutable List (Tricky)
        // ===============================
        List<Integer> immutable = List.of(1, 2, 3);
        // immutable.add(4); // ❌ UnsupportedOperationException

        // ===============================
        // 20. Memory Notes
        // ===============================
        ArrayList<Integer> memoryList = new ArrayList<>();
        memoryList.ensureCapacity(100); // pre-allocate
        memoryList.trimToSize();        // reduce unused memory

        System.out.println("Done");
    }
}
