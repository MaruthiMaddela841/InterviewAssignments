package com.streams;
import java.util.*;
import java.util.stream.*;

public class PeekDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);


        // =====================================================
        // Example 1: Basic peek()
        // =====================================================

        System.out.println("Example 1: Basic peek()");

        numbers.stream()
                .peek(n -> System.out.println("peek: " + n))
                .forEach(n -> System.out.println("forEach: " + n));


        // =====================================================
        // Example 2: peek() without terminal operation
        // =====================================================

        System.out.println("\nExample 2: No terminal operation");

        numbers.stream()
                .peek(n -> System.out.println("peek: " + n));

        System.out.println("Nothing was printed by peek()");


        // =====================================================
        // Example 3: peek() + filter()
        // =====================================================

        System.out.println("\nExample 3: peek() + filter()");

        numbers.stream()

                .peek(n ->
                        System.out.println("Before filter: " + n))

                .filter(n -> n > 20)

                .peek(n ->
                        System.out.println("After filter: " + n))

                .forEach(System.out::println);


        // =====================================================
        // Example 4: peek() + map()
        // =====================================================

        System.out.println("\nExample 4: peek() + map()");

        numbers.stream()

                .peek(n ->
                        System.out.println("Before map: " + n))

                .map(n -> n * 2)

                .peek(n ->
                        System.out.println("After map: " + n))

                .forEach(System.out::println);


        // =====================================================
        // Example 5: Debugging a pipeline
        // =====================================================

        System.out.println("\nExample 5: Debugging");

        numbers.stream()

                .filter(n -> n > 15)

                .peek(n ->
                        System.out.println("After filter 1: " + n))

                .map(n -> n * 2)

                .peek(n ->
                        System.out.println("After map: " + n))

                .filter(n -> n > 50)

                .peek(n ->
                        System.out.println("After filter 2: " + n))

                .forEach(System.out::println);


        // =====================================================
        // Example 6: peek() with count()
        // =====================================================

        System.out.println("\nExample 6: peek() + count()");

        long count =
                numbers.stream()

                        .peek(n ->
                                System.out.println("peek: " + n))

                        .count();

        System.out.println("Count = " + count);


        // =====================================================
        // Example 7: peek() + findFirst()
        // =====================================================

        System.out.println("\nExample 7: peek() + findFirst()");

        Optional<Integer> first =
                numbers.stream()

                        .peek(n ->
                                System.out.println("peek: " + n))

                        .filter(n -> n > 25)

                        .findFirst();

        System.out.println("First = " + first.get());


        // =====================================================
        // Example 8: peek() + limit()
        // =====================================================

        System.out.println("\nExample 8: peek() + limit()");

        numbers.stream()

                .peek(n ->
                        System.out.println("peek: " + n))

                .limit(3)

                .forEach(System.out::println);


        // =====================================================
        // Example 9: peek() + sorted()
        // =====================================================

        System.out.println("\nExample 9: peek() + sorted()");

        List<Integer> unsorted =
                Arrays.asList(50, 10, 40, 20, 30);

        unsorted.stream()

                .peek(n ->
                        System.out.println("Before sorted: " + n))

                .sorted()

                .peek(n ->
                        System.out.println("After sorted: " + n))

                .forEach(System.out::println);


        // =====================================================
        // Example 10: peek() + distinct()
        // =====================================================

        System.out.println("\nExample 10: peek() + distinct()");

        Arrays.asList(10, 20, 20, 30, 30, 30)

                .stream()

                .peek(n ->
                        System.out.println("Before distinct: " + n))

                .distinct()

                .peek(n ->
                        System.out.println("After distinct: " + n))

                .forEach(System.out::println);


        // =====================================================
        // Example 11: peek() with String
        // =====================================================

        System.out.println("\nExample 11: String debugging");

        List<String> names =
                Arrays.asList(
                        "john",
                        "alice",
                        "bob",
                        "david"
                );

        names.stream()

                .peek(name ->
                        System.out.println("Original: " + name))

                .map(String::toUpperCase)

                .peek(name ->
                        System.out.println("Uppercase: " + name))

                .filter(name -> name.length() > 3)

                .peek(name ->
                        System.out.println("After filter: " + name))

                .forEach(System.out::println);


        // =====================================================
        // Example 12: peek() with reduce()
        // =====================================================

        System.out.println("\nExample 12: peek() + reduce()");

        int sum =
                numbers.stream()

                        .peek(n ->
                                System.out.println("Processing: " + n))

                        .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum);


        // =====================================================
        // Example 13: peek() with parallelStream()
        // =====================================================

        System.out.println("\nExample 13: Parallel Stream");

        numbers.parallelStream()

                .peek(n ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> " + n))

                .forEach(System.out::println);


        // =====================================================
        // Example 14: DON'T use peek() for transformation
        // =====================================================

        System.out.println("\nExample 14: Wrong use of peek()");

//        numbers.stream()
//
//                .peek(n -> n * 2)
//
//                .forEach(System.out::println);


        // =====================================================
        // Example 15: Correct transformation
        // =====================================================

        System.out.println("\nExample 15: Correct transformation");

        numbers.stream()

                .map(n -> n * 2)

                .forEach(System.out::println);


        // =====================================================
        // Example 16: peek() modifying mutable objects
        // =====================================================

        System.out.println("\nExample 16: Mutable object");

        List<StringBuilder> builders =
                Arrays.asList(
                        new StringBuilder("A"),
                        new StringBuilder("B"),
                        new StringBuilder("C")
                );

        builders.stream()

                .peek(sb ->
                        sb.append("X"))

                .forEach(System.out::println);

    }
}