package com.streams;

import java.util.*;
import java.util.stream.*;

public class MinMaxDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        50, 10, 40, 20, 30
                );


        // =====================================================
        // Example 1: Basic min()
        // =====================================================

        System.out.println("Example 1: min()");

        Optional<Integer> minimum =
                numbers.stream()
                        .min(Integer::compareTo);

        System.out.println(
                "Minimum = " + minimum
        );


        // =====================================================
        // Example 2: Basic max()
        // =====================================================

        System.out.println("\nExample 2: max()");

        Optional<Integer> maximum =
                numbers.stream()
                        .max(Integer::compareTo);

        System.out.println(
                "Maximum = " + maximum
        );


        // =====================================================
        // Example 3: min() with Comparator.naturalOrder()
        // =====================================================

        System.out.println(
                "\nExample 3: naturalOrder()"
        );

        Optional<Integer> minNatural =
                numbers.stream()
                        .min(Comparator.naturalOrder());

        Optional<Integer> maxNatural =
                numbers.stream()
                        .max(Comparator.naturalOrder());

        System.out.println(
                "Min = " + minNatural
        );

        System.out.println(
                "Max = " + maxNatural
        );


        // =====================================================
        // Example 4: reverseOrder()
        // =====================================================

        System.out.println(
                "\nExample 4: reverseOrder()"
        );

        Optional<Integer> minReverse =
                numbers.stream()
                        .min(Comparator.reverseOrder());

        Optional<Integer> maxReverse =
                numbers.stream()
                        .max(Comparator.reverseOrder());

        System.out.println(
                "Min using reverse order = "
                        + minReverse
        );

        System.out.println(
                "Max using reverse order = "
                        + maxReverse
        );


        // =====================================================
        // Example 5: min() vs sorted().findFirst()
        // =====================================================

        System.out.println(
                "\nExample 5: min vs sorted"
        );

        Optional<Integer> min1 =
                numbers.stream()
                        .min(Integer::compareTo);

        Optional<Integer> min2 =
                numbers.stream()
                        .sorted()
                        .findFirst();

        System.out.println(
                "min() = " + min1
        );

        System.out.println(
                "sorted().findFirst() = " + min2
        );


        // =====================================================
        // Example 6: max() vs sorted().findFirst()
        // =====================================================

        System.out.println(
                "\nExample 6: max vs sorted"
        );

        Optional<Integer> max1 =
                numbers.stream()
                        .max(Integer::compareTo);

        Optional<Integer> max2 =
                numbers.stream()
                        .sorted(Comparator.reverseOrder())
                        .findFirst();

        System.out.println(
                "max() = " + max1
        );

        System.out.println(
                "reverse sorted().findFirst() = "
                        + max2
        );


        // =====================================================
        // Example 7: min() with custom objects
        // =====================================================

        System.out.println(
                "\nExample 7: Employee minimum age"
        );

        List<EmployeeMinMax> employees =
                Arrays.asList(

                        new EmployeeMinMax(
                                101,
                                "John",
                                30,
                                50000
                        ),

                        new EmployeeMinMax(
                                102,
                                "Alice",
                                25,
                                70000
                        ),

                        new EmployeeMinMax(
                                103,
                                "Bob",
                                35,
                                40000
                        ),

                        new EmployeeMinMax(
                                104,
                                "David",
                                28,
                                90000
                        )
                );

        Optional<EmployeeMinMax> youngest =
                employees.stream()

                        .min(
                                Comparator.comparingInt(
                                        emp -> emp.age
                                )
                        );

        System.out.println(
                "Youngest = " + youngest
        );


        // =====================================================
        // Example 8: max() with custom objects
        // =====================================================

        System.out.println(
                "\nExample 8: Employee maximum age"
        );

        Optional<EmployeeMinMax> oldest =
                employees.stream()

                        .max(
                                Comparator.comparingInt(
                                        emp -> emp.age
                                )
                        );

        System.out.println(
                "Oldest = " + oldest
        );


        // =====================================================
        // Example 9: Highest salary
        // =====================================================

        System.out.println(
                "\nExample 9: Highest salary"
        );

        Optional<EmployeeMinMax> highestPaid =
                employees.stream()

                        .max(
                                Comparator.comparingDouble(
                                        emp -> emp.salary
                                )
                        );

        System.out.println(
                "Highest paid = "
                        + highestPaid
        );


        // =====================================================
        // Example 10: Lowest salary
        // =====================================================

        System.out.println(
                "\nExample 10: Lowest salary"
        );

        Optional<EmployeeMinMax> lowestPaid =
                employees.stream()

                        .min(
                                Comparator.comparingDouble(
                                        emp -> emp.salary
                                )
                        );

        System.out.println(
                "Lowest paid = "
                        + lowestPaid
        );


        // =====================================================
        // Example 11: Alphabetically first name
        // =====================================================

        System.out.println(
                "\nExample 11: Alphabetically first"
        );

        Optional<EmployeeMinMax> firstName =
                employees.stream()

                        .min(
                                Comparator.comparing(
                                        emp -> emp.name
                                )
                        );

        System.out.println(
                "First name = " + firstName
        );


        // =====================================================
        // Example 12: Alphabetically last name
        // =====================================================

        System.out.println(
                "\nExample 12: Alphabetically last"
        );

        Optional<EmployeeMinMax> lastName =
                employees.stream()

                        .max(
                                Comparator.comparing(
                                        emp -> emp.name
                                )
                        );

        System.out.println(
                "Last name = " + lastName
        );


        // =====================================================
        // Example 13: min() after filter()
        // =====================================================

        System.out.println(
                "\nExample 13: filter + min"
        );

        Optional<Integer> minimumAbove20 =
                numbers.stream()

                        .filter(n -> n > 20)

                        .min(Integer::compareTo);

        System.out.println(
                "Minimum > 20 = "
                        + minimumAbove20
        );


        // =====================================================
        // Example 14: max() after filter()
        // =====================================================

        System.out.println(
                "\nExample 14: filter + max"
        );

        Optional<Integer> maximumBelow40 =
                numbers.stream()

                        .filter(n -> n < 40)

                        .max(Integer::compareTo);

        System.out.println(
                "Maximum < 40 = "
                        + maximumBelow40
        );


        // =====================================================
        // Example 15: min() with strings
        // =====================================================

        System.out.println(
                "\nExample 15: String min"
        );

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob",
                        "David"
                );

        Optional<String> shortestAlphabetical =
                names.stream()
                        .min(String::compareTo);

        System.out.println(
                "Alphabetically first = "
                        + shortestAlphabetical
        );


        // =====================================================
        // Example 16: Shortest String
        // =====================================================

        System.out.println(
                "\nExample 16: Shortest String"
        );

        Optional<String> shortest =
                names.stream()

                        .min(
                                Comparator.comparingInt(
                                        String::length
                                )
                        );

        System.out.println(
                "Shortest = " + shortest
        );


        // =====================================================
        // Example 17: Longest String
        // =====================================================

        System.out.println(
                "\nExample 17: Longest String"
        );

        Optional<String> longest =
                names.stream()

                        .max(
                                Comparator.comparingInt(
                                        String::length
                                )
                        );

        System.out.println(
                "Longest = " + longest
        );


        // =====================================================
        // Example 18: Tie handling
        // =====================================================

        System.out.println(
                "\nExample 18: Tie"
        );

        List<String> words =
                Arrays.asList(
                        "Cat",
                        "Dog",
                        "Ant"
                );

        Optional<String> shortestWord =
                words.stream()

                        .min(
                                Comparator.comparingInt(
                                        String::length
                                )
                        );

        System.out.println(
                "Shortest = "
                        + shortestWord
        );


        // =====================================================
        // Example 19: Multiple sorting criteria
        // =====================================================

        System.out.println(
                "\nExample 19: Multiple criteria"
        );

