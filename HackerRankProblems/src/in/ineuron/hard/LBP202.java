package in.ineuron.hard;

import java.util.Scanner;

public class LBP202 {

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
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);

	}

}
/*
 * Program to read matrix elements and find sum of all elements in the matrix.
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
 * Print sum of matrix elements
 * 
 * Sample Input 0
 * 
 * 2 2 1 2 3 4 Sample Output 0
 * 
 * 10 Sample Input 1
 * 
 * 3 3 1 2 3 4 5 6 7 8 9 Sample Output 1
 * 
 * 45 Sample Input 2
 * 
 * 3 3 1 0 0 0 1 0 0 0 1 Sample Output 2
 * 
 * 3
 */