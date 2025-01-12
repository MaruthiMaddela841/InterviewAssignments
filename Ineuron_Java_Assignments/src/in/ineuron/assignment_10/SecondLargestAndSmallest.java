package in.ineuron.assignment_10;

import java.util.*;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Read integers from the user
        System.out.println("Enter integers (type 'done' to stop):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Please enter a valid integer or type 'done' to stop.");
            }
        }

        // Check if there are enough numbers
        if (numbers.size() < 2) {
            System.out.println("Not enough numbers to find second largest and second smallest.");
            return;
        }

        // Find second largest and second smallest elements
        Collections.sort(numbers);
        int secondSmallest = numbers.get(1);
        int secondLargest = numbers.get(numbers.size() - 2);

        System.out.println("List: " + numbers);
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}

