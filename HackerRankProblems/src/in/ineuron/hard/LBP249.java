package in.ineuron.hard;

import java.util.Scanner;

public class LBP249 {

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
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int count = 0;
				int num = arr[i][j];
				int temp = 0;
				while (num != 0) {
					int res = num % 10;
					temp = temp * 10 + res;
					num = num / 10;
				}
				System.out.print(temp + " ");
			}
			System.out.println();
		}

	}

}
/*
 * Implement a program to reverse each element in the matrix.
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
 * result matrix
 * 
 * Sample Input 0
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Output 0
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Input 1
 * 
 * 11 12 13 14 15 16 17 18 19 Sample Output 1
 * 
 * 11 21 31 41 51 61 71 81 91 Sample Input 2
 * 
 * 121 131 141 151 161 171 181 191 111 Sample Output 2
 * 
 * 121 131 141 151 161 171 181 191 111
 */