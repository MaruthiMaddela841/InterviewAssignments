package in.ineuron.hard;

import java.util.Scanner;

public class LBP239 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 3;
		int m = 3;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean b = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
/*
 * Implement a program to read a matrix and display only diagonal elements.
 * 
 * Input Format
 * 
 * a 3x3 matrix
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * print only diagonal elements
 * 
 * Sample Input 0
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Output 0
 * 
 * 1 5 9 Sample Input 1
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Output 1
 * 
 * 1 1 1
 */