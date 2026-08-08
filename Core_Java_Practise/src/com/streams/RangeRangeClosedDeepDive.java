package com.streams;

import java.util.stream.*;

public class RangeRangeClosedDeepDive {

    public static void main(String[] args) {

        // =====================================================
        // range()
        // =====================================================

        IntStream.range(
                1,
                5
        )
        .forEach(
                System.out::println
        );

        // 1 2 3 4


        // =====================================================
        // rangeClosed()
        // =====================================================

        IntStream.rangeClosed(
                1,
                5
        )
        .forEach(
                System.out::println
        );

        // 1 2 3 4 5


        // =====================================================
        // Sum
        // =====================================================

        int sum =
                IntStream.rangeClosed(
                        1,
                        100
                )
                .sum();

        System.out.println(sum);


        // =====================================================
        // Even numbers
        // =====================================================

        IntStream.rangeClosed(
                1,
                20
        )
        .filter(
                n -> n % 2 == 0
        )
        .forEach(
                System.out::println
        );
    }
}
