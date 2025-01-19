package in.ineuron.medium;

import java.util.Scanner;

public class LBP176 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int mul = 1;
		if (a > b)
			c = a;
		else
			c = b;
		for (int i = 1; i < c; i++) {
			if (a % i == 0 && b % i == 0) {
				mul = i;
			}
		}
		System.out.println(mul);

	}

}
/*
 * Implement a program to read two integers values and return GCD of two
 * numbers.
 * 
 * Input Format
 * 
 * two space seperated integers.
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * GCD of two numbers
 * 
 * Sample Input 0
 * 
 * 98 56 Sample Output 0
 * 
 * 14 Sample Input 1
 * 
 * 2 3 Sample Output 1
 * 
 * 1
 */