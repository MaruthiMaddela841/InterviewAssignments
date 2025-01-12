package in.ineuron.assignment_3;

import java.util.Scanner;

public class NegativeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Taking user input
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Checking for negative number
            if (number < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed!");
            }

            System.out.println("You entered a valid number: " + number);
        } catch (NegativeNumberException e) {
            // Handling custom exception
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            // Handling other exceptions (e.g., invalid input)
            System.out.println("Exception caught: Please enter a valid integer!");
        } finally {
            // Closing the scanner
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}
