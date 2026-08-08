package com.streams;

import java.util.*;
import java.util.stream.*;

public class StreamReduceDeepDive {

    public static void main(String[] args) {

        // =====================================================
        // Example 1: Sum of Numbers
        // =====================================================
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Example 1 - Sum = " + sum);


        // =====================================================
        // Example 2: Product
        // =====================================================

        int product = nums.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Example 2 - Product = " + product);


        // =====================================================
        // Example 3: Maximum
        // =====================================================

        int max = nums.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));

        System.out.println("Example 3 - Max = " + max);


        // =====================================================
        // Example 4: Minimum
        // =====================================================

        int min = nums.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> Math.min(a, b));

        System.out.println("Example 4 - Min = " + min);


        // =====================================================
        // Example 5: Count Elements
        // =====================================================

        int count = nums.stream()
                .reduce(0,
                        (countSoFar, n) -> countSoFar + 1);

        System.out.println("Example 5 - Count = " + count);


        // =====================================================
        // Example 6: Concatenate Strings
        // =====================================================

        List<String> names =
                Arrays.asList("John", "Alice", "Bob");

        String allNames = names.stream()
                .reduce("",
                        (result, name) -> result + name + " ");

        System.out.println("Example 6 - " + allNames.trim());


        // =====================================================
        // Example 7: CSV String
        // =====================================================

        String csv = names.stream()
                .reduce("",
                        (result, name) ->
                                result.isEmpty()
                                        ? name
                                        : result + "," + name);

        System.out.println("Example 7 - " + csv);


        // =====================================================
        // Example 8: Longest String
        // =====================================================

        String longest = names.stream()
                .reduce("",
                        (a, b) ->
                                a.length() > b.length()
                                        ? a
                                        : b);

        System.out.println("Example 8 - Longest = " + longest);


        // =====================================================
        // Example 9: Using Method Reference
        // =====================================================

        int sum2 = nums.stream()
                .reduce(0, Integer::sum);

        System.out.println("Example 9 - Sum = " + sum2);


        // =====================================================
        // Example 10: Reduce without Identity
        // Returns Optional<T>
        // =====================================================

        Optional<Integer> total =
                nums.stream()
                        .reduce((a, b) -> a + b);

        System.out.println("Example 10 - " + total.get());


        // =====================================================
        // Example 11: Reduce on Empty Stream
        // =====================================================

        List<Integer> empty = new ArrayList<>();

        Optional<Integer> result =
                empty.stream()
                        .reduce((a, b) -> a + b);

        System.out.println("Example 11 - " + result);


        // =====================================================
        // Example 12: Parallel Stream
        // =====================================================

        int parallelSum = nums.parallelStream()
                .reduce(
                        0,
                        Integer::sum,
                        Integer::sum);

        System.out.println("Example 12 - Parallel Sum = "
                + parallelSum);


        // =====================================================
        // Example 13: Merge Lists
        // =====================================================

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> merged =
                lists.stream()
                        .reduce(
                                new ArrayList<>(),
                                (list1, list2) -> {

                                    list1.addAll(list2);

                                    return list1;

                                });

        System.out.println("Example 13 - " + merged);


        // =====================================================
        // Example 14: Total Characters
        // =====================================================

        int totalCharacters =
                names.stream()
                        .reduce(
                                0,
                                (sumChars, name) ->
                                        sumChars + name.length(),
                                Integer::sum);

        System.out.println("Example 14 - Total Characters = "
                + totalCharacters);


        // =====================================================
        // Example 15: Build Sentence
        // =====================================================

        String sentence =
                names.stream()
                        .reduce(
                                "Names:",
                                (resultString, name) ->
                                        resultString + " " + name);

        System.out.println("Example 15 - " + sentence);
    }
}