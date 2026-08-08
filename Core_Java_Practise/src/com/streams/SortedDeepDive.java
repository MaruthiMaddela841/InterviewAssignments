package com.streams;

import java.util.*;
import java.util.stream.*;

public class SortedDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        50,20,80,10,60,30,40
                );

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "David",
                        "Bob",
                        "Chris"
                );

        List<Employee> employees =
                Arrays.asList(

                        new Employee(101,"John",25,50000,"IT"),

                        new Employee(102,"Alice",30,70000,"HR"),

                        new Employee(103,"Bob",22,40000,"Finance"),

                        new Employee(104,"David",35,90000,"IT"),

                        new Employee(105,"Chris",28,60000,"HR")

                );

        //--------------------------------------------------
        // Example 1
        //--------------------------------------------------

        System.out.println("Example 1 : Natural Order");

        numbers.stream()
                .sorted()
                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 2
        //--------------------------------------------------

        System.out.println("\nExample 2 : Reverse Order");

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 3
        //--------------------------------------------------

        System.out.println("\nExample 3 : String Sorting");

        names.stream()
                .sorted()
                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 4
        //--------------------------------------------------

        System.out.println("\nExample 4 : Reverse Strings");

        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 5
        //--------------------------------------------------

        System.out.println("\nExample 5 : Employee Name");

        employees.stream()
                .sorted(
                        Comparator.comparing(emp -> emp.name)
                )
                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 6
        //--------------------------------------------------

        System.out.println("\nExample 6 : Salary");

        employees.stream()

                .sorted(
                        Comparator.comparingDouble(
                                emp -> emp.salary
                        )
                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 7
        //--------------------------------------------------

        System.out.println("\nExample 7 : Salary Desc");

        employees.stream()

                .sorted(
                        Comparator.comparingDouble(
                                (Employee emp)->emp.salary
                        ).reversed()
                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 8
        //--------------------------------------------------

        System.out.println("\nExample 8 : Age");

        employees.stream()

                .sorted(
                        Comparator.comparingInt(
                                emp -> emp.age
                        )
                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 9
        //--------------------------------------------------

        System.out.println("\nExample 9 : Department");

        employees.stream()

                .sorted(
                        Comparator.comparing(
                                emp -> emp.department
                        )
                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 10
        //--------------------------------------------------

        System.out.println("\nExample 10 : Name then Salary");

        employees.stream()

                .sorted(

                        Comparator

                                .comparing(
                                        (Employee e)->e.name
                                )

                                .thenComparingDouble(
                                        e -> e.salary
                                )

                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 11
        //--------------------------------------------------

        System.out.println("\nExample 11 : Department then Age");

        employees.stream()

                .sorted(

                        Comparator

                                .comparing(
                                        (Employee e)->e.department
                                )

                                .thenComparingInt(
                                        e -> e.age
                                )

                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 12
        //--------------------------------------------------

        System.out.println("\nExample 12 : Length");

        names.stream()

                .sorted(
                        Comparator.comparingInt(
                                String::length
                        )
                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 13
        //--------------------------------------------------

        System.out.println("\nExample 13 : Ignore Case");

        names.stream()

                .sorted(
                        String.CASE_INSENSITIVE_ORDER
                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 14
        //--------------------------------------------------

        System.out.println("\nExample 14 : nullsFirst");

        List<String> list =
                Arrays.asList(
                        "John",
                        null,
                        "Bob",
                        "Alice"
                );

        list.stream()

                .sorted(
                        Comparator.nullsFirst(
                                Comparator.naturalOrder()
                        )
                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 15
        //--------------------------------------------------

        System.out.println("\nExample 15 : nullsLast");

        list.stream()

                .sorted(
                        Comparator.nullsLast(
                                Comparator.naturalOrder()
                        )
                )

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 16
        //--------------------------------------------------

        System.out.println("\nExample 16 : distinct + sorted");

        Arrays.asList(5,4,3,2,1,2,3,4)

                .stream()

                .distinct()

                .sorted()

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 17
        //--------------------------------------------------

        System.out.println("\nExample 17 : limit");

        numbers.stream()

                .sorted()

                .limit(3)

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 18
        //--------------------------------------------------

        System.out.println("\nExample 18 : skip");

        numbers.stream()

                .sorted()

                .skip(2)

                .forEach(System.out::println);



        //--------------------------------------------------
        // Example 19
        //--------------------------------------------------

        System.out.println("\nExample 19 : Max");

        numbers.stream()

                .sorted(Comparator.reverseOrder())

                .findFirst()

                .ifPresent(System.out::println);



        //--------------------------------------------------
        // Example 20
        //--------------------------------------------------

        System.out.println("\nExample 20 : Parallel");

        numbers.parallelStream()

                .sorted()

                .forEach(System.out::println);

    }

}
