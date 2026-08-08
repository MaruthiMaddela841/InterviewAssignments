package com.streams;

import java.util.*;
import java.util.stream.*;

public class CollectorsMappingDeepDive {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob"
                );


        // =====================================================
        // Simple mapping
        // =====================================================

        List<Integer> lengths =
                names.stream()

                        .collect(
                                Collectors.mapping(
                                        String::length,
                                        Collectors.toList()
                                )
                        );

        System.out.println(lengths);


        // =====================================================
        // Uppercase
        // =====================================================

        List<String> upper =
                names.stream()

                        .collect(
                                Collectors.mapping(
                                        String::toUpperCase,
                                        Collectors.toList()
                                )
                        );

        System.out.println(upper);


        // =====================================================
        // groupingBy + mapping
        // =====================================================

        class Person {

            String name;
            String city;

            Person(
                    String name,
                    String city
            ) {
                this.name = name;
                this.city = city;
            }
        }

        List<Person> people =
                Arrays.asList(
                        new Person("John", "NY"),
                        new Person("Alice", "NY"),
                        new Person("Bob", "LA")
                );


        Map<String, List<String>> result =
                people.stream()

                        .collect(
                                Collectors.groupingBy(

                                        p -> p.city,

                                        Collectors.mapping(
                                                p -> p.name,
                                                Collectors.toList()
                                        )
                                )
                        );

        System.out.println(result);
    }
}
