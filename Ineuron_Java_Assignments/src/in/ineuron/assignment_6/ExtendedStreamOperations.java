package in.ineuron.assignment_6;

import java.util.*;
import java.util.stream.*;

public class ExtendedStreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "David", "Alice");
        
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Original Names: " + names);

        // 1. Find Even Numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("\nEven Numbers: " + evenNumbers);

        // 2. Double Each Number
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("\nDoubled Numbers: " + doubledNumbers);

        // 3. Sum of All Numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("\nSum of All Numbers: " + sum);

        // 4. Find Maximum Value
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("\nMaximum Number: " + maxNumber.orElse(-1));

        // 5. Convert to Set (Remove Duplicates)
        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());
        System.out.println("\nUnique Names (Set): " + uniqueNames);

        // 6. Count Names Starting with 'A'
        long countNamesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("\nCount of Names Starting with 'A': " + countNamesStartingWithA);

        // 7. Find First Name Starting with 'C'
        Optional<String> firstNameStartingWithC = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst();
        System.out.println("\nFirst Name Starting with 'C': " + firstNameStartingWithC.orElse("None"));

        // 8. Skip and Limit (Pagination Example)
        List<Integer> paginatedNumbers = numbers.stream()
                .skip(2) // Skip first 2 elements
                .limit(3) // Take the next 3 elements
                .collect(Collectors.toList());
        System.out.println("\nPaginated Numbers (Skip 2, Limit 3): " + paginatedNumbers);

        // 9. All Match, Any Match, None Match
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("\nAll Numbers Even: " + allEven);
        System.out.println("Any Number Even: " + anyEven);
        System.out.println("No Negative Numbers: " + noneNegative);

        // 10. Find Duplicate Names
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = names.stream()
                .filter(name -> !seen.add(name)) // If `add` fails, it's a duplicate
                .collect(Collectors.toSet());
        System.out.println("\nDuplicate Names: " + duplicates);

        // 11. Reverse Sort a List
        List<Integer> reverseSortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("\nReverse Sorted Numbers: " + reverseSortedNumbers);

        // 12. Partition Numbers into Even and Odd
        Map<Boolean, List<Integer>> evenOddPartition = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("\nPartitioned Numbers (Even/Odd): " + evenOddPartition);

        // 13. Group Names by Length
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("\nNames Grouped by Length:");
        System.out.println(groupedByLength);

        // 14. Parallel Stream for Performance
        int parallelSum = numbers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("\nParallel Stream Sum: " + parallelSum);

        // 15. Find Second Highest Number
        Optional<Integer> secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("\nSecond Highest Number: " + secondHighest.orElse(-1));

        // 16. Find Longest Name
        Optional<String> longestName = names.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("\nLongest Name: " + longestName.orElse("None"));

        // 17. Generate Stream of Integers and Limit
        List<Integer> firstTenSquares = Stream.iterate(1, n -> n + 1)
                .map(n -> n * n)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println("\nFirst 10 Squares: " + firstTenSquares);
    }
}

