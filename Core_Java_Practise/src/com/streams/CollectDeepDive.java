package com.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class CollectDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        10, 20, 20, 30, 40, 50
                );

        List<String> names =
                Arrays.asList(
                        "John",
                        "Alice",
                        "Bob",
                        "David",
                        "Alice"
                );

        List<Employee> employees =
                Arrays.asList(

                        new Employee(
                                101, "John",
                                25, 50000, "IT"
                        ),

                        new Employee(
                                102, "Alice",
                                30, 70000, "HR"
                        ),

                        new Employee(
                                103, "Bob",
                                22, 40000, "IT"
                        ),

                        new Employee(
                                104, "David",
                                35, 90000, "Finance"
                        ),

                        new Employee(
                                105, "Chris",
                                28, 60000, "IT"
                        )
                );


        // =====================================================
        // Example 1: collect to List
        // =====================================================

        System.out.println("Example 1: toList()");

        List<Integer> list =
                numbers.stream()
                        .collect(Collectors.toList());

        System.out.println(list);


        // =====================================================
        // Example 2: collect to Set
        // =====================================================

        System.out.println("\nExample 2: toSet()");

        Set<Integer> set =
                numbers.stream()
                        .collect(Collectors.toSet());

        System.out.println(set);


        // =====================================================
        // Example 3: filter + collect
        // =====================================================

        System.out.println("\nExample 3: filter + toList()");

        List<Integer> evenNumbers =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println(evenNumbers);


        // =====================================================
        // Example 4: map + collect
        // =====================================================

        System.out.println("\nExample 4: map + toList()");

        List<String> upperNames =
                names.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        System.out.println(upperNames);


        // =====================================================
        // Example 5: toMap()
        // =====================================================

        System.out.println("\nExample 5: toMap()");

        Map<Integer, String> employeeMap =
                employees.stream()
                        .collect(
                                Collectors.toMap(
                                        emp -> emp.id,
                                        emp -> emp.name
                                )
                        );

        System.out.println(employeeMap);


        // =====================================================
        // Example 6: toMap() using method references
        // =====================================================

        System.out.println("\nExample 6: toMap() method reference");

        Map<Integer, String> employeeMap2 =
                employees.stream()
                        .collect(
                                Collectors.toMap(
                                        emp -> emp.id,
                                        emp -> emp.name
                                )
                        );

        System.out.println(employeeMap2);


        // =====================================================
        // Example 7: Duplicate key problem
        // =====================================================

        System.out.println("\nExample 7: Duplicate keys");

        List<String> duplicateNames =
                Arrays.asList(
                        "John",
                        "Alice",
                        "John"
                );

        Map<String, Integer> nameLength =
                duplicateNames.stream()
                        .collect(
                                Collectors.toMap(
                                        name -> name,
                                        String::length,
                                        (oldValue, newValue)
                                                -> oldValue
                                )
                        );

        System.out.println(nameLength);


        // =====================================================
        // Example 8: Joining
        // =====================================================

        System.out.println("\nExample 8: joining()");

        String joined =
                names.stream()
                        .collect(
                                Collectors.joining()
                        );

        System.out.println(joined);


        // =====================================================
        // Example 9: joining with delimiter
        // =====================================================

        System.out.println("\nExample 9: joining() delimiter");

        String joinedWithComma =
                names.stream()
                        .collect(
                                Collectors.joining(", ")
                        );

        System.out.println(joinedWithComma);


        // =====================================================
        // Example 10: joining prefix and suffix
        // =====================================================

        System.out.println("\nExample 10: joining() prefix/suffix");

        String formattedNames =
                names.stream()
                        .collect(
                                Collectors.joining(
                                        ", ",
                                        "[",
                                        "]"
                                )
                        );

        System.out.println(formattedNames);


        // =====================================================
        // Example 11: counting()
        // =====================================================

        System.out.println("\nExample 11: counting()");

        long count =
                employees.stream()
                        .collect(
                                Collectors.counting()
                        );

        System.out.println(count);


        // =====================================================
        // Example 12: summingInt()
        // =====================================================

        System.out.println("\nExample 12: summingInt()");

        int totalAge =
                employees.stream()
                        .collect(
                                Collectors.summingInt(
                                        emp -> emp.age
                                )
                        );

        System.out.println(totalAge);


        // =====================================================
        // Example 13: summingDouble()
        // =====================================================

        System.out.println("\nExample 13: summingDouble()");

        double totalSalary =
                employees.stream()
                        .collect(
                                Collectors.summingDouble(
                                        emp -> emp.salary
                                )
                        );

        System.out.println(totalSalary);


        // =====================================================
        // Example 14: averagingInt()
        // =====================================================

        System.out.println("\nExample 14: averagingInt()");

        double averageAge =
                employees.stream()
                        .collect(
                                Collectors.averagingInt(
                                        emp -> emp.age
                                )
                        );

        System.out.println(averageAge);


        // =====================================================
        // Example 15: averagingDouble()
        // =====================================================

        System.out.println("\nExample 15: averagingDouble()");

        double averageSalary =
                employees.stream()
                        .collect(
                                Collectors.averagingDouble(
                                        emp -> emp.salary
                                )
                        );

        System.out.println(averageSalary);


        // =====================================================
        // Example 16: minBy()
        // =====================================================

        System.out.println("\nExample 16: minBy()");

        Optional<Employee> youngest =
                employees.stream()
                        .collect(
                                Collectors.minBy(
                                        Comparator.comparingInt(
                                                emp -> emp.age
                                        )
                                )
                        );

        youngest.ifPresent(System.out::println);


        // =====================================================
        // Example 17: maxBy()
        // =====================================================

        System.out.println("\nExample 17: maxBy()");

        Optional<Employee> highestPaid =
                employees.stream()
                        .collect(
                                Collectors.maxBy(
                                        Comparator.comparingDouble(
                                                emp -> emp.salary
                                        )
                                )
                        );

        highestPaid.ifPresent(System.out::println);


        // =====================================================
        // Example 18: summarizingInt()
        // =====================================================

        System.out.println("\nExample 18: summarizingInt()");

        IntSummaryStatistics ageStats =
                employees.stream()
                        .collect(
                                Collectors.summarizingInt(
                                        emp -> emp.age
                                )
                        );

        System.out.println("Count = "
                + ageStats.getCount());

        System.out.println("Sum = "
                + ageStats.getSum());

        System.out.println("Min = "
                + ageStats.getMin());

        System.out.println("Max = "
                + ageStats.getMax());

        System.out.println("Average = "
                + ageStats.getAverage());


        // =====================================================
        // Example 19: groupingBy()
        // =====================================================

        System.out.println("\nExample 19: groupingBy()");

        Map<String, List<Employee>> byDepartment =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        emp -> emp.department
                                )
                        );

        byDepartment.forEach(
                (department, employeeList) ->
                        System.out.println(
                                department
                                        + " -> "
                                        + employeeList
                        )
        );


        // =====================================================
        // Example 20: groupingBy() + counting()
        // =====================================================

        System.out.println("\nExample 20: Department Count");

        Map<String, Long> departmentCount =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        emp -> emp.department,
                                        Collectors.counting()
                                )
                        );

        System.out.println(departmentCount);


        // =====================================================
        // Example 21: groupingBy() + averaging
        // =====================================================

        System.out.println("\nExample 21: Average Salary");

        Map<String, Double> averageSalaryByDepartment =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        emp -> emp.department,
                                        Collectors.averagingDouble(
                                                emp -> emp.salary
                                        )
                                )
                        );

        System.out.println(
                averageSalaryByDepartment
        );


        // =====================================================
        // Example 22: groupingBy() + mapping()
        // =====================================================

        System.out.println("\nExample 22: Names by Department");

        Map<String, List<String>> namesByDepartment =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        emp -> emp.department,

                                        Collectors.mapping(
                                                emp -> emp.name,
                                                Collectors.toList()
                                        )
                                )
                        );

        System.out.println(namesByDepartment);


        // =====================================================
        // Example 23: partitioningBy()
        // =====================================================

        System.out.println("\nExample 23: partitioningBy()");

        Map<Boolean, List<Integer>> partitioned =
                numbers.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        n -> n % 2 == 0
                                )
                        );

        System.out.println(partitioned);


        // =====================================================
        // Example 24: partitioningBy() + counting()
        // =====================================================

        System.out.println(
                "\nExample 24: Partition Count"
        );

        Map<Boolean, Long> partitionCount =
                numbers.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        n -> n % 2 == 0,
                                        Collectors.counting()
                                )
                        );

        System.out.println(partitionCount);


        // =====================================================
        // Example 25: collectingAndThen()
        // =====================================================

        System.out.println(
                "\nExample 25: collectingAndThen()"
        );

        List<Integer> unmodifiableList =
                numbers.stream()
                        .collect(
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        Collections::unmodifiableList
                                )
                        );

        System.out.println(unmodifiableList);


        // =====================================================
        // Example 26: reducing() collector
        // =====================================================

        System.out.println("\nExample 26: reducing()");

        Optional<Integer> reducedSum =
                numbers.stream()
                        .collect(
                                Collectors.reducing(
                                        Integer::sum
                                )
                        );

        System.out.println(reducedSum);


        // =====================================================
        // Example 27: reducing with identity
        // =====================================================

        System.out.println(
                "\nExample 27: reducing() with identity"
        );

        int reducedSum2 =
                numbers.stream()
                        .collect(
                                Collectors.reducing(
                                        0,
                                        Integer::sum
                                )
                        );

        System.out.println(reducedSum2);


        // =====================================================
        // Example 28: grouping + reducing
        // =====================================================

        System.out.println(
                "\nExample 28: Highest salary by department"
        );

        Map<String, Optional<Employee>>
                highestSalaryByDepartment =

                employees.stream()

                        .collect(
                                Collectors.groupingBy(
                                        emp -> emp.department,

                                        Collectors.maxBy(
                                                Comparator.comparingDouble(
                                                        emp -> emp.salary
                                                )
                                        )
                                )
                        );

        System.out.println(
                highestSalaryByDepartment
        );


        // =====================================================
        // Example 29: toCollection()
        // =====================================================

        System.out.println("\nExample 29: toCollection()");

        LinkedList<Integer> linkedList =
                numbers.stream()
                        .collect(
                                Collectors.toCollection(
                                        LinkedList::new
                                )
                        );

        System.out.println(linkedList);


        // =====================================================
        // Example 30: teeing()
        // =====================================================

        System.out.println("\nExample 30: teeing()");

        String result =
                numbers.stream()
                        .collect(
                                Collectors.teeing(

                                        Collectors.minBy(
                                                Integer::compareTo
                                        ),

                                        Collectors.maxBy(
                                                Integer::compareTo
                                        ),

                                        (min, max) ->
                                                "Min = "
                                                        + min.get()
                                                        + ", Max = "
                                                        + max.get()
                                )
                        );

        System.out.println(result);

    }
}
