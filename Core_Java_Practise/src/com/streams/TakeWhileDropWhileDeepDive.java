package com.streams;

import java.util.*;
import java.util.stream.*;

public class TakeWhileDropWhileDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50, 20, 60, 70);


        // =====================================================
        // Example 1: Basic takeWhile()
        // =====================================================

        System.out.println("Example 1: takeWhile()");

        numbers.stream()

                .takeWhile(n -> n < 50)

                .forEach(System.out::println);


        // =====================================================
        // Example 2: Basic dropWhile()
        // =====================================================

        System.out.println("\nExample 2: dropWhile()");

        numbers.stream()

                .dropWhile(n -> n < 50)

                .forEach(System.out::println);


        // =====================================================
        // Example 3: takeWhile() stops at first FALSE
        // =====================================================

        System.out.println("\nExample 3: takeWhile()");

        numbers.stream()

                .takeWhile(n -> n < 50)

                .forEach(System.out::println);


        // =====================================================
        // Example 4: dropWhile() stops dropping at first FALSE
        // =====================================================

        System.out.println("\nExample 4: dropWhile()");

        numbers.stream()

                .dropWhile(n -> n < 50)

                .forEach(System.out::println);


        // =====================================================
        // Example 5: Compare with filter()
        // =====================================================

        System.out.println("\nExample 5: filter()");

        numbers.stream()

                .filter(n -> n < 50)

                .forEach(System.out::println);


        // =====================================================
        // Example 6: takeWhile() with sorted data
        // =====================================================

        System.out.println("\nExample 6: Sorted data");

        List<Integer> sortedNumbers =
                Arrays.asList(
                        10, 20, 30, 40, 50, 60, 70
                );

        sortedNumbers.stream()

                .takeWhile(n -> n < 50)

                .forEach(System.out::println);


        // =====================================================
        // Example 7: dropWhile() with sorted data
        // =====================================================

        System.out.println("\nExample 7: dropWhile()");

        sortedNumbers.stream()

                .dropWhile(n -> n < 50)

                .forEach(System.out::println);


        // =====================================================
        // Example 8: takeWhile() + map()
        // =====================================================

        System.out.println("\nExample 8: takeWhile() + map()");

        sortedNumbers.stream()

                .takeWhile(n -> n < 50)

                .map(n -> n * 2)

                .forEach(System.out::println);


        // =====================================================
        // Example 9: dropWhile() + map()
        // =====================================================

        System.out.println("\nExample 9: dropWhile() + map()");

        sortedNumbers.stream()

                .dropWhile(n -> n < 50)

                .map(n -> n * 2)

                .forEach(System.out::println);


        // =====================================================
        // Example 10: takeWhile() + limit()
        // =====================================================

        System.out.println("\nExample 10: takeWhile() + limit()");

        sortedNumbers.stream()

                .takeWhile(n -> n < 70)

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 11: dropWhile() + limit()
        // =====================================================

        System.out.println("\nExample 11: dropWhile() + limit()");

        sortedNumbers.stream()

                .dropWhile(n -> n < 30)

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 12: takeWhile() + count()
        // =====================================================

        System.out.println("\nExample 12: Count");

        long count =
                sortedNumbers.stream()

                        .takeWhile(n -> n < 50)

                        .count();

        System.out.println("Count = " + count);


        // =====================================================
        // Example 13: dropWhile() + count()
        // =====================================================

        System.out.println("\nExample 13: Count after drop");

        long count2 =
                sortedNumbers.stream()

                        .dropWhile(n -> n < 50)

                        .count();

        System.out.println("Count = " + count2);


        // =====================================================
        // Example 14: takeWhile() + reduce()
        // =====================================================

        System.out.println("\nExample 14: Reduce");

        int sum =
                sortedNumbers.stream()

                        .takeWhile(n -> n < 50)

                        .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum);


        // =====================================================
        // Example 15: dropWhile() + reduce()
        // =====================================================

        System.out.println("\nExample 15: Reduce after drop");

        int sum2 =
                sortedNumbers.stream()

                        .dropWhile(n -> n < 50)

                        .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum2);


        // =====================================================
        // Example 16: Strings
        // =====================================================

        System.out.println("\nExample 16: Strings");

        List<String> names =
                Arrays.asList(
                        "Alice",
                        "Bob",
                        "Chris",
                        "David",
                        "Adam",
                        "John"
                );

        names.stream()

                .takeWhile(name ->
                        name.length() < 6)

                .forEach(System.out::println);


        // =====================================================
        // Example 17: Drop strings
        // =====================================================

        System.out.println("\nExample 17: Drop strings");

        names.stream()

                .dropWhile(name ->
                        name.length() < 6)

                .forEach(System.out::println);


        // =====================================================
        // Example 18: peek() + takeWhile()
        // =====================================================

        System.out.println("\nExample 18: peek()");

        sortedNumbers.stream()

                .peek(n ->
                        System.out.println(
                                "Processing: " + n))

                .takeWhile(n -> n < 50)

                .forEach(System.out::println);


        // =====================================================
        // Example 19: Infinite stream
        // =====================================================

        System.out.println("\nExample 19: Infinite stream");

        Stream.iterate(
                1,
                n -> n + 1
        )

        .takeWhile(n -> n <= 10)

        .forEach(System.out::println);


        // =====================================================
        // Example 20: Parallel stream
        // =====================================================

        System.out.println("\nExample 20: Parallel stream");

        sortedNumbers.parallelStream()

                .takeWhile(n -> n < 50)

                .forEach(System.out::println);

    }
}