package com.streams;

import java.util.*;
import java.util.stream.*;

public class FlatMapDeepDive {

    public static void main(String[] args) {

        //----------------------------------------------------------
        // Example 1 : map()
        //----------------------------------------------------------

        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        System.out.println("Example 1 : map()");

        numbers.stream()
                .map(list -> list)
                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 2 : flatMap()
        //----------------------------------------------------------

        System.out.println("\nExample 2 : flatMap()");

        numbers.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 3 : Collect
        //----------------------------------------------------------

        System.out.println("\nExample 3 : Collect");

        List<Integer> merged =
                numbers.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        System.out.println(merged);



        //----------------------------------------------------------
        // Example 4 : Square after flatMap
        //----------------------------------------------------------

        System.out.println("\nExample 4 : Square");

        numbers.stream()
                .flatMap(List::stream)
                .map(n -> n*n)
                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 5 : Distinct
        //----------------------------------------------------------

        List<List<Integer>> duplicateNumbers =
                Arrays.asList(

                        Arrays.asList(1,2),

                        Arrays.asList(2,3),

                        Arrays.asList(3,4)

                );

        System.out.println("\nExample 5 : Distinct");

        duplicateNumbers.stream()
                .flatMap(List::stream)
                .distinct()
                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 6 : Sum
        //----------------------------------------------------------

        System.out.println("\nExample 6 : Sum");

        int sum =
                numbers.stream()
                        .flatMap(List::stream)
                        .reduce(0,Integer::sum);

        System.out.println(sum);



        //----------------------------------------------------------
        // Example 7 : EmployeeFlatMap Skills
        //----------------------------------------------------------

        List<EmployeeFlatMap> employees =
                Arrays.asList(

                        new EmployeeFlatMap(
                                101,
                                "John",
                                Arrays.asList(
                                        "Java",
                                        "Spring",
                                        "SQL"
                                )
                        ),

                        new EmployeeFlatMap(
                                102,
                                "Alice",
                                Arrays.asList(
                                        "React",
                                        "JavaScript"
                                )
                        ),

                        new EmployeeFlatMap(
                                103,
                                "Bob",
                                Arrays.asList(
                                        "Java",
                                        "Docker",
                                        "Kubernetes"
                                )
                        )

                );

        System.out.println("\nExample 7 : Skills");

        employees.stream()
                .flatMap(emp -> emp.skills.stream())
                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 8 : Unique Skills
        //----------------------------------------------------------

        System.out.println("\nExample 8 : Unique Skills");

        employees.stream()
                .flatMap(emp -> emp.skills.stream())
                .distinct()
                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 9 : Sort Skills
        //----------------------------------------------------------

        System.out.println("\nExample 9 : Sorted Skills");

        employees.stream()
                .flatMap(emp -> emp.skills.stream())
                .distinct()
                .sorted()
                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 10 : Count Skills
        //----------------------------------------------------------

        System.out.println("\nExample 10 : Skill Count");

        long count =
                employees.stream()
                        .flatMap(emp -> emp.skills.stream())
                        .count();

        System.out.println(count);



        //----------------------------------------------------------
        // Example 11 : Optional.flatMap()
        //----------------------------------------------------------

        Optional<String> optional =
                Optional.of("java");

        Optional<Integer> length =
                optional.flatMap(
                        s -> Optional.of(s.length())
                );

        System.out.println("\nExample 11 : Optional");

        System.out.println(length);



        //----------------------------------------------------------
        // Example 12 : Strings to Characters
        //----------------------------------------------------------

        List<String> words =
                Arrays.asList(
                        "JAVA",
                        "SQL"
                );

        System.out.println("\nExample 12 : Characters");

        words.stream()

                .flatMap(
                        word ->
                                word.chars()
                                        .mapToObj(c -> (char)c)
                )

                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 13 : Parallel
        //----------------------------------------------------------

        System.out.println("\nExample 13 : Parallel");

        numbers.parallelStream()

                .flatMap(List::stream)

                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 14 : Filter after flatMap
        //----------------------------------------------------------

        System.out.println("\nExample 14 : Even Numbers");

        numbers.stream()

                .flatMap(List::stream)

                .filter(n -> n%2==0)

                .forEach(System.out::println);



        //----------------------------------------------------------
        // Example 15 : Max
        //----------------------------------------------------------

        System.out.println("\nExample 15 : Maximum");

        Integer max =
                numbers.stream()

                        .flatMap(List::stream)

                        .max(Integer::compareTo)

                        .get();

        System.out.println(max);

    }

}
