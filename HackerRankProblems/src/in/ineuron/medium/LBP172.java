package in.ineuron.medium;

import java.util.Scanner;

public class LBP172 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int osum = 0;
		int esum = 0;
		while (num > 0) {
			int res = num % 10;
			if (res % 2 == 0) {
				esum = esum + res;
			} else {
				osum = osum + res;
			}
			num = num / 10;
		}

		System.out.println(esum - osum);

	}

}
/*
 * Given a maximum of 100 digit numbers as input, find the difference between
 * the sum of odd and even position digits.
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
 * an integer
 * 
 * Sample Input 0
 * 
 * 12 Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * 123 Sample Output 1
 * 
 * -2
 */