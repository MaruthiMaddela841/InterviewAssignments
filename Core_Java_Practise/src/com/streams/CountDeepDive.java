package com.streams;

import java.util.*;
import java.util.stream.*;

public class CountDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        10, 20, 30, 40, 50
                );


        // =====================================================
        // Example 1: Basic count()
        // =====================================================

        System.out.println("Example 1: Basic count()");

        long count =
                numbers.stream()
                        .count();

        System.out.println("Count = " + count);


        // =====================================================
        // Example 2: count() after filter()
        // =====================================================

        System.out.println("\nExample 2: filter() + count()");

        long evenCount =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .count();

        System.out.println("Even count = " + evenCount);


        // =====================================================
        // Example 3: count() after map()
        // =====================================================

        System.out.println("\nExample 3: map() + count()");

        long mappedCount =
                numbers.stream()
                        .map(n -> n * 2)
                        .count();

        System.out.println("Count = " + mappedCount);


        // =====================================================
        // Example 4: count() after distinct()
        // =====================================================

        System.out.println("\nExample 4: distinct() + count()");

        List<Integer> duplicates =
                Arrays.asList(
                        10, 20, 20, 30, 30, 30, 40
                );

        long uniqueCount =
                duplicates.stream()
                        .distinct()
                        .count();

        System.out.println(
                "Unique count = " + uniqueCount
        );


        // =====================================================
        // Example 5: count() after limit()
        // =====================================================

        System.out.println("\nExample 5: limit() + count()");

        long limitedCount =
                numbers.stream()
                        .limit(3)
                        .count();

        System.out.println(
                "Limited count = " + limitedCount
        );


        // =====================================================
        // Example 6: count() after skip()
        // =====================================================

        System.out.println("\nExample 6: skip() + count()");

        long skippedCount =
                numbers.stream()
                        .skip(2)
                        .count();

        System.out.println(
                "Count after skip = " + skippedCount
        );


        // =====================================================
        // Example 7: count() after sorted()
        // =====================================================

        System.out.println("\nExample 7: sorted() + count()");

        long sortedCount =
                numbers.stream()
                        .sorted()
                        .count();

        System.out.println(
                "Count = " + sortedCount
        );


        // =====================================================
        // Example 8: count() after takeWhile()
        // =====================================================

        System.out.println("\nExample 8: takeWhile() + count()");

        long takeCount =
                numbers.stream()
                        .takeWhile(n -> n < 40)
                        .count();

        System.out.println(
                "Count = " + takeCount
        );


        // =====================================================
        // Example 9: count() after dropWhile()
        // =====================================================

        System.out.println("\nExample 9: dropWhile() + count()");

        long dropCount =
                numbers.stream()
                        .dropWhile(n -> n < 40)
                        .count();

        System.out.println(
                "Count = " + dropCount
        );


        // =====================================================
        // Example 10: count() with peek()
        // =====================================================

        System.out.println("\nExample 10: peek() + count()");

        long peekCount =
                numbers.stream()

                        .peek(n ->
                                System.out.println(
                                        "Processing: " + n
                                )
                        )

                        .count();

        System.out.println(
                "Count = " + peekCount
        );


        // =====================================================
        // Example 11: count() vs List.size()
        // =====================================================

        System.out.println("\nExample 11: count() vs size()");

        System.out.println(
                "List size = " + numbers.size()
        );

        System.out.println(
                "Stream count = "
                        + numbers.stream().count()
        );


        // =====================================================
        // Example 12: count() after filter
        // =====================================================

        System.out.println("\nExample 12: Conditional count");

        long greaterThan25 =
                numbers.stream()
                        .filter(n -> n > 25)
                        .count();

        System.out.println(
                "Numbers > 25 = " + greaterThan25
        );


        // =====================================================
        // Example 13: count() with Strings
        // =====================================================

        System.out.println("\nExample 13: String count");

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob",
                        "David"
                );

        long longNames =
                names.stream()
                        .filter(name ->
                                name.length() > 4
                        )
                        .count();

        System.out.println(
                "Names longer than 4 = "
                        + longNames
        );


        // =====================================================
        // Example 14: count() with null
        // =====================================================

        System.out.println("\nExample 14: null values");

        List<String> values =
                Arrays.asList(
                        "A",
                        null,
                        "B",
                        null,
                        "C"
                );

        long total =
                values.stream()
                        .count();

        System.out.println(
                "Total = " + total
        );


        // =====================================================
        // Example 15: Count non-null elements
        // =====================================================

        System.out.println(
                "\nExample 15: Non-null count"
        );

        long nonNull =
                values.stream()
                        .filter(Objects::nonNull)
                        .count();

        System.out.println(
                "Non-null = " + nonNull
        );


        // =====================================================
        // Example 16: Count null elements
        // =====================================================

        System.out.println(
                "\nExample 16: Null count"
        );

        long nullCount =
                values.stream()
                        .filter(Objects::isNull)
                        .count();

        System.out.println(
                "Null = " + nullCount
        );


        // =====================================================
        // Example 17: Count unique names
        // =====================================================

        System.out.println(
                "\nExample 17: Unique names"
        );

        List<String> duplicateNames =
                Arrays.asList(
                        "John",
                        "Alice",
                        "John",
                        "Bob",
                        "Alice"
                );

        long uniqueNames =
                duplicateNames.stream()
                        .distinct()
                        .count();

        System.out.println(
                "Unique names = " + uniqueNames
        );


        // =====================================================
        // Example 18: Count after map()
        // =====================================================

        System.out.println(
                "\nExample 18: Transformation + count"
        );

        long nameCount =
                names.stream()
                        .map(String::toUpperCase)
                        .count();

        System.out.println(
                "Count = " + nameCount
        );


        // =====================================================
        // Example 19: Count with parallelStream()
        // =====================================================

        System.out.println(
                "\nExample 19: Parallel Stream"
        );

        long parallelCount =
                IntStream.rangeClosed(1, 1000)
                        .parallel()
                        .count();

        System.out.println(
                "Count = " + parallelCount
        );


        // =====================================================
        // Example 20: count() with infinite stream
        // =====================================================

        /*
         * DO NOT RUN THIS:
         *
         * Stream.iterate(1, n -> n + 1)
         *        .count();
         *
         * It is infinite and will never finish.
         */


        // =====================================================
        // Example 21: Infinite stream + limit() + count()
        // =====================================================

        System.out.println(
                "\nExample 21: Infinite Stream"
        );

        long infiniteCount =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .limit(10)

                .count();

        System.out.println(
                "Count = " + infiniteCount
        );


        // =====================================================
        // Example 22: filter + limit + count
        // =====================================================

        System.out.println(
                "\nExample 22: filter + limit + count"
        );

        long firstThreeEven =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .filter(n -> n % 2 == 0)

                .limit(3)

                .count();

        System.out.println(
                "Count = " + firstThreeEven
        );


        // =====================================================
        // Example 23: count() after flatMap()
        // =====================================================

        System.out.println(
                "\nExample 23: flatMap() + count()"
        );

        List<List<Integer>> nested =
                Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(3, 4, 5),
                        Arrays.asList(6)
                );

        long flattenedCount =
                nested.stream()

                        .flatMap(List::stream)

                        .count();

        System.out.println(
                "Flattened count = "
                        + flattenedCount
        );


        // =====================================================
        // Example 24: count employees by department
        // =====================================================

        System.out.println(
                "\nExample 24: Department count"
        );

        List<String> departments =
                Arrays.asList(
                        "IT",
                        "HR",
                        "IT",
                        "Finance",
                        "IT",
                        "HR"
                );

        Map<String, Long> departmentCount =
                departments.stream()

                        .collect(
                                Collectors.groupingBy(
                                        department ->
                                                department,
                                        Collectors.counting()
                                )
                        );

        System.out.println(
                departmentCount
        );

    }
}