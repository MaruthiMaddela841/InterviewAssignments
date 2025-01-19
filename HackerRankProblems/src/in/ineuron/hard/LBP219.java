package in.ineuron.hard;

import java.util.Scanner;

public class LBP219 {

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
		int even = 0;
		int odd = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] > 0 && arr[i][j] % 2 == 0)
					even++;
				else if (arr[i][j] > 0 && arr[i][j] % 2 != 0)
					odd++;
			}
		}
		System.out.println(odd);
		System.out.println(even);

	}

}
/*
 * Write a program to find frequency of odd and even elements in the matrix
 * excluding 0.
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
 * odd elements and even elements count
 * 
 * Sample Input 0
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Output 0
 * 
 * 5 4 Sample Input 1
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Output 1
 * 
 * 3 0 Sample Input 2
 * 
 * 1 0 0 0 2 0 0 0 3 Sample Output 2
 * 
 * 2 1
 */