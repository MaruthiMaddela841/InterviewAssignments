package com.collections;
import java.util.*;

public class IteratorDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Basic Iterator
        // ===============================
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        System.out.println("Traversal:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ===============================
        // 2. Remove using Iterator
        // ===============================
        list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            Integer val = it2.next();
            if (val == 20) {
                it2.remove(); // safe removal
            }
        }
        System.out.println("After remove: " + list);

        // ===============================
        // 3. IllegalStateException (Tricky)
        // ===============================
        try {
            Iterator<Integer> it3 = list.iterator();
            it3.remove(); // ❌ remove before next()
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException triggered!");
        }

        // ===============================
        // 4. Fail-Fast Behavior
        // ===============================
        try {
            Iterator<Integer> it4 = list.iterator();
            while (it4.hasNext()) {
                list.add(999); // ❌ modification outside iterator
                it4.next();
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Fail-Fast triggered!");
        }

        // ===============================
        // 5. Iterator on Set
        // ===============================
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        Iterator<String> sit = set.iterator();
        System.out.println("Set iteration:");
        while (sit.hasNext()) {
            System.out.println(sit.next());
        }

        // ===============================
        // 6. ListIterator (Advanced)
        // ===============================
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        ListIterator<Integer> lit = list2.listIterator();

        System.out.println("Forward:");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        System.out.println("\nBackward:");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }

        // ===============================
        // 7. Modification using ListIterator
        // ===============================
        lit = list2.listIterator();
        while (lit.hasNext()) {
            int val = lit.next();
            if (val == 2) {
                lit.set(99); // replace
                lit.add(100); // add
            }
        }
        System.out.println("\nModified list: " + list2);

        // ===============================
        // 8. forEachRemaining (Java 8)
        // ===============================
        Iterator<Integer> it5 = list2.iterator();
        it5.forEachRemaining(System.out::println);

        // ===============================
        // 9. Empty Iterator
        // ===============================
        Iterator<Object> empty = Collections.emptyIterator();
        System.out.println("Has next? " + empty.hasNext());

        // ===============================
        // 10. Memory Insight
        // ===============================
        System.out.println("Iterator is lightweight (no copy of collection)");

        System.out.println("Done");
    }
}