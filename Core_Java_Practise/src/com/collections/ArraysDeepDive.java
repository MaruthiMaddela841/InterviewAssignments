package com.collections;
import java.util.*;

public class ArraysDeepDive {

    public static void main(String[] args) {

        int[] arr = {50, 10, 40, 20, 30};

        // ===============================
        // 1. Sorting
        // ===============================
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        // ===============================
        // 2. Binary Search
        // ===============================
        System.out.println("Search 30: " + Arrays.binarySearch(arr, 30));
        System.out.println("Search 25: " + Arrays.binarySearch(arr, 25));

        // ===============================
        // 3. Fill
        // ===============================
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 100);
        System.out.println("Filled: " + Arrays.toString(fillArr));

        // ===============================
        // 4. Copy
        // ===============================
        int[] copy = Arrays.copyOf(arr, 7);
        System.out.println("CopyOf: " + Arrays.toString(copy));

        int[] rangeCopy = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("CopyOfRange: " + Arrays.toString(rangeCopy));

        // ===============================
        // 5. Equals
        // ===============================
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println("Equals: " + Arrays.equals(a, b));

        // ===============================
        // 6. Deep Equals (2D arrays)
        // ===============================
        int[][] x = {{1, 2}, {3, 4}};
        int[][] y = {{1, 2}, {3, 4}};

        System.out.println("Deep Equals: " + Arrays.deepEquals(x, y));

        // ===============================
        // 7. toString
        // ===============================
        System.out.println("toString: " + Arrays.toString(arr));
        System.out.println("DeepToString: " + Arrays.deepToString(x));

        // ===============================
        // 8. Parallel Sort
        // ===============================
        int[] big = {9,8,7,6,5,4,3,2,1};
        Arrays.parallelSort(big);
        System.out.println("Parallel Sorted: " + Arrays.toString(big));

        // ===============================
        // 9. Stream
        // ===============================
        Arrays.stream(arr).forEach(System.out::print);

        // ===============================
        // 10. asList (Tricky)
        // ===============================
        Integer[] nums = {1, 2, 3};
        List<Integer> list = Arrays.asList(nums);

        System.out.println("\nList: " + list);

        // list.add(4); // ❌ UnsupportedOperationException

        // ===============================
        // 11. Mismatch (Java 9)
        // ===============================
        int[] m1 = {1, 2, 3};
        int[] m2 = {1, 2, 4};

        System.out.println("Mismatch index: " + Arrays.mismatch(m1, m2));

        System.out.println("Done");
    }
}