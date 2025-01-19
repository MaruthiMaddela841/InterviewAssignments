package in.ineuron.hard;

import java.util.Scanner;

public class LBP217 {

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
			for (int j = i; j < m; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
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
 * Implement a program to print transpose of a matrix
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
 * print transpose of the matrix
 * 
 * Sample Input 0
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Output 0
 * 
 * 1 4 7 2 5 8 3 6 9 Sample Input 1
 * 
 * 1 0 0 0 2 0 0 0 3 Sample Output 1
 * 
 * 1 0 0 0 2 0 0 0 3 Sample Input 2
 * 
 * 0 2 4 1 2 3 1 3 5 Sample Output 2
 * 
 * 0 1 1 2 2 3 4 3 5
 */