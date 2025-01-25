package in.ineuron.hard;

import java.util.Scanner;

public class LBP233 {

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
		int col1 = sc.nextInt() - 1;
		int col2 = sc.nextInt() - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int temp = j;
				if (j == col1) {
					j = col2;
				} else if (j == col2) {
					j = col1;
				}
				System.out.print(arr[i][j] + " ");
				j = temp;
			}
			System.out.println();

		}

	}

}
/*
 * Implement a program to swap two given columns
 * 
 * Input Format
 * 
 * matrix and m and n values
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
 * 1 2 3 4 5 6 7 8 9 1 2 Sample Output 0
 * 
 * 2 1 3 5 4 6 8 7 9 Sample Input 1
 * 
 * 1 2 3 4 5 6 7 8 9 1 3 Sample Output 1
 * 
 * 3 2 1 6 5 4 9 8 7
 */