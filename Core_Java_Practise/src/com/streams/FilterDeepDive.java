package com.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FilterDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10,15,20,25,30,35,40,45,50);

        List<String> names =
                Arrays.asList(
                        "John",
                        "",
                        "Alice",
                        "Bob",
                        "",
                        "David",
                        "Christopher"
                );

        List<Employee> employees = Arrays.asList(

                new Employee(101,"John",24,50000,"IT"),

                new Employee(102,"Alice",30,70000,"HR"),

                new Employee(103,"Bob",22,35000,"IT"),

                new Employee(104,"David",40,90000,"Finance"),

                new Employee(105,"Chris",28,65000,"IT")

        );

        //-------------------------------------------------------
        // Example 1
        //-------------------------------------------------------

        System.out.println("Example 1 : Even Numbers");

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 2
        //-------------------------------------------------------

        System.out.println("\nExample 2 : Odd Numbers");

        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 3
        //-------------------------------------------------------

        System.out.println("\nExample 3 : Greater than 30");

        numbers.stream()
                .filter(n -> n > 30)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 4
        //-------------------------------------------------------

        System.out.println("\nExample 4 : Between 20 and 40");

        numbers.stream()
                .filter(n -> n >=20 && n<=40)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 5
        //-------------------------------------------------------

        System.out.println("\nExample 5 : Remove Empty Strings");

        names.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 6
        //-------------------------------------------------------

        System.out.println("\nExample 6 : Name starts with D");

        names.stream()
                .filter(s -> s.startsWith("D"))
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 7
        //-------------------------------------------------------

        System.out.println("\nExample 7 : Length > 4");

        names.stream()
                .filter(s -> s.length()>4)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 8
        //-------------------------------------------------------

        System.out.println("\nExample 8 : IT Employees");

        employees.stream()
                .filter(emp -> emp.department.equals("IT"))
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 9
        //-------------------------------------------------------

        System.out.println("\nExample 9 : Salary > 60000");

        employees.stream()
                .filter(emp -> emp.salary>60000)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 10
        //-------------------------------------------------------

        System.out.println("\nExample 10 : Age < 30");

        employees.stream()
                .filter(emp -> emp.age<30)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 11
        //-------------------------------------------------------

        System.out.println("\nExample 11 : Multiple Conditions");

        employees.stream()
                .filter(emp ->
                        emp.department.equals("IT")
                        &&
                        emp.salary>40000)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 12
        //-------------------------------------------------------

        System.out.println("\nExample 12 : Predicate Variable");

        Predicate<Integer> even =
                n -> n%2==0;

        numbers.stream()
                .filter(even)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 13
        //-------------------------------------------------------

        System.out.println("\nExample 13 : Predicate.and()");

        Predicate<Integer> greaterThan20 =
                n -> n>20;

        Predicate<Integer> lessThan45 =
                n -> n<45;

        numbers.stream()
                .filter(
                        greaterThan20.and(lessThan45)
                )
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 14
        //-------------------------------------------------------

        System.out.println("\nExample 14 : Predicate.or()");

        numbers.stream()
                .filter(
                        even.or(n -> n>40)
                )
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 15
        //-------------------------------------------------------

        System.out.println("\nExample 15 : Predicate.negate()");

        numbers.stream()
                .filter(even.negate())
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 16
        //-------------------------------------------------------

        System.out.println("\nExample 16 : Collect Result");

        List<Integer> evenList =
                numbers.stream()
                        .filter(even)
                        .collect(Collectors.toList());

        System.out.println(evenList);


        //-------------------------------------------------------
        // Example 17
        //-------------------------------------------------------

        System.out.println("\nExample 17 : Count");

        long count =
                numbers.stream()
                        .filter(even)
                        .count();

        System.out.println(count);


        //-------------------------------------------------------
        // Example 18
        //-------------------------------------------------------

        System.out.println("\nExample 18 : First Match");

        Optional<Integer> first =
                numbers.stream()
                        .filter(n -> n>30)
                        .findFirst();

        System.out.println(first.get());


        //-------------------------------------------------------
        // Example 19
        //-------------------------------------------------------

        System.out.println("\nExample 19 : Chaining");

        numbers.stream()
                .filter(n -> n%2==0)
                .filter(n -> n>20)
                .filter(n -> n<45)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 20
        //-------------------------------------------------------

        System.out.println("\nExample 20 : Parallel Stream");

        numbers.parallelStream()
                .filter(n -> n%2==0)
                .forEach(System.out::println);

    }

}
