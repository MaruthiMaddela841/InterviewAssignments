package com.streams;

import java.util.*;
import java.util.stream.*;

public class MapDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5);

        List<String> names =
                Arrays.asList(
                        "john",
                        "alice",
                        "bob",
                        "david"
                );

        List<Employee> employees = Arrays.asList(

                new Employee(101,"John",25,50000,"IT"),

                new Employee(102,"Alice",30,70000,"HR"),

                new Employee(103,"Bob",23,45000,"Finance"),

                new Employee(104,"David",35,90000,"IT")

        );

        //-------------------------------------------------------
        // Example 1
        //-------------------------------------------------------

        System.out.println("Example 1 : Square");

        numbers.stream()
                .map(n -> n*n)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 2
        //-------------------------------------------------------

        System.out.println("\nExample 2 : Cube");

        numbers.stream()
                .map(n -> n*n*n)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 3
        //-------------------------------------------------------

        System.out.println("\nExample 3 : Integer -> String");

        numbers.stream()
                .map(String::valueOf)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 4
        //-------------------------------------------------------

        System.out.println("\nExample 4 : Uppercase");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 5
        //-------------------------------------------------------

        System.out.println("\nExample 5 : Lowercase");

        names.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 6
        //-------------------------------------------------------

        System.out.println("\nExample 6 : String Length");

        names.stream()
                .map(String::length)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 7
        //-------------------------------------------------------

        System.out.println("\nExample 7 : Prefix");

        names.stream()
                .map(name -> "Mr. " + name)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 8
        //-------------------------------------------------------

        System.out.println("\nExample 8 : Employee -> Name");

        employees.stream()
                .map(emp -> emp.name)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 9
        //-------------------------------------------------------

        System.out.println("\nExample 9 : Employee -> Salary");

        employees.stream()
                .map(emp -> emp.salary)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 10
        //-------------------------------------------------------

        System.out.println("\nExample 10 : Salary Increment");

        employees.stream()
                .map(emp -> emp.salary * 1.10)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 11
        //-------------------------------------------------------

        System.out.println("\nExample 11 : Employee -> DTO");

        employees.stream()
                .map(emp -> new EmployeeDTO(emp.name))
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 12
        //-------------------------------------------------------

        System.out.println("\nExample 12 : Chaining");

        numbers.stream()
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 13
        //-------------------------------------------------------

        System.out.println("\nExample 13 : Collect");

        List<Integer> squares =
                numbers.stream()
                        .map(n -> n*n)
                        .collect(Collectors.toList());

        System.out.println(squares);


        //-------------------------------------------------------
        // Example 14
        //-------------------------------------------------------

        System.out.println("\nExample 14 : mapToInt()");

        int sum =
                employees.stream()
                        .mapToInt(emp -> emp.age)
                        .sum();

        System.out.println(sum);


        //-------------------------------------------------------
        // Example 15
        //-------------------------------------------------------

        System.out.println("\nExample 15 : mapToDouble()");

        double totalSalary =
                employees.stream()
                        .mapToDouble(emp -> emp.salary)
                        .sum();

        System.out.println(totalSalary);


        //-------------------------------------------------------
        // Example 16
        //-------------------------------------------------------

        System.out.println("\nExample 16 : mapToLong()");

        long count =
                employees.stream()
                        .mapToLong(emp -> emp.id)
                        .count();

        System.out.println(count);


        //-------------------------------------------------------
        // Example 17
        //-------------------------------------------------------

        System.out.println("\nExample 17 : Distinct");

        Arrays.asList(1,2,2,3,3,4,5)
                .stream()
                .map(n -> n*n)
                .distinct()
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 18
        //-------------------------------------------------------

        System.out.println("\nExample 18 : Reduce");

        int total =
                numbers.stream()
                        .map(n -> n*n)
                        .reduce(0,Integer::sum);

        System.out.println(total);


        //-------------------------------------------------------
        // Example 19
        //-------------------------------------------------------

        System.out.println("\nExample 19 : Parallel");

        numbers.parallelStream()
                .map(n -> n*n)
                .forEach(System.out::println);


        //-------------------------------------------------------
        // Example 20
        //-------------------------------------------------------

        System.out.println("\nExample 20 : Random Numbers");

        Stream.generate(() -> new Random().nextInt(100))
                .limit(5)
                .map(n -> n*10)
                .forEach(System.out::println);

    }

}
