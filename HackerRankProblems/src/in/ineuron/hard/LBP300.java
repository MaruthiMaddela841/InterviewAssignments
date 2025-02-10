package in.ineuron.hard;

import java.util.Scanner;

public class LBP300 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		while (num > 0 && count < 3) {
			int temp = num % 10;
			sum = sum + temp;
			count++;
			num = num / 10;
		}
		System.out.println(sum);

	}

}
/*
 * Implement a program to find sum of last three digits in the given number.
 * 
 * Input Format
 * 
 * an int value
 * 
 * Constraints
 * 
 * must be three digit number
 * 
 * Output Format
 * 
 * int value
 * 
 * Sample Input 0
 * 
 * 2345 Sample Output 0
 * 
 * 12 Sample Input 1
 * 
 * 1234 Sample Output 1
 * 
 * 9 Sample Input 2
 * 
 * 1234 Sample Output 2
 * 
 * 9
 */