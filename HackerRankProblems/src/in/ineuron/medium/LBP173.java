package in.ineuron.medium;

import java.util.Scanner;

public class LBP173 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input string (base 17 number)
		String input = sc.nextLine().toUpperCase(); // Ensure the input is uppercase

		// Convert from base-17 to decimal
		int decimalValue = 0;
		int length = input.length();

		for (int i = 0; i < length; i++) {
			char c = input.charAt(i);
			int digitValue;

			// Determine the value of the current character
			if (Character.isDigit(c)) {
				digitValue = c - '0'; // Convert digit character to its integer value
			} else {
				digitValue = c - 'A' + 10; // Convert A-G to values 10-16
			}

			// Calculate the decimal value using base-17
			decimalValue += digitValue * Math.pow(17, length - 1 - i);
		}

		// Output the decimal value
		System.out.println(decimalValue);

	}

}
/*
 * Given a maximum of four digit to the base
 * 17(10=>A,11=>B,12=>C,13=>D,14=>E,15=>F,16=>G) as input, output its decimal
 * value.
 * 
 * Input Format
 * 
 * a string value
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * an integer value with base 17
 * 
 * Sample Input 0
 * 
 * D Sample Output 0
 * 
 * 13 Sample Input 1
 * 
 * ABC Sample Output 1
 * 
 * 3089 Sample Input 2
 * 
 * A Sample Output 2
 * 
 * 10
 */