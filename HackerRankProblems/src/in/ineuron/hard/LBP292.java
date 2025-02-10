package in.ineuron.hard;

import java.util.Scanner;

public class LBP292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder("");
		while (num > 0) {
			sb.append(num % 8);
			num = num / 8;
		}
		System.out.println(sb.reverse());

	}

}
/*
 * Implement a program to convert the given decimal value into octal
 * 
 * Input Format
 * 
 * decimal value
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * octal number
 * 
 * Sample Input 0
 * 
 * 16 Sample Output 0
 * 
 * 20 Sample Input 1
 * 
 * 10 Sample Output 1
 * 
 * 12
 */