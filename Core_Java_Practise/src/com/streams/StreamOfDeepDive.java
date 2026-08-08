package com.streams;

import java.util.stream.*;

public class StreamOfDeepDive {

    public static void main(String[] args) {

        Stream<String> names =
                Stream.of(
                        "John",
                        "Alice",
                        "Bob"
                );

        names.forEach(
                System.out::println
        );


        // One value

        Stream<Integer> one =
                Stream.of(10);

        one.forEach(
                System.out::println
        );


        // Empty

        Stream<Integer> empty =
                Stream.empty();

        System.out.println(
                empty.count()
        );


        // Array

        Integer[] numbers =
                {10, 20, 30};

        Stream<Integer> stream =
                Stream.of(numbers);

        stream.forEach(
                System.out::println
        );


        // Primitive

        IntStream ints =
                IntStream.of(
                        10, 20, 30
                );

        ints.forEach(
                System.out::println
        );
    }
}