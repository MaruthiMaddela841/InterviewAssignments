package in.ineuron.hard;

import java.util.Scanner;

public class LBP250 {

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
				if (temp == arr[i][j]) {
					System.out.print(temp + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}

	}

}
/*
 * Implement a program to keep all paliandrome numbers as it is and replace
 * remaining with 0.
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
 * 111 122 133 141 151 168 888 567 999 Sample Output 1
 * 
 * 111 0 0 141 151 0 888 0 999 Sample Input 2
 * 
 * 11 22 33 44 55 66 77 88 99 Sample Output 2
 * 
 * 11 22 33 44 55 66 77 88 99
 */