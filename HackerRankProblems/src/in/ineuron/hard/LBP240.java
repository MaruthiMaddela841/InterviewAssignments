package in.ineuron.hard;

import java.util.Scanner;

public class LBP240 {

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
				System.out.print((arr[i][j] * arr[i][j]) + " ");
			}
			System.out.println();
		}

	}

}
/*
 * Implement a program to find square of each element present in a matrix.
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
 * resultent matrix
 * 
 * Sample Input 0
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Output 0
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Input 1
 * 
 * 1 1 1 2 2 2 3 3 3 Sample Output 1
 * 
 * 1 1 1 4 4 4 9 9 9
 */