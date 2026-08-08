package com.streams;

import java.util.*;
import java.util.stream.*;

public class StreamConcatDeepDive {

    public static void main(String[] args) {

        Stream<Integer> s1 =
                Stream.of(1, 2, 3);

        Stream<Integer> s2 =
                Stream.of(4, 5, 6);

        Stream<Integer> combined =
                Stream.concat(s1, s2);

        combined.forEach(
                System.out::println
        );


        // Three streams

        Stream<Integer> a =
                Stream.of(1, 2);

        Stream<Integer> b =
                Stream.of(3, 4);

        Stream<Integer> c =
                Stream.of(5, 6);

        Stream.concat(
                Stream.concat(a, b),
                c
        )
        .forEach(
                System.out::println
        );


        // concat + filter

        Stream.concat(
                Stream.of(1, 2, 3),
                Stream.of(4, 5, 6)
        )
        .filter(n -> n % 2 == 0)
        .forEach(
                System.out::println
        );
    }
}
