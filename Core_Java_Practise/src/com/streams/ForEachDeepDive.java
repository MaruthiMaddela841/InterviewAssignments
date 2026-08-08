package com.streams;

import java.util.*;
import java.util.stream.*;

public class ForEachDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);


        // =====================================================
        // Example 1: Basic forEach()
        // =====================================================

        System.out.println("Example 1: Basic forEach()");

        numbers.stream()
                .forEach(n -> System.out.println(n));


        // =====================================================
        // Example 2: Method reference
        // =====================================================

        System.out.println("\nExample 2: Method Reference");

        numbers.stream()
                .forEach(System.out::println);


        // =====================================================
        // Example 3: forEach() with calculation
        // =====================================================

        System.out.println("\nExample 3: Calculation");

        numbers.stream()
                .forEach(n ->
                        System.out.println(n * 2));


        // =====================================================
        // Example 4: forEach() after filter()
        // =====================================================

        System.out.println("\nExample 4: filter() + forEach()");

        numbers.stream()

                .filter(n -> n > 20)

                .forEach(System.out::println);


        // =====================================================
        // Example 5: forEach() after map()
        // =====================================================

        System.out.println("\nExample 5: map() + forEach()");

        numbers.stream()

                .map(n -> n * 2)

                .forEach(System.out::println);


        // =====================================================
        // Example 6: forEach() after multiple operations
        // =====================================================

        System.out.println("\nExample 6: Pipeline");

        numbers.stream()

                .filter(n -> n % 2 == 0)

                .map(n -> n * 10)

                .filter(n -> n > 200)

                .forEach(System.out::println);


        // =====================================================
        // Example 7: forEach() with index
        // =====================================================

        System.out.println("\nExample 7: Index");

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob",
                        "David"
                );

        IntStream.range(0, names.size())

                .forEach(i ->
                        System.out.println(
                                i + " -> " + names.get(i)
                        )
                );


        // =====================================================
        // Example 8: forEach() with String
        // =====================================================

        System.out.println("\nExample 8: Strings");

        names.stream()

                .forEach(name ->
                        System.out.println(
                                name.toUpperCase()
                        )
                );


        // =====================================================
        // Example 9: forEach() modifying external variable
        // =====================================================

        System.out.println("\nExample 9: External Variable");

        int[] sum = {0};

        numbers.stream()

                .forEach(n ->
                        sum[0] += n
                );

        System.out.println("Sum = " + sum[0]);


        // =====================================================
        // Example 10: Better alternative to Example 9
        // =====================================================

        System.out.println("\nExample 10: reduce()");

        int sum2 =
                numbers.stream()

                        .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum2);


        // =====================================================
        // Example 11: Parallel forEach()
        // =====================================================

        System.out.println("\nExample 11: Parallel forEach()");

        numbers.parallelStream()

                .forEach(n ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> " + n
                        )
                );


        // =====================================================
        // Example 12: Parallel forEachOrdered()
        // =====================================================

        System.out.println("\nExample 12: Parallel forEachOrdered()");

        numbers.parallelStream()

                .forEachOrdered(n ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> " + n
                        )
                );


        // =====================================================
        // Example 13: Sequential forEachOrdered()
        // =====================================================

        System.out.println("\nExample 13: Sequential forEachOrdered()");

        numbers.stream()

                .forEachOrdered(System.out::println);


        // =====================================================
        // Example 14: Parallel order demonstration
        // =====================================================

        System.out.println("\nExample 14: Parallel Order");

        IntStream.rangeClosed(1, 20)

                .parallel()

                .forEach(n ->
                        System.out.print(n + " ")
                );

        System.out.println();


        // =====================================================
        // Example 15: Ordered parallel stream
        // =====================================================

        System.out.println("\nExample 15: Ordered Parallel");

        IntStream.rangeClosed(1, 20)

                .parallel()

                .forEachOrdered(n ->
                        System.out.print(n + " ")
                );

        System.out.println();


        // =====================================================
        // Example 16: forEach() + limit()
        // =====================================================

        System.out.println("\nExample 16: limit()");

        numbers.stream()

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 17: forEach() + skip()
        // =====================================================

        System.out.println("\nExample 17: skip()");

        numbers.stream()

                .skip(2)

                .forEach(System.out::println);


        // =====================================================
        // Example 18: forEach() + sorted()
        // =====================================================

        System.out.println("\nExample 18: sorted()");

        Arrays.asList(50, 10, 40, 20, 30)

                .stream()

                .sorted()

                .forEach(System.out::println);


        // =====================================================
        // Example 19: forEach() with HashSet
        // =====================================================

        System.out.println("\nExample 19: Set");

        Set<Integer> set =
                new HashSet<>(
                        Arrays.asList(
                                10, 20, 30, 40, 50
                        )
                );

        set.stream()
                .forEach(System.out::println);


        // =====================================================
        // Example 20: forEach() with Map
        // =====================================================

        System.out.println("\nExample 20: Map");

        Map<Integer, String> employees =
                new HashMap<>();

        employees.put(101, "John");
        employees.put(102, "Alice");
        employees.put(103, "Bob");

        employees.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println(
                                entry.getKey()
                                        + " -> "
                                        + entry.getValue()
                        )
                );


        // =====================================================
        // Example 21: forEach() vs forEachOrdered()
        // =====================================================

        System.out.println("\nExample 21: Comparison");

        System.out.println("forEach:");

        numbers.parallelStream()
                .forEach(System.out::println);

        System.out.println("forEachOrdered:");

        numbers.parallelStream()
                .forEachOrdered(System.out::println);


        // =====================================================
        // Example 22: Side effect problem
        // =====================================================

        System.out.println("\nExample 22: Side Effect");

        List<Integer> result =
                new ArrayList<>();

        numbers.stream()

                .forEach(n ->
                        result.add(n * 2)
                );

        System.out.println(result);


        // =====================================================
        // Example 23: Dangerous parallel side effect
        // =====================================================

        System.out.println("\nExample 23: Parallel Side Effect");

        List<Integer> parallelResult =
                new ArrayList<>();

        IntStream.rangeClosed(1, 1000)

                .parallel()

                .forEach(n ->
                        parallelResult.add(n)
                );

        System.out.println(
                "Size = " + parallelResult.size()
        );


        // =====================================================
        // Example 24: Safe parallel collection
        // =====================================================

        System.out.println("\nExample 24: Safe Collection");

        List<Integer> safeResult =
                IntStream.rangeClosed(1, 1000)

                        .parallel()

                        .boxed()

                        .collect(Collectors.toList());

        System.out.println(
                "Size = " + safeResult.size()
        );

    }
}
