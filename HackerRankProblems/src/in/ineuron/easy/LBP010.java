package in.ineuron.easy;

import java.util.Scanner;

public class LBP010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int last;
		if (n > 0) {
			while (n > 0) {
				last = n % 10;
				if (last % 2 != 0) {
					sum = sum + last;
				}
				n = n / 10;
			}
			System.out.println(sum);
		}

	}

}

/*
 * Implement a program to calculate sum of odd digits present in the given
 * number.
 * 
 * Input Format
 * 
 * A number from the user
 * 
 * Constraints
 * 
 * Number>0
 * 
 * Output Format
 * 
 * Print sum of odd digits
 * 
 * Sample Input 0
 * 
 * 123 Sample Output 0
 * 
 * 4 Sample Input 1
 * 
 * 1200 Sample Output 1
 * 
 * 1 Sample Input 2
 * 
 * 555 Sample Output 2
 * 
 * 15 Sample Input 3
 * 
 * 614 Sample Output 3
 * 
 * 1
 */