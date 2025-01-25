package in.ineuron.hard;

import java.util.Scanner;

public class LBP231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 3;
		int m = 3;
		int totalElements = 0;
		int zeroCount = 0;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 0)
					zeroCount++;
				else
					totalElements++;
			}
		}
		if (zeroCount >= totalElements) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
/*
 * Implement a program to check whether the given matrix is sparse matrix or
 * not. Note: a sparse matrix is a matrix with the majority of its elements
 * equal to zero.
 * 
 * Input Format
 * 
 * a matrix
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
 * 1 2 3 4 5 6 7 8 9 Sample Output 0
 * 
 * No Sample Input 1
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Output 1
 * 
 * Yes
 */