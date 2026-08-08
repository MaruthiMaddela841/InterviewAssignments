package com.streams;

import java.util.*;

public class OptionalDeepDive {

    public static void main(String[] args) {

        // =====================================================
        // 1. Optional.of()
        // =====================================================

        Optional<String> name =
                Optional.of("John");

        System.out.println(name);


        // =====================================================
        // 2. Optional.empty()
        // =====================================================

        Optional<String> empty =
                Optional.empty();

        System.out.println(empty);


        // =====================================================
        // 3. Optional.ofNullable()
        // =====================================================

        String value = null;

        Optional<String> result =
                Optional.ofNullable(value);

        System.out.println(result);


        // =====================================================
        // 4. isPresent()
        // =====================================================

        Optional<String> name2 =
                Optional.of("Alice");

        System.out.println(
                name2.isPresent()
        );


        // =====================================================
        // 5. isEmpty()
        // =====================================================

        System.out.println(
                empty.isEmpty()
        );


        // =====================================================
        // 6. get()
        // =====================================================

        System.out.println(
                name2.get()
        );


        // =====================================================
        // 7. ifPresent()
        // =====================================================

        name2.ifPresent(
                n -> System.out.println(
                        "Name = " + n
                )
        );


        // =====================================================
        // 8. ifPresentOrElse()
        // =====================================================

        empty.ifPresentOrElse(

                n -> System.out.println(n),

                () -> System.out.println(
                        "No value"
                )
        );


        // =====================================================
        // 9. orElse()
        // =====================================================

        String result1 =
                empty.orElse("Default");

        System.out.println(result1);


        // =====================================================
        // 10. orElseGet()
        // =====================================================

        String result2 =
                empty.orElseGet(
                        () -> "Generated Default"
                );

        System.out.println(result2);


        // =====================================================
        // 11. orElseThrow()
        // =====================================================

        try {

            String result3 =
                    empty.orElseThrow();

        } catch (NoSuchElementException e) {

            System.out.println(
                    "No value found"
            );
        }


        // =====================================================
        // 12. map()
        // =====================================================

        Optional<String> upper =
                name2.map(
                        String::toUpperCase
                );

        System.out.println(upper);


        // =====================================================
        // 13. filter()
        // =====================================================

        Optional<String> filtered =
                name2.filter(
                        n -> n.length() > 3
                );

        System.out.println(filtered);


        // =====================================================
        // 14. flatMap()
        // =====================================================

        Optional<String> flatMapped =
                name2.flatMap(
                        n -> Optional.of(
                                n.toUpperCase()
                        )
                );

        System.out.println(flatMapped);


        // =====================================================
        // 15. Stream + Optional
        // =====================================================

        List<Integer> numbers =
                Arrays.asList(
                        10, 20, 30, 40
                );

        Optional<Integer> first =
                numbers.stream()
                        .filter(n -> n > 25)
                        .findFirst();

        System.out.println(first);


        // =====================================================
        // 16. Optional + orElse
        // =====================================================

        int firstValue =
                numbers.stream()
                        .filter(n -> n > 100)
                        .findFirst()
                        .orElse(-1);

        System.out.println(firstValue);


        // =====================================================
        // 17. Optional chain
        // =====================================================

        String finalResult =
                Optional.of("hello")
                        .filter(s -> s.length() > 3)
                        .map(String::toUpperCase)
                        .orElse("DEFAULT");

        System.out.println(finalResult);
    }
}