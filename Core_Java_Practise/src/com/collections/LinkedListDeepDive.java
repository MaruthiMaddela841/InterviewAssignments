package com.collections;

import java.util.*;

public class LinkedListDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Constructors
        // ===============================
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>(list1);

        // ===============================
        // 2. Adding Elements
        // ===============================
        list1.add(10);
        list1.add(20);
        list1.add(30);

        list1.addFirst(5);
        list1.addLast(40);

        list1.add(2, 15); // insert at index

        System.out.println("Add: " + list1);

        // ===============================
        // 3. Accessing Elements
        // ===============================
        System.out.println("Get index 2: " + list1.get(2));
        System.out.println("First: " + list1.getFirst());
        System.out.println("Last: " + list1.getLast());

        // ===============================
        // 4. Updating Elements
        // ===============================
        list1.set(2, 99);
        System.out.println("After set: " + list1);

        // ===============================
        // 5. Removing Elements
        // ===============================
        list1.removeFirst();
        list1.removeLast();
        list1.remove(1); // index
        list1.remove(Integer.valueOf(30)); // object

        System.out.println("After remove: " + list1);

        // ===============================
        // 6. Size & Contains
        // ===============================
        System.out.println("Size: " + list1.size());
        System.out.println("Contains 99? " + list1.contains(99));

        // ===============================
        // 7. Iteration
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

        System.out.println("\nDescending Iterator:");
        Iterator<Integer> dit = list1.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }

        // ===============================
        // 8. Queue Behavior
        // ===============================
        list1.offer(100);      // add to end
        list1.offerFirst(1);   // add to front
        list1.offerLast(200);  // add to end

        System.out.println("\nQueue: " + list1);

        System.out.println("Peek: " + list1.peek()); // first element
        System.out.println("Poll: " + list1.poll()); // remove first

        // ===============================
        // 9. Stack Behavior
        // ===============================
        list1.push(500); // add to front
        System.out.println("After push: " + list1);

        System.out.println("Pop: " + list1.pop()); // remove from front

        // ===============================
        // 10. Null & Duplicates
        // ===============================
        list1.add(null);
        list1.add(99);
        System.out.println("With null & duplicates: " + list1);

        // ===============================
        // 11. Fail-Fast
        // ===============================
        try {
            Iterator<Integer> iterator = list1.iterator();
            while (iterator.hasNext()) {
                list1.add(999); // modification
                iterator.next();
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Fail-Fast triggered!");
        }

        // ===============================
        // 12. SubList (Tricky)
        // ===============================
        List<Integer> sub = list1.subList(0, 2);
        System.out.println("SubList: " + sub);

        list1.set(0, 777);
        System.out.println("After modifying original: " + sub);

        // ===============================
        // 13. RemoveIf & Streams
        // ===============================
        list1.removeIf(x -> x != null && x > 100);
        System.out.println("After removeIf: " + list1);

        list1.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        // ===============================
        // 14. Thread Safety
        // ===============================
        List<Integer> syncList = Collections.synchronizedList(new LinkedList<>());

        // ===============================
        // 15. Performance Demo
        // ===============================
        LinkedList<Integer> perf = new LinkedList<>();

        // fast insert at beginning
        perf.addFirst(1);

        // slow random access
        perf.add(2);
        System.out.println("Access (O(n)): " + perf.get(1));

        System.out.println("Done");
    }
}
