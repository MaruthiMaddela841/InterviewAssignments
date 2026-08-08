package com.streams;

import java.util.stream.*;

public class StreamGenerateDeepDive {

    public static void main(String[] args) {

        // Infinite stream

        Stream<Double> randomNumbers =
                Stream.generate(
                        Math::random
                );

        randomNumbers
                .limit(5)
                .forEach(
                        System.out::println
                );


        // Constant values

        Stream<String> hello =
                Stream.generate(
                        () -> "Hello"
                );

        hello
                .limit(5)
                .forEach(
                        System.out::println
                );


        // Counter

        int[] counter = {1};

        Stream.generate(
                () -> counter[0]++
        )
        .limit(5)
        .forEach(
                System.out::println
        );
    }
}
