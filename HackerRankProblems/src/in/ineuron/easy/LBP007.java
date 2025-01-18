package in.ineuron.easy;

import java.util.Scanner;

public class LBP007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int last;
		if (n > 0) {
			while (n > 0) {
				last = n % 10;
				System.out.print(last + " ");
				n = n / 10;
			}
		}

	}

}

/*
 * Implement a program to extract digits from the given number
 * 
 * Input Format
 * 
 * a number from the user
 * 
 * Constraints
 * 
 * Number>0
 * 
 * Output Format
 * 
 * print digits in line separated by space
 * 
 * Sample Input 0
 * 
 * 123 Sample Output 0
 * 
 * 3 2 1 Sample Input 1
 * 
 * 758 Sample Output 1
 * 
 * 8 5 7 Sample Input 2
 * 
 * 1207 Sample Output 2
 * 
 * 7 0 2 1
 */