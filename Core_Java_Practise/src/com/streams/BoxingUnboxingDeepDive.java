package com.streams;

import java.util.*;
import java.util.stream.*;

public class BoxingUnboxingDeepDive {

    public static void main(String[] args) {

        // =====================================================
        // Stream<Integer> → IntStream
        // =====================================================

        List<Integer> numbers =
                Arrays.asList(
                        10, 20, 30
                );

        IntStream intStream =
                numbers.stream()
                        .mapToInt(
                                Integer::intValue
                        );

        intStream.forEach(
                System.out::println
        );


        // =====================================================
        // IntStream → Stream<Integer>
        // =====================================================

        Stream<Integer> boxed =
                IntStream.of(
                        10, 20, 30
                )
                .boxed();

        boxed.forEach(
                System.out::println
        );


        // =====================================================
        // mapToLong()
        // =====================================================

        LongStream longs =
                numbers.stream()
                        .mapToLong(
                                Integer::longValue
                        );

        longs.forEach(
                System.out::println
        );


        // =====================================================
        // mapToDouble()
        // =====================================================

        DoubleStream doubles =
                numbers.stream()
                        .mapToDouble(
                                Integer::doubleValue
                        );

        doubles.forEach(
                System.out::println
        );


        // =====================================================
        // sum without boxing
        // =====================================================

        int sum =
                numbers.stream()
                        .mapToInt(
                                Integer::intValue
                        )
                        .sum();

        System.out.println(sum);
    }
}
