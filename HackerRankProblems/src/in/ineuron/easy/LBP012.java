package in.ineuron.easy;

import java.util.Scanner;

public class LBP012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int last;
		if (n > 0) {
			while (n > 0) {
				last = n % 10;
				if (last % 3 == 0) {
					sum = sum + last;
				}
				n = n / 10;
			}
			System.out.println(sum);
		}

	}

}

/*
 * Implement a program to calculate sum of digits that are divisible by 3 in the
 * given number
 * 
 * Input Format
 * 
 * a number from the user
 * 
 * Constraints
 * 
 * n>0
 * 
 * Output Format
 * 
 * print sum of digits that are divisible by 3
 * 
 * Sample Input 0
 * 
 * 123 Sample Output 0
 * 
 * 3 Sample Input 1
 * 
 * 163 Sample Output 1
 * 
 * 9
 */