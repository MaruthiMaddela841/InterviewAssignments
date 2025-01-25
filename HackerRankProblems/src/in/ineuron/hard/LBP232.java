package in.ineuron.hard;

import java.util.Scanner;

public class LBP232 {

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
		int row1 = sc.nextInt() - 1;
		int row2 = sc.nextInt() - 1;
		for (int i = 0; i < n; i++) {
			int temp = i;
			if (i == row1) {
				i = row2;
			} else if (i == row2) {
				i = row1;
			}
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			i = temp;
		}

	}

}
/*
 * Implement a program to swap two given rows.
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
 * 4 5 6 1 2 3 7 8 9 Sample Input 1
 * 
 * 1 0 0 0 1 0 0 0 1 1 2 Sample Output 1
 * 
 * 0 1 0 1 0 0 0 0 1
 */