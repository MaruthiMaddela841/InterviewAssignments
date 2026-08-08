package com.streams;

import java.util.*;
import java.util.stream.*;

public class ToArrayDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50);


        // =====================================================
        // Example 1: Basic toArray()
        // =====================================================

        System.out.println("Example 1: Basic toArray()");

        Object[] array =
                numbers.stream()
                        .toArray();

        System.out.println(
                Arrays.toString(array)
        );


        // =====================================================
        // Example 2: Check actual array type
        // =====================================================

        System.out.println("\nExample 2: Array type");

        System.out.println(
                array.getClass()
        );


        // =====================================================
        // Example 3: toArray() with filter()
        // =====================================================

        System.out.println("\nExample 3: filter + toArray()");

        Object[] evenNumbers =
                numbers.stream()

                        .filter(n -> n % 2 == 0)

                        .toArray();

        System.out.println(
                Arrays.toString(evenNumbers)
        );


        // =====================================================
        // Example 4: toArray() with map()
        // =====================================================

        System.out.println("\nExample 4: map + toArray()");

        Object[] doubled =
                numbers.stream()

                        .map(n -> n * 2)

                        .toArray();

        System.out.println(
                Arrays.toString(doubled)
        );


        // =====================================================
        // Example 5: toArray() with distinct()
        // =====================================================

        System.out.println("\nExample 5: distinct + toArray()");

        List<Integer> duplicateNumbers =
                Arrays.asList(
                        10, 20, 20, 30, 30, 40
                );

        Object[] unique =
                duplicateNumbers.stream()

                        .distinct()

                        .toArray();

        System.out.println(
                Arrays.toString(unique)
        );


        // =====================================================
        // Example 6: toArray() with sorted()
        // =====================================================

        System.out.println("\nExample 6: sorted + toArray()");

        Object[] sorted =
                Arrays.asList(
                        50, 10, 40, 20, 30
                )
                .stream()

                .sorted()

                .toArray();

        System.out.println(
                Arrays.toString(sorted)
        );


        // =====================================================
        // Example 7: toArray() with limit()
        // =====================================================

        System.out.println("\nExample 7: limit + toArray()");

        Object[] limited =
                numbers.stream()

                        .limit(3)

                        .toArray();

        System.out.println(
                Arrays.toString(limited)
        );


        // =====================================================
        // Example 8: toArray() with skip()
        // =====================================================

        System.out.println("\nExample 8: skip + toArray()");

        Object[] skipped =
                numbers.stream()

                        .skip(2)

                        .toArray();

        System.out.println(
                Arrays.toString(skipped)
        );


        // =====================================================
        // Example 9: toArray() with String
        // =====================================================

        System.out.println("\nExample 9: String array");

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob"
                );

        Object[] nameArray =
                names.stream()
                        .toArray();

        System.out.println(
                Arrays.toString(nameArray)
        );


        // =====================================================
        // Example 10: toArray(String[]::new)
        // =====================================================

        System.out.println(
                "\nExample 10: Typed String array"
        );

        String[] typedNames =
                names.stream()

                        .toArray(
                                String[]::new
                        );

        System.out.println(
                Arrays.toString(typedNames)
        );


        // =====================================================
        // Example 11: toArray(Integer[]::new)
        // =====================================================

        System.out.println(
                "\nExample 11: Typed Integer array"
        );

        Integer[] typedNumbers =
                numbers.stream()

                        .toArray(
                                Integer[]::new
                        );

        System.out.println(
                Arrays.toString(typedNumbers)
        );


        // =====================================================
        // Example 12: Why generator is needed
        // =====================================================

        System.out.println(
                "\nExample 12: Generator"
        );

        Integer[] generated =
                numbers.stream()

                        .toArray(
                                size -> new Integer[size]
                        );

        System.out.println(
                Arrays.toString(generated)
        );


        // =====================================================
        // Example 13: Filter + typed array
        // =====================================================

        System.out.println(
                "\nExample 13: filter + typed array"
        );

        Integer[] filtered =
                numbers.stream()

                        .filter(n -> n > 25)

                        .toArray(
                                Integer[]::new
                        );

        System.out.println(
                Arrays.toString(filtered)
        );


        // =====================================================
        // Example 14: Map + typed array
        // =====================================================

        System.out.println(
                "\nExample 14: map + typed array"
        );

        String[] numberStrings =
                numbers.stream()

                        .map(String::valueOf)

                        .toArray(
                                String[]::new
                        );

        System.out.println(
                Arrays.toString(numberStrings)
        );


        // =====================================================
        // Example 15: Stream<Integer> → Integer[]
        // =====================================================

        System.out.println(
                "\nExample 15: Stream<Integer> to Integer[]"
        );

        Integer[] integerArray =
                numbers.stream()

                        .toArray(
                                Integer[]::new
                        );

        System.out.println(
                Arrays.toString(integerArray)
        );


        // =====================================================
        // Example 16: IntStream → int[]
        // =====================================================

        System.out.println(
                "\nExample 16: IntStream to int[]"
        );

        int[] primitiveArray =
                IntStream.of(
                        10, 20, 30, 40, 50
                )
                .toArray();

        System.out.println(
                Arrays.toString(primitiveArray)
        );


        // =====================================================
        // Example 17: List<Integer> → int[]
        // =====================================================

        System.out.println(
                "\nExample 17: List<Integer> to int[]"
        );

        int[] primitiveArray2 =
                numbers.stream()

                        .mapToInt(
                                Integer::intValue
                        )

                        .toArray();

        System.out.println(
                Arrays.toString(primitiveArray2)
        );


        // =====================================================
        // Example 18: filter + mapToInt + toArray
        // =====================================================

        System.out.println(
                "\nExample 18: filter + mapToInt"
        );

        int[] evenPrimitiveArray =
                numbers.stream()

                        .filter(n -> n % 2 == 0)

                        .mapToInt(
                                Integer::intValue
                        )

                        .toArray();

        System.out.println(
                Arrays.toString(
                        evenPrimitiveArray
                )
        );


        // =====================================================
        // Example 19: String → char[]
        // =====================================================

        System.out.println(
                "\nExample 19: String characters"
        );

        char[] characters =
                "HELLO"

                        .chars()

                        .mapToObj(
                                c -> (char) c
                        )

                        .collect(
                                StringBuilder::new,

                                StringBuilder::append,

                                StringBuilder::append
                        )

                        .toString()

                        .toCharArray();

        System.out.println(
                Arrays.toString(
                        characters
                )
        );


        // =====================================================
        // Example 20: Parallel stream + toArray()
        // =====================================================

        System.out.println(
                "\nExample 20: Parallel toArray()"
        );

        Object[] parallelArray =
                IntStream.rangeClosed(1, 20)

                        .parallel()

                        .boxed()

                        .toArray();

        System.out.println(
                Arrays.toString(
                        parallelArray
                )
        );


        // =====================================================
        // Example 21: Parallel typed array
        // =====================================================

        System.out.println(
                "\nExample 21: Parallel typed array"
        );

        Integer[] parallelIntegerArray =
                IntStream.rangeClosed(1, 20)

                        .parallel()

                        .boxed()

                        .toArray(
                                Integer[]::new
                        );

        System.out.println(
                Arrays.toString(
                        parallelIntegerArray
                )
        );


        // =====================================================
        // Example 22: Empty Stream
        // =====================================================

        System.out.println(
                "\nExample 22: Empty stream"
        );

        Object[] emptyArray =
                Stream.empty()
                        .toArray();

        System.out.println(
                Arrays.toString(
                        emptyArray
                )
        );


        // =====================================================
        // Example 23: Empty typed array
        // =====================================================

        System.out.println(
                "\nExample 23: Empty typed array"
        );

        String[] emptyStringArray =
                Stream.<String>empty()

                        .toArray(
                                String[]::new
                        );

        System.out.println(
                Arrays.toString(
                        emptyStringArray
                )
        );


        // =====================================================
        // Example 24: Infinite Stream + limit + toArray
        // =====================================================

        System.out.println(
                "\nExample 24: Infinite stream"
        );

        Integer[] firstTen =
                Stream.iterate(
                        1,
                        n -> n + 1
                )

                .limit(10)

                .toArray(
                        Integer[]::new
                );

        System.out.println(
                Arrays.toString(
                        firstTen
                )
        );


        // =====================================================
        // Example 25: Practical example
        // =====================================================

        System.out.println(
                "\nExample 25: Practical example"
        );

        String[] adults =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob",
                        "David"
                )

                .stream()

                .filter(
                        name ->
                                name.length() >= 5
                )

                .toArray(
                        String[]::new
                );

        System.out.println(
                Arrays.toString(
                        adults
                )
        );

    }
}
