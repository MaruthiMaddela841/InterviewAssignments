package in.ineuron.hard;

import java.util.Scanner;

public class LBP286 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 2)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
/*
 * Implement a program to check whether the given number is composite number or
 * not.
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
 * true or false
 * 
 * Sample Input 0
 * 
 * 4 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * 5 Sample Output 1
 * 
 * false Sample Input 2
 * 
 * 6 Sample Output 2
 * 
 * true
 */