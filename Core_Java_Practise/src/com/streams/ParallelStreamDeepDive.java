package com.streams;

import java.util.*;
import java.util.stream.*;

public class ParallelStreamDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                IntStream.rangeClosed(
                        1,
                        20
                )
                .boxed()
                .collect(
                        Collectors.toList()
                );


        // =====================================================
        // Sequential
        // =====================================================

        numbers.stream()

                .forEach(
                        n ->
                                System.out.println(
                                        Thread.currentThread()
                                                .getName()
                                                + " -> "
                                                + n
                                )
                );


        // =====================================================
        // Parallel
        // =====================================================

        numbers.parallelStream()

                .forEach(
                        n ->
                                System.out.println(
                                        Thread.currentThread()
                                                .getName()
                                                + " -> "
                                                + n
                                )
                );


        // =====================================================
        // forEachOrdered
        // =====================================================

        numbers.parallelStream()

                .forEachOrdered(
                        n ->
                                System.out.println(n)
                );


        // =====================================================
        // Parallel sum
        // =====================================================

        int sum =
                numbers.parallelStream()
                        .mapToInt(
                                Integer::intValue
                        )
                        .sum();

        System.out.println(
                "Sum = " + sum
        );


        // =====================================================
        // Parallel findAny
        // =====================================================

        Optional<Integer> any =
                numbers.parallelStream()
                        .findAny();

        System.out.println(any);


        // =====================================================
        // Parallel findFirst
        // =====================================================

        Optional<Integer> first =
                numbers.parallelStream()
                        .findFirst();

        System.out.println(first);


        // =====================================================
        // Parallel max
        // =====================================================

        Optional<Integer> max =
                numbers.parallelStream()
                        .max(Integer::compareTo);

        System.out.println(max);
    }
}
