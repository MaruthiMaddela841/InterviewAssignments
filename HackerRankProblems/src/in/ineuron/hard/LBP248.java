package in.ineuron.hard;

import java.util.Scanner;

public class LBP248 {

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
				for (int k = 2; k <= num; k++) {
					if (num % k == 0) {
						count++;
					}
				}
				if (count == 1) {
					sum++;
				}
			}

		}
		System.out.println(sum);

	}

}
/*
 * Implement a program to count number of prime digits present in the matrix.
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
 * prime digits count
 * 
 * Sample Input 0
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Output 0
 * 
 * 4 Sample Input 1
 * 
 * 10 11 12 13 14 15 16 17 18 Sample Output 1
 * 
 * 4 Sample Input 2
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Output 2
 * 
 * 0
 */