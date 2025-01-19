package in.ineuron.hard;

import java.util.Scanner;

public class LBP201 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
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
 * Program to read matrix elements of order n x m and display on the console.
 * 
 * Input Format
 * 
 * A matrix of order n x m.
 * 
 * Constraints
 * 
 * 1<=n<=5 1<=m<=5
 * 
 * Output Format
 * 
 * Print the same matrix
 * 
 * Sample Input 0
 * 
 * 2 2 1 2 3 4 Sample Output 0
 * 
 * 1 2 3 4 Sample Input 1
 * 
 * 3 3 1 2 3 4 5 6 7 8 9 Sample Output 1
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Input 2
 * 
 * 3 3 1 0 0 0 1 0 0 0 1 Sample Output 2
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Input 3
 * 
 * 3 3 1 1 1 1 1 1 1 1 1 Sample Output 3
 * 
 * 1 1 1 1 1 1 1 1 1
 */