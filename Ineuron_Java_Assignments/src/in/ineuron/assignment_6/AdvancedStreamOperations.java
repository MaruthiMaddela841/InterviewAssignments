package in.ineuron.assignment_6;

import java.util.*;
import java.util.stream.Collectors;

public class AdvancedStreamOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Eve", "Charlie", "Alice");

        System.out.println("Original Names List:");
        System.out.println(names);

        // 1. Simple Operation: Filter names starting with 'A'
        List<String> namesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("\nNames Starting with 'A': " + namesStartingWithA);

        // 2. Distinct: Remove duplicates
        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nUnique Names: " + uniqueNames);

        // 3. Count: Count names longer than 3 characters
        long countLongNames = names.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println("\nCount of Names Longer Than 3 Characters: " + countLongNames);

        // 4. Map: Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("\nNames in Uppercase: " + upperCaseNames);

        // 5. Sorted: Sort names alphabetically
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nSorted Names: " + sortedNames);

        // 6. Complex Filter: Names longer than 3 characters and ending with 'e'
        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3 && name.endsWith("e"))
                .collect(Collectors.toList());
        System.out.println("\nFiltered Names (Longer than 3 and ending with 'e'): " + filteredNames);

        // 7. Reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream()
                .reduce("", (result, name) -> result + name + " ");
        System.out.println("\nConcatenated Names: " + concatenatedNames.trim());

        // 8. Grouping By: Group names by their first character
        Map<Character, List<String>> groupedByFirstChar = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("\nNames Grouped by First Character:");
        System.out.println(groupedByFirstChar);

        // 9. Joining: Join names with commas
        String joinedNames = names.stream()
                .distinct() // Remove duplicates
                .collect(Collectors.joining(", "));
        System.out.println("\nJoined Names: " + joinedNames);

        // 10. Collectors.maxBy: Find the longest name
        Optional<String> longestName = names.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("\nLongest Name: " + longestName.orElse("No names available"));

        // 11. Partitioning By: Partition names based on length > 3
        Map<Boolean, List<String>> partitionedByLength = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 3));
        System.out.println("\nPartitioned Names (Length > 3):");
        System.out.println(partitionedByLength);

        // 12. FlatMap: Flatten a list of lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("\nFlattened List: " + flatList);

        // 13. Skip and Limit: Paginate a list
        List<String> paginatedNames = names.stream()
                .sorted()
                .skip(1) // Skip the first element
                .limit(3) // Take the next 3 elements
                .collect(Collectors.toList());
        System.out.println("\nPaginated Names (Skip 1, Limit 3): " + paginatedNames);

        // 14. Peek: Debug each step in the pipeline
        List<String> debugNames = names.stream()
                .peek(name -> System.out.println("Before Filter: " + name))
                .filter(name -> name.length() > 3)
                .peek(name -> System.out.println("After Filter: " + name))
                .collect(Collectors.toList());
        System.out.println("\nNames After Debugging: " + debugNames);
    }
}