//        Optional<EmployeeMinMax> result =
//                employees.stream()
//
//                        .min(
//                                Comparator
//                                        .comparingInt(
//                                                emp -> emp.age
//                                        )
//                                        .thenComparing(
//                                                emp -> emp.name
//                                        )
//                        );
//
//        System.out.println(
//                "Result = " + result
//        );


        // =====================================================
        // Example 20: Empty stream
        // =====================================================

        System.out.println(
                "\nExample 20: Empty stream"
        );

        Optional<Integer> emptyMin =
                Stream.<Integer>empty()
                        .min(Integer::compareTo);

        Optional<Integer> emptyMax =
                Stream.<Integer>empty()
                        .max(Integer::compareTo);

        System.out.println(
                "Empty min = " + emptyMin
        );

        System.out.println(
                "Empty max = " + emptyMax
        );


        // =====================================================
        // Example 21: min() + orElse()
        // =====================================================

        System.out.println(
                "\nExample 21: min + orElse"
        );

        int minimumValue =
                numbers.stream()

                        .min(Integer::compareTo)

                        .orElse(-1);

        System.out.println(
                "Minimum = " + minimumValue
        );


        // =====================================================
        // Example 22: max() + orElseThrow()
        // =====================================================

        System.out.println(
                "\nExample 22: max + orElseThrow"
        );

        int maximumValue =
                numbers.stream()

                        .max(Integer::compareTo)

                        .orElseThrow();

        System.out.println(
                "Maximum = " + maximumValue
        );


        // =====================================================
        // Example 23: min() is short-circuiting?
        // =====================================================

        System.out.println(
                "\nExample 23: min() processing"
        );

        Optional<Integer> minWithPeek =
                numbers.stream()

                        .peek(n ->
                                System.out.println(
                                        "Checking: " + n
                                )
                        )

                        .min(Integer::compareTo);

        System.out.println(
                "Min = " + minWithPeek
        );


        // =====================================================
        // Example 24: Parallel min()
        // =====================================================

        System.out.println(
                "\nExample 24: Parallel min"
        );

        Optional<Integer> parallelMin =
                IntStream.rangeClosed(
                                1,
                                1_000_000
                        )

                        .parallel()

                        .boxed()

                        .min(Integer::compareTo);

        System.out.println(
                "Parallel min = "
                        + parallelMin
        );


        // =====================================================
        // Example 25: Parallel max()
        // =====================================================

        System.out.println(
                "\nExample 25: Parallel max"
        );

        Optional<Integer> parallelMax =
                IntStream.rangeClosed(
                                1,
                                1_000_000
                        )

                        .parallel()

                        .boxed()

                        .max(Integer::compareTo);

        System.out.println(
                "Parallel max = "
                        + parallelMax
        );


        // =====================================================
        // Example 26: Primitive IntStream min()
        // =====================================================

        System.out.println(
                "\nExample 26: IntStream min"
        );

        OptionalInt primitiveMin =
                IntStream.of(
                        50, 10, 40, 20, 30
                )
                .min();

        System.out.println(
                "Primitive min = "
                        + primitiveMin
        );


        // =====================================================
        // Example 27: Primitive IntStream max()
        // =====================================================

        System.out.println(
                "\nExample 27: IntStream max"
        );

        OptionalInt primitiveMax =
                IntStream.of(
                        50, 10, 40, 20, 30
                )
                .max();

        System.out.println(
                "Primitive max = "
                        + primitiveMax
        );


        // =====================================================
        // Example 28: OptionalInt value
        // =====================================================

        System.out.println(
                "\nExample 28: OptionalInt"
        );

        int primitiveMinimum =
                IntStream.of(
                        50, 10, 40
                )
                .min()
                .orElse(-1);

        System.out.println(
                "Minimum = "
                        + primitiveMinimum
        );

    }
}