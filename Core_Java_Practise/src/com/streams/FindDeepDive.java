package com.streams;

import java.util.*;
import java.util.stream.*;

public class FindDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        10, 20, 30, 40, 50
                );


        // =====================================================
        // Example 1: Basic findFirst()
        // =====================================================

        System.out.println("Example 1: findFirst()");

        Optional<Integer> first =
                numbers.stream()
                        .findFirst();

        System.out.println(
                "First = " + first
        );


        // =====================================================
        // Example 2: findFirst() with filter()
        // =====================================================

        System.out.println("\nExample 2: filter + findFirst()");

        Optional<Integer> firstEven =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .findFirst();

        System.out.println(
                "First even = " + firstEven
        );


        // =====================================================
        // Example 3: findFirst() with condition
        // =====================================================

        System.out.println("\nExample 3: First > 25");

        Optional<Integer> firstGreaterThan25 =
                numbers.stream()
                        .filter(n -> n > 25)
                        .findFirst();

        System.out.println(
                firstGreaterThan25
        );


        // =====================================================
        // Example 4: findAny()
        // =====================================================

        System.out.println("\nExample 4: findAny()");

        Optional<Integer> any =
                numbers.stream()
                        .findAny();

        System.out.println(
                "Any = " + any
        );


        // =====================================================
        // Example 5: findAny() with filter()
        // =====================================================

        System.out.println(
                "\nExample 5: filter + findAny()"
        );

        Optional<Integer> anyGreaterThan25 =
                numbers.stream()
                        .filter(n -> n > 25)
                        .findAny();

        System.out.println(
                anyGreaterThan25
        );


        // =====================================================
        // Example 6: findFirst() preserves order
        // =====================================================

        System.out.println(
                "\nExample 6: findFirst() order"
        );

        List<Integer> orderedNumbers =
                Arrays.asList(
                        50, 10, 40, 20, 30
                );

        Optional<Integer> firstNumber =
                orderedNumbers.stream()
                        .findFirst();

        System.out.println(
                "First = " + firstNumber
        );


        // =====================================================
        // Example 7: findAny() sequential stream
        // =====================================================

        System.out.println(
                "\nExample 7: Sequential findAny()"
        );

        Optional<Integer> sequentialAny =
                orderedNumbers.stream()
                        .findAny();

        System.out.println(
                "Any = " + sequentialAny
        );


        // =====================================================
        // Example 8: Parallel findFirst()
        // =====================================================

        System.out.println(
                "\nExample 8: Parallel findFirst()"
        );

        Optional<Integer> parallelFirst =
                orderedNumbers.parallelStream()
                        .findFirst();

        System.out.println(
                "First = " + parallelFirst
        );


        // =====================================================
        // Example 9: Parallel findAny()
        // =====================================================

        System.out.println(
                "\nExample 9: Parallel findAny()"
        );

        Optional<Integer> parallelAny =
                orderedNumbers.parallelStream()
                        .findAny();

        System.out.println(
                "Any = " + parallelAny
        );


        // =====================================================
        // Example 10: Repeated parallel findAny()
        // =====================================================

        System.out.println(
                "\nExample 10: Repeated findAny()"
        );

        for (int i = 1; i <= 5; i++) {

            Optional<Integer> result =
                    IntStream.rangeClosed(1, 1000)
                            .parallel()
                            .boxed()
                            .findAny();

            System.out.println(
                    "Run " + i + " = " + result
            );
        }


        // =====================================================
        // Example 11: findFirst() + Optional
        // =====================================================

        System.out.println(
                "\nExample 11: Optional"
        );

        Optional<Integer> result =
                numbers.stream()
                        .filter(n -> n > 100)
                        .findFirst();

        System.out.println(
                "Result = " + result
        );


        // =====================================================
        // Example 12: isPresent()
        // =====================================================

        System.out.println(
                "\nExample 12: isPresent()"
        );

        if (result.isPresent()) {

            System.out.println(
                    "Found = " + result.get()
            );

        } else {

            System.out.println(
                    "Nothing found"
            );
        }


        // =====================================================
        // Example 13: ifPresent()
        // =====================================================

        System.out.println(
                "\nExample 13: ifPresent()"
        );

        numbers.stream()

                .filter(n -> n > 30)

                .findFirst()

                .ifPresent(
                        n -> System.out.println(
                                "Found = " + n
                        )
                );


        // =====================================================
        // Example 14: orElse()
        // =====================================================

        System.out.println(
                "\nExample 14: orElse()"
        );

        int value =
                numbers.stream()

                        .filter(n -> n > 100)

                        .findFirst()

                        .orElse(-1);

        System.out.println(
                "Value = " + value
        );


        // =====================================================
        // Example 15: orElseGet()
        // =====================================================

        System.out.println(
                "\nExample 15: orElseGet()"
        );

        int value2 =
                numbers.stream()

                        .filter(n -> n > 100)

                        .findFirst()

                        .orElseGet(
                                () -> generateDefaultValue()
                        );

        System.out.println(
                "Value = " + value2
        );


        // =====================================================
        // Example 16: orElseThrow()
        // =====================================================

        System.out.println(
                "\nExample 16: orElseThrow()"
        );

        try {

            int value3 =
                    numbers.stream()

                            .filter(n -> n > 100)

                            .findFirst()

                            .orElseThrow();

            System.out.println(value3);

        } catch (NoSuchElementException e) {

            System.out.println(
                    "Element was not found"
            );
        }


        // =====================================================
        // Example 17: findFirst() short-circuiting
        // =====================================================

        System.out.println(
                "\nExample 17: Short-circuiting"
        );

        Optional<Integer> shortCircuit =
                numbers.stream()

                        .peek(n ->
                                System.out.println(
                                        "Checking: " + n
                                )
                        )

                        .findFirst();

        System.out.println(
                "Result = " + shortCircuit
        );


        // =====================================================
        // Example 18: findAny() short-circuiting
        // =====================================================

        System.out.println(
                "\nExample 18: findAny() short-circuiting"
        );

        Optional<Integer> shortCircuitAny =
                numbers.stream()

                        .peek(n ->
                                System.out.println(
                                        "Checking: " + n
                                )
                        )

                        .findAny();

        System.out.println(
                "Result = " + shortCircuitAny
        );


        // =====================================================
        // Example 19: Infinite stream + findFirst()
        // =====================================================

        System.out.println(
                "\nExample 19: Infinite stream"
        );

        Optional<Integer> infiniteFirst =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .filter(n -> n > 100)

                .findFirst();

        System.out.println(
                "First > 100 = "
                        + infiniteFirst
        );


        // =====================================================
        // Example 20: Infinite stream + findAny()
        // =====================================================

        System.out.println(
                "\nExample 20: Infinite + findAny()"
        );

        Optional<Integer> infiniteAny =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .filter(n -> n > 100)

                .findAny();

        System.out.println(
                "Any > 100 = "
                        + infiniteAny
        );


        // =====================================================
        // Example 21: Strings
        // =====================================================

        System.out.println(
                "\nExample 21: Strings"
        );

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob",
                        "David"
                );

        Optional<String> firstLongName =
                names.stream()

                        .filter(
                                name ->
                                        name.length() > 4
                        )

                        .findFirst();

        System.out.println(
                "First long name = "
                        + firstLongName
        );


        // =====================================================
        // Example 22: findAny() after map()
        // =====================================================

        System.out.println(
                "\nExample 22: map + findAny()"
        );

        Optional<String> anyUpperName =
                names.stream()

                        .map(String::toUpperCase)

                        .findAny();

        System.out.println(
                anyUpperName
        );


        // =====================================================
        // Example 23: findFirst() vs anyMatch()
        // =====================================================

        System.out.println(
                "\nExample 23: findFirst vs anyMatch"
        );

        boolean exists =
                numbers.stream()
                        .anyMatch(n -> n > 30);

        Optional<Integer> element =
                numbers.stream()
                        .filter(n -> n > 30)
                        .findFirst();

        System.out.println(
                "Exists? " + exists
        );

        System.out.println(
                "Element = " + element
        );


        // =====================================================
        // Example 24: Parallel findAny() with filter
        // =====================================================

        System.out.println(
                "\nExample 24: Parallel findAny + filter"
        );

        Optional<Integer> parallelFiltered =
                IntStream.rangeClosed(1, 1_000_000)

                        .parallel()

                        .filter(n -> n % 1000 == 0)

                        .boxed()

                        .findAny();

        System.out.println(
                "Found = " + parallelFiltered
        );

    }


    // =========================================================
    // Helper method
    // =========================================================

    static int generateDefaultValue() {

        System.out.println(
                "Generating default value..."
        );

        return -1;
    }
}