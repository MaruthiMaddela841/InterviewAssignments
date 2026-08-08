package com.streams;

import java.util.*;
import java.util.stream.*;

public class CollectorsFilteringDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        10, 15, 20, 25, 30
                );


        // =====================================================
        // Normal filter
        // =====================================================

        List<Integer> result =
                numbers.stream()

                        .filter(n -> n > 20)

                        .collect(
                                Collectors.toList()
                        );

        System.out.println(result);


        // =====================================================
        // filtering Collector
        // =====================================================

        Map<Boolean, List<Integer>> grouped =
                numbers.stream()

                        .collect(
                                Collectors.partitioningBy(

                                        n -> n > 20,

                                        Collectors.filtering(

                                                n -> n % 2 == 0,

                                                Collectors.toList()
                                        )
                                )
                        );

        System.out.println(grouped);


        // =====================================================
        // groupingBy + filtering
        // =====================================================

        class Employee {

            String name;
            String department;
            int salary;

            Employee(
                    String name,
                    String department,
                    int salary
            ) {
                this.name = name;
                this.department = department;
                this.salary = salary;
            }
        }

        List<Employee> employees =
                Arrays.asList(

                        new Employee(
                                "John",
                                "IT",
                                80000
                        ),

                        new Employee(
                                "Alice",
                                "IT",
                                50000
                        ),

                        new Employee(
                                "Bob",
                                "HR",
                                70000
                        )
                );


        Map<String, List<Employee>> result2 =
                employees.stream()

                        .collect(
                                Collectors.groupingBy(

                                        e -> e.department,

                                        Collectors.filtering(

                                                e -> e.salary > 60000,

                                                Collectors.toList()
                                        )
                                )
                        );

        System.out.println(result2);
    }
}
