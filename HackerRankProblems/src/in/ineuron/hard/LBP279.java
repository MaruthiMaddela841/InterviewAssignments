package in.ineuron.hard;

import java.util.Scanner;

public class LBP279 {

	public static boolean isPronicNumber(int num) {
		for (int i = 0; i * (i + 1) <= num; i++) {
			if (i * (i + 1) == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean isPronic = isPronicNumber(num);
		System.out.println(isPronic);
		scanner.close();

	}

}
/*
 * A pronic number is a number which is a product of two consecutive integers,
 * that is, a number of the form n(n + 1). Create a function that determines
 * whether a number is pronic or not.
 * 
 * Input Format
 * 
 * a number from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * 0 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * 7 Sample Output 1
 * 
 * false
 */