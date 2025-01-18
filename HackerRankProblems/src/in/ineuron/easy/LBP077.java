package in.ineuron.easy;

import java.util.Scanner;

public class LBP077 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		if (str.contains(".")) {
			for (int i = str.length() - 1; i >= 0; i--) {
				if (str.charAt(i) != '.')
					count++;
				else
					break;
			}
			System.out.println(count);
		} else {
			System.out.println(count);
		}

	}

}
/*
 * Implement a program that returns the number of decimal places a number (given
 * as a string) has. Any zeros after the decimal point count towards the number
 * of decimal places.
 * 
 * Input Format
 * 
 * string from the user
 * 
 * Constraints
 * 
 * non empty string
 * 
 * Output Format
 * 
 * count of decimal places
 * 
 * Sample Input 0
 * 
 * 43.20 Sample Output 0
 * 
 * 2 Sample Input 1
 * 
 * 400 Sample Output 1
 * 
 * 0 Sample Input 2
 * 
 * 3.1 Sample Output 2
 * 
 * 1 Sample Input 3
 * 
 * 7.333 Sample Output 3
 * 
 * 3
 */