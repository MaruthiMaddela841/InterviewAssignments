package com.streams;

import java.util.*;
import java.util.stream.*;

public class CollectorsPartitioningByDeepDive {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(
                        10, 15, 20, 25, 30
                );


        // =====================================================
        // Partition even / odd
        // =====================================================

        Map<Boolean, List<Integer>> result =
                numbers.stream()

                        .collect(
                                Collectors.partitioningBy(
                                        n -> n % 2 == 0
                                )
                        );

        System.out.println(result);


        // =====================================================
        // Partition adults / minors
        // =====================================================

        List<Integer> ages =
                Arrays.asList(
                        15, 18, 20, 12, 30
                );

        Map<Boolean, List<Integer>> adults =
                ages.stream()

                        .collect(
                                Collectors.partitioningBy(
                                        age -> age >= 18
                                )
                        );

        System.out.println(adults);


        // =====================================================
        // Partition + counting
        // =====================================================

        Map<Boolean, Long> count =
                ages.stream()

                        .collect(
                                Collectors.partitioningBy(

                                        age -> age >= 18,

                                        Collectors.counting()
                                )
                        );

        System.out.println(count);
    }
}