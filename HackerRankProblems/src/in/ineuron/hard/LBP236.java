package in.ineuron.hard;

import java.util.Scanner;

public class LBP236 {

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
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i][j] != 0) {
					b = false;
					break;
				}
			}
		}
		if (b)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
/*
 * Program to accept a matrix and check whether it is lower triangular matrix or
 * not
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
 * Yes or No
 * 
 * Sample Input 0
 * 
 * 1 0 0 4 5 0 7 8 9 Sample Output 0
 * 
 * Yes Sample Input 1
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Output 1
 * 
 * Yes Sample Input 2
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Output 2
 * 
 * No
 */