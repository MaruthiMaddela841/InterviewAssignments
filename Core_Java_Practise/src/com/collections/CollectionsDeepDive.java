package com.collections;
import java.util.*;

public class CollectionsDeepDive {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(30, 10, 20, 40));

        // ===============================
        // 1. Sorting
        // ===============================
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Reverse Sorted: " + list);

        // ===============================
        // 2. Searching
        // ===============================
        Collections.sort(list);
        System.out.println("Binary Search (20): " + Collections.binarySearch(list, 20));

        // ===============================
        // 3. Reversing
        // ===============================
        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        // ===============================
        // 4. Shuffle
        // ===============================
        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        // ===============================
        // 5. Min & Max
        // ===============================
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));

        // ===============================
        // 6. Frequency
        // ===============================
        list.add(10);
        System.out.println("Frequency of 10: " + Collections.frequency(list, 10));

        // ===============================
        // 7. Replace All
        // ===============================
        Collections.replaceAll(list, 10, 99);
        System.out.println("After replace: " + list);

        // ===============================
        // 8. Fill
        // ===============================
        List<Integer> fillList = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collections.fill(fillList, 0);
        System.out.println("Filled: " + fillList);

        // ===============================
        // 9. Copy (Tricky)
        // ===============================
        List<Integer> dest = new ArrayList<>(Arrays.asList(0, 0, 0));
        Collections.copy(dest, fillList);
        System.out.println("Copied: " + dest);

        // ===============================
        // 10. Unmodifiable Collection
        // ===============================
        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        // unmodifiable.add(100); // ❌ UnsupportedOperationException

        // ===============================
        // 11. Synchronized Collection
        // ===============================
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add(10);

        // ===============================
        // 12. Empty Collections
        // ===============================
        List<Integer> empty = Collections.emptyList();
        System.out.println("Empty: " + empty);

        // ===============================
        // 13. Singleton
        // ===============================
        List<Integer> single = Collections.singletonList(100);
        System.out.println("Singleton: " + single);

        // ===============================
        // 14. Swap
        // ===============================
        Collections.swap(list, 0, 1);
        System.out.println("After swap: " + list);

        // ===============================
        // 15. Disjoint (Tricky)
        // ===============================
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        System.out.println("Disjoint? " + Collections.disjoint(l1, l2));

        System.out.println("Done");
    }
}