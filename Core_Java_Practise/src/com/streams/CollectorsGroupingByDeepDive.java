package com.streams;

import java.util.*;
import java.util.stream.*;

class Employee2 {

    String name;
    String department;
    int age;

    Employee2(
            String name,
            String department,
            int age
    ) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class CollectorsGroupingByDeepDive {

    public static void main(String[] args) {

        List<Employee2> employees =
                Arrays.asList(

                        new Employee2(
                                "John",
                                "IT",
                                30
                        ),

                        new Employee2(
                                "Alice",
                                "HR",
                                25
                        ),

                        new Employee2(
                                "Bob",
                                "IT",
                                35
                        ),

                        new Employee2(
                                "David",
                                "HR",
                                28
                        )
                );


        // =====================================================
        // Group by department
        // =====================================================

        Map<String, List<Employee2>> grouped =
                employees.stream()

                        .collect(
                                Collectors.groupingBy(
                                        emp ->
                                                emp.department
                                )
                        );

        System.out.println(grouped);


        // =====================================================
        // Count each department
        // =====================================================

        Map<String, Long> count =
                employees.stream()

                        .collect(
                                Collectors.groupingBy(

                                        emp ->
                                                emp.department,

                                        Collectors.counting()
                                )
                        );

        System.out.println(count);


        // =====================================================
        // Group names
        // =====================================================

        Map<String, List<String>> names =
                employees.stream()

                        .collect(
                                Collectors.groupingBy(

                                        emp ->
                                                emp.department,

                                        Collectors.mapping(

                                                emp ->
                                                        emp.name,

                                                Collectors.toList()
                                        )
                                )
                        );

        System.out.println(names);
    }
}
