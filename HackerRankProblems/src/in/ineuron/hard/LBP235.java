package in.ineuron.hard;

import java.util.Scanner;

public class LBP235 {

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
		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j < i; j++) {
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
 * Program to accept a matrix and check whether it is upper triangular matrix or
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
 * 1 2 3 0 5 6 0 0 9 Sample Output 0
 * 
 * Yes Sample Input 1
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Output 1
 * 
 * No
 */