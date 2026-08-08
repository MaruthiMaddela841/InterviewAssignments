package com.streams;

import java.util.*;
import java.util.stream.*;

public class DistinctDeepDive {

    public static void main(String[] args) {

        //------------------------------------------------------
        // Example 1
        //------------------------------------------------------

        System.out.println("Example 1 : Integer");

        List<Integer> numbers =
                Arrays.asList(
                        10,20,20,30,30,30,40,50,50
                );

        numbers.stream()
                .distinct()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 2
        //------------------------------------------------------

        System.out.println("\nExample 2 : String");

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "John",
                        "Bob",
                        "Alice"
                );

        names.stream()
                .distinct()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 3
        //------------------------------------------------------

        System.out.println("\nExample 3 : Count");

        long count =
                names.stream()
                        .distinct()
                        .count();

        System.out.println(count);



        //------------------------------------------------------
        // Example 4
        //------------------------------------------------------

        System.out.println("\nExample 4 : Sorted + Distinct");

        numbers.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 5
        //------------------------------------------------------

        System.out.println("\nExample 5 : Distinct + Sorted");

        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 6
        //------------------------------------------------------

        System.out.println("\nExample 6 : map() + distinct()");

        names.stream()
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 7
        //------------------------------------------------------

        System.out.println("\nExample 7 : Employee Objects");

        List<EmployeeDistinct> employees =
                Arrays.asList(

                        new EmployeeDistinct(101,"John","IT"),

                        new EmployeeDistinct(102,"Alice","HR"),

                        new EmployeeDistinct(101,"John","IT"),

                        new EmployeeDistinct(103,"Bob","Finance"),

                        new EmployeeDistinct(102,"Alice","HR")

                );

        employees.stream()
                .distinct()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 8
        //------------------------------------------------------

        System.out.println("\nExample 8 : Department");

        employees.stream()
                .map(emp -> emp.department)
                .distinct()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 9
        //------------------------------------------------------

        System.out.println("\nExample 9 : Parallel");

        numbers.parallelStream()
                .distinct()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 10
        //------------------------------------------------------

        System.out.println("\nExample 10 : Collect");

        List<Integer> unique =
                numbers.stream()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(unique);



        //------------------------------------------------------
        // Example 11
        //------------------------------------------------------

        System.out.println("\nExample 11 : Filter + Distinct");

        numbers.stream()

                .filter(n -> n > 20)

                .distinct()

                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 12
        //------------------------------------------------------

        System.out.println("\nExample 12 : Reduce");

        int sum =
                numbers.stream()

                        .distinct()

                        .reduce(0,Integer::sum);

        System.out.println(sum);



        //------------------------------------------------------
        // Example 13
        //------------------------------------------------------

        System.out.println("\nExample 13 : Primitive Stream");

        IntStream.of(
                1,2,2,3,4,4,5
        )
                .distinct()
                .forEach(System.out::println);



        //------------------------------------------------------
        // Example 14
        //------------------------------------------------------

        System.out.println("\nExample 14 : Find First");

        names.stream()

                .distinct()

                .findFirst()

                .ifPresent(System.out::println);



        //------------------------------------------------------
        // Example 15
        //------------------------------------------------------

        System.out.println("\nExample 15 : Chain");

        names.stream()

                .map(String::toUpperCase)

                .filter(s -> s.length()>3)

                .distinct()

                .sorted()

                .forEach(System.out::println);

    }

}
