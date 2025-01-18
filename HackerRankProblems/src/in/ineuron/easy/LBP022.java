package in.ineuron.easy;

import java.util.Scanner;

public class LBP022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num != 0) {
			int r;
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		if (temp % sum == 0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}

/*
 * Write a program to accept a number and check and display whether it is a
 * Niven Number or not. Niven Number is that a number which is divisible by its
 * sum of digits.
 * 
 * Input Format
 * 
 * a number
 * 
 * Constraints
 * 
 * n>0
 * 
 * Output Format
 * 
 * Yes or No
 * 
 * Sample Input 0
 * 
 * 126 Sample Output 0
 * 
 * Yes Sample Input 1
 * 
 * 10 Sample Output 1
 * 
 * Yes
 */