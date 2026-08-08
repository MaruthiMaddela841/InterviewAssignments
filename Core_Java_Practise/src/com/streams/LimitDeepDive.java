package com.streams;

import java.util.*;
import java.util.stream.*;

public class LimitDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50, 60, 70);


        // =====================================================
        // Example 1: Basic limit()
        // =====================================================

        System.out.println("Example 1: Basic limit()");

        numbers.stream()
                .limit(3)
                .forEach(System.out::println);


        // =====================================================
        // Example 2: limit() greater than size
        // =====================================================

        System.out.println("\nExample 2: limit() > size");

        numbers.stream()
                .limit(20)
                .forEach(System.out::println);


        // =====================================================
        // Example 3: limit(0)
        // =====================================================

        System.out.println("\nExample 3: limit(0)");

        numbers.stream()
                .limit(0)
                .forEach(System.out::println);


        // =====================================================
        // Example 4: limit(1)
        // =====================================================

        System.out.println("\nExample 4: First element");

        numbers.stream()
                .limit(1)
                .forEach(System.out::println);


        // =====================================================
        // Example 5: filter() + limit()
        // =====================================================

        System.out.println("\nExample 5: filter() + limit()");

        numbers.stream()

                .filter(n -> n > 20)

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 6: limit() + filter()
        // =====================================================

        System.out.println("\nExample 6: limit() + filter()");

        numbers.stream()

                .limit(3)

                .filter(n -> n > 20)

                .forEach(System.out::println);


        // =====================================================
        // Example 7: map() + limit()
        // =====================================================

        System.out.println("\nExample 7: map() + limit()");

        numbers.stream()

                .map(n -> n * 2)

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 8: limit() + map()
        // =====================================================

        System.out.println("\nExample 8: limit() + map()");

        numbers.stream()

                .limit(3)

                .map(n -> n * 2)

                .forEach(System.out::println);


        // =====================================================
        // Example 9: sorted() + limit()
        // =====================================================

        System.out.println("\nExample 9: sorted() + limit()");

        List<Integer> unsorted =
                Arrays.asList(
                        50, 10, 80, 20, 40, 30, 70
                );

        unsorted.stream()

                .sorted()

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 10: limit() + sorted()
        // =====================================================

        System.out.println("\nExample 10: limit() + sorted()");

        unsorted.stream()

                .limit(3)

                .sorted()

                .forEach(System.out::println);


        // =====================================================
        // Example 11: distinct() + limit()
        // =====================================================

        System.out.println("\nExample 11: distinct() + limit()");

        Arrays.asList(
                10, 20, 20, 30, 30, 40, 50
        )

                .stream()

                .distinct()

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 12: limit() + distinct()
        // =====================================================

        System.out.println("\nExample 12: limit() + distinct()");

        Arrays.asList(
                10, 20, 20, 30, 30, 40, 50
        )

                .stream()

                .limit(3)

                .distinct()

                .forEach(System.out::println);


        // =====================================================
        // Example 13: peek() + limit()
        // =====================================================

        System.out.println("\nExample 13: peek() + limit()");

        numbers.stream()

                .peek(n ->
                        System.out.println("Processing: " + n))

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 14: limit() + count()
        // =====================================================

        System.out.println("\nExample 14: limit() + count()");

        long count =
                numbers.stream()

                        .limit(4)

                        .count();

        System.out.println("Count = " + count);


        // =====================================================
        // Example 15: limit() + reduce()
        // =====================================================

        System.out.println("\nExample 15: limit() + reduce()");

        int sum =
                numbers.stream()

                        .limit(3)

                        .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum);


        // =====================================================
        // Example 16: findFirst() + limit()
        // =====================================================

        System.out.println("\nExample 16: findFirst()");

        Optional<Integer> first =
                numbers.stream()

                        .limit(3)

                        .findFirst();

        System.out.println(first.get());


        // =====================================================
        // Example 17: Infinite Stream
        // =====================================================

        System.out.println("\nExample 17: Infinite Stream");

        Stream.iterate(
                1,
                n -> n + 1
        )

        .limit(10)

        .forEach(System.out::println);


        // =====================================================
        // Example 18: Infinite Stream + filter()
        // =====================================================

        System.out.println("\nExample 18: Infinite Stream + filter()");

        Stream.iterate(
                1,
                n -> n + 1
        )

        .filter(n -> n % 2 == 0)

        .limit(5)

        .forEach(System.out::println);


        // =====================================================
        // Example 19: Generate random numbers
        // =====================================================

        System.out.println("\nExample 19: Random Numbers");

        Stream.generate(
                () -> Math.random()
        )

        .limit(5)

        .forEach(System.out::println);


        // =====================================================
        // Example 20: Parallel Stream
        // =====================================================

        System.out.println("\nExample 20: Parallel Stream");

        numbers.parallelStream()

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 21: Collect limited elements
        // =====================================================

        System.out.println("\nExample 21: Collect");

        List<Integer> firstFive =
                numbers.stream()

                        .limit(5)

                        .collect(Collectors.toList());

        System.out.println(firstFive);


        // =====================================================
        // Example 22: Top 3 salaries
        // =====================================================

        System.out.println("\nExample 22: Top 3");

        List<Integer> salaries =
                Arrays.asList(
                        50000,
                        90000,
                        60000,
                        120000,
                        70000
                );

        salaries.stream()

                .sorted(Comparator.reverseOrder())

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 23: First 3 even numbers
        // =====================================================

        System.out.println("\nExample 23: First 3 Even Numbers");

        numbers.stream()

                .filter(n -> n % 2 == 0)

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 24: First 3 numbers > 40
        // =====================================================

        System.out.println("\nExample 24: First 3 numbers > 40");

        numbers.stream()

                .filter(n -> n > 40)

                .limit(3)

                .forEach(System.out::println);

    }
}