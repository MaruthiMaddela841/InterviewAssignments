package in.ineuron.easy;

import java.util.Scanner;

public class LBP021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num != 0) {
			int res = num % 10;
			if (res == 2 || res == 3 || res == 5 || res == 7) {
				sum = sum + res;
			}
			num = num / 10;
		}
		System.out.println(sum);

	}

}

/*
 * An e-commerce company plans to give their customers a special discount for
 * the Christmas, they are planning to offer a flat discount. The discount value
 * is calculated as the sum of all prime digits in the total bill amount. Write
 * an algorithm to find the discount value for the given total bill amount.
 * 
 * Input Format
 * 
 * the input consists of an integer order value representing the total bill
 * amount
 * 
 * Constraints
 * 
 * no conditions
 * 
 * Output Format
 * 
 * print an integer representing discount value for the given total bill amount.
 * 
 * Sample Input 0
 * 
 * 123 Sample Output 0
 * 
 * 5 Sample Input 1
 * 
 * 4589 Sample Output 1
 * 
 * 5 Sample Input 2
 * 
 * 1700 Sample Output 2
 * 
 * 7
 */