package in.ineuron.medium;

import java.util.Scanner;

public class LBP198 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split("");
		for (int i = 0; i < s.length; i++) {
			int num = Integer.parseInt(s[i]);
			if (num % 2 == 0) {
				num = num + 1;
				System.out.print(num);
			} else {
				num = num - 1;
				System.out.print(num);
			}
		}

	}

}
/*
 * Write an algorithm to generate the token number from the application ID by
 * doing this modifications. R1. If the digit is even add 1 to it. R2. If the
 * digit is odd sub 1 from it.
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
 * token number
 * 
 * Sample Input 0
 * 
 * 2347 Sample Output 0
 * 
 * 3256 Sample Input 1
 * 
 * 245567 Sample Output 1
 * 
 * 354476
 */