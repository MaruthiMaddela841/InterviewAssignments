package in.ineuron.easy;

import java.util.Scanner;

public class LBP014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int last;
		if (n >= 0) {
			while (n > 0) {
				last = n % 10;
				sum = sum * 10 + last;
				n = n / 10;
			}
			System.out.println(sum);
		}

	}

}

/*
 * Given an integer x, return x with its digits reversed.
 * 
 * Input Format
 * 
 * a number from user
 * 
 * Constraints
 * 
 * n>=0
 * 
 * Output Format
 * 
 * reverse of the given number
 * 
 * Sample Input 0
 * 
 * 123 Sample Output 0
 * 
 * 321 Sample Input 1
 * 
 * 124 Sample Output 1
 * 
 * 421 Sample Input 2
 * 
 * 0 Sample Output 2
 * 
 * 0
 */