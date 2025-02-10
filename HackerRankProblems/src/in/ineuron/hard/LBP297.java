package in.ineuron.hard;

import java.util.Scanner;

public class LBP297 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for (int i = n1; i <= n2; i++) {
			int temp = i % 10;
			if (temp == 3)
				System.out.print(i + " ");
		}

	}

}
/*
 * Implement a program to print the list of integers which are ending with 3 in
 * the given range.
 * 
 * Input Format
 * 
 * n1 and n2 values
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * list of int values
 * 
 * Sample Input 0
 * 
 * 10 15 Sample Output 0
 * 
 * 13 Sample Input 1
 * 
 * 1 30 Sample Output 1
 * 
 * 3 13 23
 */