package in.ineuron.hard;

import java.util.Scanner;

public class LBP278 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0;
		while (n1 > 0) {
			count++;
			n1 = n1 / 10;
		}
		if (count == n2) {
			System.out.println("True " + count);
		} else {
			System.out.println("False " + count);
		}

	}

}
/*
 * Given two positive numbers N and K. The task is to find the nunber N
 * containers exactly K digit or not. If contains then print Truedigit_count
 * otherwise Falsedigit_count.
 * 
 * Input Format
 * 
 * Value of N and K
 * 
 * Constraints
 * 
 * con
 * 
 * Output Format
 * 
 * True|FalseDigit_Count
 * 
 * Sample Input 0
 * 
 * 501 3 Sample Output 0
 * 
 * True 3 Sample Input 1
 * 
 * 50121 4 Sample Output 1
 * 
 * False 5 Sample Input 2
 * 
 * 505 5 Sample Output 2
 * 
 * False 3
 */