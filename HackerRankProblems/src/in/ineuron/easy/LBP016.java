package in.ineuron.easy;

import java.util.Scanner;

public class LBP016 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			if (n == r) {
				sum += 1;
			}
			num = num / 10;
		}
		System.out.println(sum);

	}

}

/*
 * Program to find number of occurences of the given digit in the number n
 * 
 * Input Format
 * 
 * two numbers n and d
 * 
 * Constraints
 * 
 * no constraints
 * 
 * Output Format
 * 
 * number of occurrences
 * 
 * Sample Input 0
 * 
 * 199 9 Sample Output 0
 * 
 * 2 Sample Input 1
 * 
 * 111 1 Sample Output 1
 * 
 * 3
 */