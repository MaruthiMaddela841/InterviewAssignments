package com.streams;

import java.util.*;
import java.util.stream.*;

public class CollectorsFlatMappingDeepDive {

    public static void main(String[] args) {

        class Student {

            String name;
            List<String> subjects;

            Student(
                    String name,
                    List<String> subjects
            ) {
                this.name = name;
                this.subjects = subjects;
            }
        }


        List<Student> students =
                Arrays.asList(

                        new Student(
                                "John",
                                Arrays.asList(
                                        "Java",
                                        "SQL"
                                )
                        ),

                        new Student(
                                "Alice",
                                Arrays.asList(
                                        "Java",
                                        "Python"
                                )
                        ),

                        new Student(
                                "Bob",
                                Arrays.asList(
                                        "SQL",
                                        "Python"
                                )
                        )
                );


        // =====================================================
        // flatMap normally
        // =====================================================

        List<String> subjects =
                students.stream()

                        .flatMap(
                                s ->
                                        s.subjects.stream()
                        )

                        .distinct()

                        .collect(
                                Collectors.toList()
                        );

        System.out.println(subjects);


        // =====================================================
        // flatMapping Collector
        // =====================================================

        Map<String, Set<String>> example =
                students.stream()

                        .collect(
                                Collectors.groupingBy(

                                        s -> s.name,

                                        Collectors.flatMapping(

                                                s ->
                                                        s.subjects.stream(),

                                                Collectors.toSet()
                                        )
                                )
                        );

        System.out.println(example);
    }
}
