package in.ineuron.medium;

import java.util.Scanner;

public class LBP170 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = 0;
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] brr = new int[m * n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				brr[k] = arr[i][j];
				k++;
			}
		}
		for (int i = 0; i < m * n; i++) {
			System.out.print(brr[i] + " ");
		}

	}

}
/*
 * Implement a program to convert the given matrix into array
 * 
 * Input Format
 * 
 * matrix of size mxn and elements
 * 
 * Constraints
 * 
 * one D array is required
 * 
 * Output Format
 * 
 * one-D array should be printed on screen
 * 
 * Sample Input 0
 * 
 * 1 1 1 Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * 2 2 1 2 3 4 Sample Output 1
 * 
 * 1 2 3 4
 */