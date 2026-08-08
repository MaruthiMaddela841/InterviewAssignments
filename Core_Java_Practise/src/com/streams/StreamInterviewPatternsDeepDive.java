package com.streams;

import java.util.*;
import java.util.stream.*;

public class StreamInterviewPatternsDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        10, 20, 20, 30,
                        40, 40, 50
                );


        // =====================================================
        // 1. Find even numbers
        // =====================================================

        List<Integer> even =
                numbers.stream()

                        .filter(
                                n -> n % 2 == 0
                        )

                        .collect(
                                Collectors.toList()
                        );

        System.out.println(even);


        // =====================================================
        // 2. Find unique numbers
        // =====================================================

        List<Integer> unique =
                numbers.stream()

                        .distinct()

                        .collect(
                                Collectors.toList()
                        );

        System.out.println(unique);


        // =====================================================
        // 3. Find maximum
        // =====================================================

        int max =
                numbers.stream()

                        .max(Integer::compareTo)

                        .orElse(-1);

        System.out.println(max);


        // =====================================================
        // 4. Find minimum
        // =====================================================

        int min =
                numbers.stream()

                        .min(Integer::compareTo)

                        .orElse(-1);

        System.out.println(min);


        // =====================================================
        // 5. Count even numbers
        // =====================================================

        long evenCount =
                numbers.stream()

                        .filter(
                                n -> n % 2 == 0
                        )

                        .count();

        System.out.println(evenCount);


        // =====================================================
        // 6. Does an even number exist?
        // =====================================================

        boolean exists =
                numbers.stream()

                        .anyMatch(
                                n -> n % 2 == 0
                        );

        System.out.println(exists);


        // =====================================================
        // 7. Are all positive?
        // =====================================================

        boolean allPositive =
                numbers.stream()

                        .allMatch(
                                n -> n > 0
                        );

        System.out.println(allPositive);


        // =====================================================
        // 8. Are there no negative numbers?
        // =====================================================

        boolean noNegative =
                numbers.stream()

                        .noneMatch(
                                n -> n < 0
                        );

        System.out.println(noNegative);


        // =====================================================
        // 9. First element
        // =====================================================

        Optional<Integer> first =
                numbers.stream()
                        .findFirst();

        System.out.println(first);


        // =====================================================
        // 10. First even element
        // =====================================================

        Optional<Integer> firstEven =
                numbers.stream()

                        .filter(
                                n -> n % 2 == 0
                        )

                        .findFirst();

        System.out.println(firstEven);


        // =====================================================
        // 11. Sum
        // =====================================================

        int sum =
                numbers.stream()

                        .mapToInt(
                                Integer::intValue
                        )

                        .sum();

        System.out.println(sum);


        // =====================================================
        // 12. Average
        // =====================================================

        double average =
                numbers.stream()

                        .mapToInt(
                                Integer::intValue
                        )

                        .average()

                        .orElse(0);

        System.out.println(average);


        // =====================================================
        // 13. Sort ascending
        // =====================================================

        List<Integer> ascending =
                numbers.stream()

                        .sorted()

                        .collect(
                                Collectors.toList()
                        );

        System.out.println(ascending);


        // =====================================================
        // 14. Sort descending
        // =====================================================

        List<Integer> descending =
                numbers.stream()

                        .sorted(
                                Comparator.reverseOrder()
                        )

                        .collect(
                                Collectors.toList()
                        );

        System.out.println(descending);


        // =====================================================
        // 15. Top 3 numbers
        // =====================================================

        List<Integer> top3 =
                numbers.stream()

                        .sorted(
                                Comparator.reverseOrder()
                        )

                        .limit(3)

                        .collect(
                                Collectors.toList()
                        );

        System.out.println(top3);


        // =====================================================
        // 16. Second highest distinct number
        // =====================================================

        Optional<Integer> secondHighest =
                numbers.stream()

                        .distinct()

                        .sorted(
                                Comparator.reverseOrder()
                        )

                        .skip(1)

                        .findFirst();

        System.out.println(secondHighest);


        // =====================================================
        // 17. Frequency of each number
        // =====================================================

        Map<Integer, Long> frequency =
                numbers.stream()

                        .collect(
                                Collectors.groupingBy(
                                        n -> n,
                                        Collectors.counting()
                                )
                        );

        System.out.println(frequency);


        // =====================================================
        // 18. Convert to Set
        // =====================================================

        Set<Integer> set =
                numbers.stream()

                        .collect(
                                Collectors.toSet()
                        );

        System.out.println(set);


        // =====================================================
        // 19. Convert to array
        // =====================================================

        Integer[] array =
                numbers.stream()

                        .toArray(
                                Integer[]::new
                        );

        System.out.println(
                Arrays.toString(array)
        );


        // =====================================================
        // 20. Partition even / odd
        // =====================================================

        Map<Boolean, List<Integer>> partition =
                numbers.stream()

                        .collect(
                                Collectors.partitioningBy(
                                        n -> n % 2 == 0
                                )
                        );

        System.out.println(partition);


        // =====================================================
        // 21. Group numbers by parity
        // =====================================================

        Map<String, List<Integer>> grouped =
                numbers.stream()

                        .collect(
                                Collectors.groupingBy(
                                        n ->
                                                n % 2 == 0
                                                        ? "EVEN"
                                                        : "ODD"
                                )
                        );

        System.out.println(grouped);


        // =====================================================
        // 22. Join Strings
        // =====================================================

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob"
                );

        String joined =
                names.stream()

                        .collect(
                                Collectors.joining(
                                        ", "
                                )
                        );

        System.out.println(joined);


        // =====================================================
        // 23. Longest String
        // =====================================================

        Optional<String> longest =
                names.stream()

                        .max(
                                Comparator.comparingInt(
                                        String::length
                                )
                        );

        System.out.println(longest);


        // =====================================================
        // 24. Shortest String
        // =====================================================

        Optional<String> shortest =
                names.stream()

                        .min(
                                Comparator.comparingInt(
                                        String::length
                                )
                        );

        System.out.println(shortest);


        // =====================================================
        // 25. Convert names to uppercase
        // =====================================================

        List<String> upper =
                names.stream()

                        .map(
                                String::toUpperCase
                        )

                        .collect(
                                Collectors.toList()
                        );

        System.out.println(upper);
    }
}
