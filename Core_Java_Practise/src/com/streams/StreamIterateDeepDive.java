package com.streams;

import java.util.stream.*;

public class StreamIterateDeepDive {

    public static void main(String[] args) {

        // 1,2,3,4,5...

        Stream.iterate(
                1,
                n -> n + 1
        )
        .limit(5)
        .forEach(
                System.out::println
        );


        // Powers of 2

        Stream.iterate(
                1,
                n -> n * 2
        )
        .limit(6)
        .forEach(
                System.out::println
        );


        // Java 9 three-argument iterate

        Stream.iterate(
                1,
                n -> n <= 10,
                n -> n + 1
        )
        .forEach(
                System.out::println
        );


        // Even numbers

        Stream.iterate(
                2,
                n -> n <= 20,
                n -> n + 2
        )
        .forEach(
                System.out::println
        );
    }
}
