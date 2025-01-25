package in.ineuron.hard;

import java.util.Scanner;

public class LBP234 {

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
		for (int i = 0; i < n; i++) {
			// Swap primary diagonal with secondary diagonal
			int temp = arr[i][i];
			arr[i][i] = arr[i][n - 1 - i];
			arr[i][n - 1 - i] = temp;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
/*
 * Program to accept a matrix of order 3x3 & interchange the diagonals.
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
 * modified matrix
 * 
 * Sample Input 0
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Output 0
 * 
 * 3 2 1 4 5 6 9 8 7 Sample Input 1
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Output 1
 * 
 * 0 0 1 0 1 0 1 0 0
 */