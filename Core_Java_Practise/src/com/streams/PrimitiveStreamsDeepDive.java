package com.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.*;

public class PrimitiveStreamsDeepDive {

    public static void main(String[] args) {

        // =====================================================
        // IntStream
        // =====================================================

        IntStream ints =
                IntStream.of(
                        10, 20, 30
                );

        ints.forEach(
                System.out::println
        );


        // =====================================================
        // LongStream
        // =====================================================

        LongStream longs =
                LongStream.of(
                        100L,
                        200L,
                        300L
                );

        longs.forEach(
                System.out::println
        );


        // =====================================================
        // DoubleStream
        // =====================================================

        DoubleStream doubles =
                DoubleStream.of(
                        10.5,
                        20.5
                );

        doubles.forEach(
                System.out::println
        );


        // =====================================================
        // sum()
        // =====================================================

        int sum =
                IntStream.of(
                        10, 20, 30
                )
                .sum();

        System.out.println(sum);


        // =====================================================
        // average()
        // =====================================================

        double average =
                IntStream.of(
                        10, 20, 30
                )
                .average()
                .orElse(0);

        System.out.println(average);


        // =====================================================
        // min()
        // =====================================================

        int min =
                IntStream.of(
                        30, 10, 20
                )
                .min()
                .orElse(-1);

        System.out.println(min);


        // =====================================================
        // max()
        // =====================================================

        int max =
                IntStream.of(
                        30, 10, 20
                )
                .max()
                .orElse(-1);

        System.out.println(max);


        // =====================================================
        // summaryStatistics()
        // =====================================================

        IntSummaryStatistics stats =
                IntStream.of(
                        10, 20, 30, 40
                )
                .summaryStatistics();

        System.out.println(
                stats
        );
    }
}