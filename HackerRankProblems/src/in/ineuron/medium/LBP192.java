package in.ineuron.medium;

import java.util.Scanner;

public class LBP192 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			int sum = 0;
			int temp = i;
			while (temp >0) {
				int res = temp % 10;
				sum = sum + (res * res * res);
				// sum += Math.pow(digit, 3);
				temp = temp / 10;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}

	}

}
/*
 * Cristina appeared for a corporate Hackathon. She cleated first round of this
 * and would like to take next challenge which is coding round. The problem
 * statement comes to her is "Write a program to find numbers which are in
 * between integer 2 and integer N and such that the sum of its digits raised to
 * the third power is equal to the number with the input given.
 * 
 * Input Format
 * 
 * integer N
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * an integer value
 * 
 * Sample Input 0
 * 
 * 200 Sample Output 0
 * 
 * 153 Sample Input 1
 * 
 * 300 Sample Output 1
 * 
 * 153
 */