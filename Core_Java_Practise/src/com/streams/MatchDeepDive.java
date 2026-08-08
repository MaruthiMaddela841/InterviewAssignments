package com.streams;

import java.util.*;
import java.util.stream.*;

public class MatchDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        10, 20, 30, 40, 50
                );


        // =====================================================
        // Example 1: Basic anyMatch()
        // =====================================================

        System.out.println("Example 1: anyMatch()");

        boolean anyGreaterThan40 =
                numbers.stream()
                        .anyMatch(n -> n > 40);

        System.out.println(
                "Any > 40? " + anyGreaterThan40
        );


        // =====================================================
        // Example 2: anyMatch() returns false
        // =====================================================

        System.out.println("\nExample 2: anyMatch() false");

        boolean anyGreaterThan100 =
                numbers.stream()
                        .anyMatch(n -> n > 100);

        System.out.println(
                "Any > 100? " + anyGreaterThan100
        );


        // =====================================================
        // Example 3: Basic allMatch()
        // =====================================================

        System.out.println("\nExample 3: allMatch()");

        boolean allPositive =
                numbers.stream()
                        .allMatch(n -> n > 0);

        System.out.println(
                "All positive? " + allPositive
        );


        // =====================================================
        // Example 4: allMatch() returns false
        // =====================================================

        System.out.println("\nExample 4: allMatch() false");

        boolean allGreaterThan20 =
                numbers.stream()
                        .allMatch(n -> n > 20);

        System.out.println(
                "All > 20? " + allGreaterThan20
        );


        // =====================================================
        // Example 5: Basic noneMatch()
        // =====================================================

        System.out.println("\nExample 5: noneMatch()");

        boolean noneNegative =
                numbers.stream()
                        .noneMatch(n -> n < 0);

        System.out.println(
                "None negative? " + noneNegative
        );


        // =====================================================
        // Example 6: noneMatch() returns false
        // =====================================================

        System.out.println("\nExample 6: noneMatch() false");

        boolean noneGreaterThan40 =
                numbers.stream()
                        .noneMatch(n -> n > 40);

        System.out.println(
                "None > 40? " + noneGreaterThan40
        );


        // =====================================================
        // Example 7: anyMatch() short-circuiting
        // =====================================================

        System.out.println(
                "\nExample 7: anyMatch() short-circuit"
        );

        boolean result1 =
                numbers.stream()

                        .peek(n ->
                                System.out.println(
                                        "Checking: " + n
                                )
                        )

                        .anyMatch(n -> n > 20);

        System.out.println(
                "Result = " + result1
        );


        // =====================================================
        // Example 8: allMatch() short-circuiting
        // =====================================================

        System.out.println(
                "\nExample 8: allMatch() short-circuit"
        );

        boolean result2 =
                numbers.stream()

                        .peek(n ->
                                System.out.println(
                                        "Checking: " + n
                                )
                        )

                        .allMatch(n -> n < 30);

        System.out.println(
                "Result = " + result2
        );


        // =====================================================
        // Example 9: noneMatch() short-circuiting
        // =====================================================

        System.out.println(
                "\nExample 9: noneMatch() short-circuit"
        );

        boolean result3 =
                numbers.stream()

                        .peek(n ->
                                System.out.println(
                                        "Checking: " + n
                                )
                        )

                        .noneMatch(n -> n > 20);

        System.out.println(
                "Result = " + result3
        );


        // =====================================================
        // Example 10: anyMatch() with filter()
        // =====================================================

        System.out.println(
                "\nExample 10: filter + anyMatch"
        );

        boolean result4 =
                numbers.stream()

                        .filter(n -> n % 2 == 0)

                        .anyMatch(n -> n > 30);

        System.out.println(
                "Result = " + result4
        );


        // =====================================================
        // Example 11: allMatch() with map()
        // =====================================================

        System.out.println(
                "\nExample 11: map + allMatch"
        );

        boolean result5 =
                numbers.stream()

                        .map(n -> n * 2)

                        .allMatch(n -> n >= 20);

        System.out.println(
                "Result = " + result5
        );


        // =====================================================
        // Example 12: noneMatch() with filter()
        // =====================================================

        System.out.println(
                "\nExample 12: filter + noneMatch"
        );

        boolean result6 =
                numbers.stream()

                        .filter(n -> n % 2 == 0)

                        .noneMatch(n -> n > 100);

        System.out.println(
                "Result = " + result6
        );


        // =====================================================
        // Example 13: Strings + anyMatch()
        // =====================================================

        System.out.println(
                "\nExample 13: String anyMatch"
        );

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob",
                        "David"
                );

        boolean hasAlice =
                names.stream()
                        .anyMatch(
                                name ->
                                        name.equals("Alice")
                        );

        System.out.println(
                "Has Alice? " + hasAlice
        );


        // =====================================================
        // Example 14: Strings + allMatch()
        // =====================================================

        System.out.println(
                "\nExample 14: String allMatch"
        );

        boolean allLongNames =
                names.stream()
                        .allMatch(
                                name ->
                                        name.length() >= 3
                        );

        System.out.println(
                "All length >= 3? "
                        + allLongNames
        );


        // =====================================================
        // Example 15: Strings + noneMatch()
        // =====================================================

        System.out.println(
                "\nExample 15: String noneMatch"
        );

        boolean noEmptyNames =
                names.stream()
                        .noneMatch(
                                String::isEmpty
                        );

        System.out.println(
                "No empty names? "
                        + noEmptyNames
        );


        // =====================================================
        // Example 16: anyMatch() + infinite stream
        // =====================================================

        System.out.println(
                "\nExample 16: Infinite Stream + anyMatch"
        );

        boolean found =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .anyMatch(n -> n == 100);

        System.out.println(
                "Found 100? " + found
        );


        // =====================================================
        // Example 17: allMatch() + infinite stream
        // =====================================================

        /*
         * DO NOT RUN THIS.
         *
         * Stream.iterate(1, n -> n + 1)
         *        .allMatch(n -> n > 0);
         *
         * This will never finish because every generated
         * element is positive and the stream is infinite.
         */


        // =====================================================
        // Example 18: noneMatch() + infinite stream
        // =====================================================

        boolean notFound =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .noneMatch(n -> n == 0);

        /*
         * This also never finishes.
         *
         * There is no 0 in this stream, but Java cannot
         * know that it will never appear.
         */

        // Do NOT run this.


        // =====================================================
        // Example 19: anyMatch() + limit()
        // =====================================================

        System.out.println(
                "\nExample 19: limit + anyMatch"
        );

        boolean result7 =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .limit(10)

                .anyMatch(n -> n > 8);

        System.out.println(
                "Result = " + result7
        );


        // =====================================================
        // Example 20: allMatch() + limit()
        // =====================================================

        System.out.println(
                "\nExample 20: limit + allMatch"
        );

        boolean result8 =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .limit(10)

                .allMatch(n -> n <= 10);

        System.out.println(
                "Result = " + result8
        );


        // =====================================================
        // Example 21: noneMatch() + limit()
        // =====================================================

        System.out.println(
                "\nExample 21: limit + noneMatch"
        );

        boolean result9 =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .limit(10)

                .noneMatch(n -> n > 10);

        System.out.println(
                "Result = " + result9
        );


        // =====================================================
        // Example 22: anyMatch() vs findFirst()
        // =====================================================

        System.out.println(
                "\nExample 22: anyMatch vs findFirst"
        );

        boolean hasEven =
                numbers.stream()
                        .anyMatch(n -> n % 2 == 0);

        Optional<Integer> firstEven =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .findFirst();

        System.out.println(
                "Has even? " + hasEven
        );

        System.out.println(
                "First even? " + firstEven
        );


        // =====================================================
        // Example 23: Parallel anyMatch()
        // =====================================================

        System.out.println(
                "\nExample 23: Parallel anyMatch"
        );

        boolean parallelAny =
                IntStream.rangeClosed(1, 1_000_000)

                        .parallel()

                        .anyMatch(n -> n == 999_999);

        System.out.println(
                "Found? " + parallelAny
        );


        // =====================================================
        // Example 24: Practical validation
        // =====================================================

        System.out.println(
                "\nExample 24: Validation"
        );

        List<Integer> ages =
                Arrays.asList(
                        20, 25, 30, 35
                );

        boolean allAdults =
                ages.stream()
                        .allMatch(age -> age >= 18);

        boolean anyMinor =
                ages.stream()
                        .anyMatch(age -> age < 18);

        boolean noInvalidAge =
                ages.stream()
                        .noneMatch(age -> age < 0);

        System.out.println(
                "All adults = " + allAdults
        );

        System.out.println(
                "Any minor = " + anyMinor
        );

        System.out.println(
                "No invalid age = " + noInvalidAge
        );

    }
}