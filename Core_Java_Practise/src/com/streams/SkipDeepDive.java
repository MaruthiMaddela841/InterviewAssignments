package com.streams;

import java.util.*;
import java.util.stream.*;

public class SkipDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50, 60, 70);


        // =====================================================
        // Example 1: Basic skip()
        // =====================================================

        System.out.println("Example 1: Basic skip()");

        numbers.stream()
                .skip(3)
                .forEach(System.out::println);


        // =====================================================
        // Example 2: skip(0)
        // =====================================================

        System.out.println("\nExample 2: skip(0)");

        numbers.stream()
                .skip(0)
                .forEach(System.out::println);


        // =====================================================
        // Example 3: skip() greater than size
        // =====================================================

        System.out.println("\nExample 3: skip() > size");

        numbers.stream()
                .skip(100)
                .forEach(System.out::println);


        // =====================================================
        // Example 4: skip() + limit()
        // =====================================================

        System.out.println("\nExample 4: skip() + limit()");

        numbers.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);


        // =====================================================
        // Example 5: limit() + skip()
        // =====================================================

        System.out.println("\nExample 5: limit() + skip()");

        numbers.stream()
                .limit(5)
                .skip(2)
                .forEach(System.out::println);


        // =====================================================
        // Example 6: filter() + skip()
        // =====================================================

        System.out.println("\nExample 6: filter() + skip()");

        numbers.stream()
                .filter(n -> n > 20)
                .skip(2)
                .forEach(System.out::println);


        // =====================================================
        // Example 7: skip() + filter()
        // =====================================================

        System.out.println("\nExample 7: skip() + filter()");

        numbers.stream()
                .skip(2)
                .filter(n -> n > 20)
                .forEach(System.out::println);


        // =====================================================
        // Example 8: map() + skip()
        // =====================================================

        System.out.println("\nExample 8: map() + skip()");

        numbers.stream()
                .map(n -> n * 2)
                .skip(3)
                .forEach(System.out::println);


        // =====================================================
        // Example 9: skip() + map()
        // =====================================================

        System.out.println("\nExample 9: skip() + map()");

        numbers.stream()
                .skip(3)
                .map(n -> n * 2)
                .forEach(System.out::println);


        // =====================================================
        // Example 10: sorted() + skip()
        // =====================================================

        System.out.println("\nExample 10: sorted() + skip()");

        List<Integer> unsorted =
                Arrays.asList(
                        50, 10, 80, 20, 40, 30, 70
                );

        unsorted.stream()
                .sorted()
                .skip(2)
                .forEach(System.out::println);


        // =====================================================
        // Example 11: skip() + sorted()
        // =====================================================

        System.out.println("\nExample 11: skip() + sorted()");

        unsorted.stream()
                .skip(2)
                .sorted()
                .forEach(System.out::println);


        // =====================================================
        // Example 12: distinct() + skip()
        // =====================================================

        System.out.println("\nExample 12: distinct() + skip()");

        Arrays.asList(
                10, 20, 20, 30, 30, 40, 50
        )
                .stream()
                .distinct()
                .skip(2)
                .forEach(System.out::println);


        // =====================================================
        // Example 13: skip() + distinct()
        // =====================================================

        System.out.println("\nExample 13: skip() + distinct()");

        Arrays.asList(
                10, 20, 20, 30, 30, 40, 50
        )
                .stream()
                .skip(2)
                .distinct()
                .forEach(System.out::println);


        // =====================================================
        // Example 14: peek() + skip()
        // =====================================================

        System.out.println("\nExample 14: peek() + skip()");

        numbers.stream()
                .peek(n ->
                        System.out.println("Processing: " + n))
                .skip(3)
                .forEach(System.out::println);


        // =====================================================
        // Example 15: count after skip()
        // =====================================================

        System.out.println("\nExample 15: count()");

        long count =
                numbers.stream()
                        .skip(3)
                        .count();

        System.out.println("Count = " + count);


        // =====================================================
        // Example 16: reduce after skip()
        // =====================================================

        System.out.println("\nExample 16: reduce()");

        int sum =
                numbers.stream()
                        .skip(2)
                        .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum);


        // =====================================================
        // Example 17: Pagination
        // =====================================================

        System.out.println("\nExample 17: Pagination");

        int pageNumber = 3;
        int pageSize = 2;

        numbers.stream()

                .skip((long) (pageNumber - 1) * pageSize)

                .limit(pageSize)

                .forEach(System.out::println);


        // =====================================================
        // Example 18: Second page
        // =====================================================

        System.out.println("\nExample 18: Page 2");

        pageNumber = 2;
        pageSize = 3;

        numbers.stream()

                .skip((long) (pageNumber - 1) * pageSize)

                .limit(pageSize)

                .forEach(System.out::println);


        // =====================================================
        // Example 19: Remove first N elements
        // =====================================================

        System.out.println("\nExample 19: Remove first 4");

        numbers.stream()
                .skip(4)
                .forEach(System.out::println);


        // =====================================================
        // Example 20: Infinite Stream
        // =====================================================

        System.out.println("\nExample 20: Infinite Stream");

        Stream.iterate(
                1,
                n -> n + 1
        )

        .skip(10)
        .limit(5)

        .forEach(System.out::println);


        // =====================================================
        // Example 21: Parallel Stream
        // =====================================================

        System.out.println("\nExample 21: Parallel Stream");

        numbers.parallelStream()
                .skip(3)
                .forEach(System.out::println);


        // =====================================================
        // Example 22: Top 3 after sorting
        // =====================================================

        System.out.println("\nExample 22: 4th to 6th highest");

        numbers.stream()

                .sorted(Comparator.reverseOrder())

                .skip(3)

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 23: Second highest
        // =====================================================

        System.out.println("\nExample 23: Second highest");

        numbers.stream()

                .sorted(Comparator.reverseOrder())

                .skip(1)

                .findFirst()

                .ifPresent(System.out::println);


        // =====================================================
        // Example 24: Skip duplicates
        // =====================================================

        System.out.println("\nExample 24: 3rd unique element");

        Arrays.asList(
                10, 10, 20, 20, 30, 40, 40
        )

        .stream()

        .distinct()

        .skip(2)

        .findFirst()

        .ifPresent(System.out::println);

    }
}
