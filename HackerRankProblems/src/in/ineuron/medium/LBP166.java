package in.ineuron.medium;

import java.util.Scanner;

public class LBP166 {

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
			int count = 0;
			for (int j = 0; j < m; j++) {
				if (count < arr[i][j]) {
					count = arr[i][j];
				}
			}
			System.out.print(count + " ");
		}

	}

}
/*
 * a company has a sales record of N products for M days. The company wishes to
 * know the maximum revenue received from a given product of the N products each
 * day. Write an algorithm to find the higest revenue received each day.
 * 
 * Input Format
 * 
 * space seperated integers N and M
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * M space seperated integers representing the maximum received each day
 * 
 * Sample Input 0
 * 
 * 3 4 100 198 333 233 122 232 221 111 223 565 255 764 Sample Output 0
 * 
 * 333 232 764 Sample Input 1
 * 
 * 3 3 111 222 333 444 555 666 777 888 999 Sample Output 1
 * 
 * 333 666 999
 */