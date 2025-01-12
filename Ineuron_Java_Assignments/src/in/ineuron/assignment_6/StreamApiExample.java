package in.ineuron.assignment_6;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        // Generate a large dataset of integers
        List<Integer> largeDataset = new Random().ints(1, 1000)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Original Dataset: ");
        System.out.println(largeDataset);

        // Filter: Get only even numbers from the dataset
        List<Integer> evenNumbers = largeDataset.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Even Numbers: ");
        System.out.println(evenNumbers);

        // Sort: Sort the dataset in ascending order
        List<Integer> sortedDataset = largeDataset.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nSorted Dataset (Ascending): ");
        System.out.println(sortedDataset);

        // Sort: Sort the dataset in descending order
        List<Integer> sortedDescending = largeDataset.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("\nSorted Dataset (Descending): ");
        System.out.println(sortedDescending);

        // Map: Transform data by squaring each number
        List<Integer> squaredNumbers = largeDataset.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("\nSquared Numbers: ");
        System.out.println(squaredNumbers);

        // Aggregate: Find the sum of all numbers
        int sum = largeDataset.stream()
                .reduce(0, Integer::sum);

        System.out.println("\nSum of All Numbers: " + sum);
    }
}
