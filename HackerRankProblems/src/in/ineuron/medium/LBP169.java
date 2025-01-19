package in.ineuron.medium;

import java.util.Scanner;

public class LBP169 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int m = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		if (size == 1) {
			System.out.println(arr[0]);
		} else {
			int count = 0;

			for (int i = 2; i < size; i++) {
				if (i * i == size) {
					count = 1;
					m = i;
				}
			}
			int term = 0;
			if (count == 1) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < m; j++) {
						System.out.print(arr[term] + " ");
						term++;
					}
					System.out.println();
				}
			}
		}

	}

}
/*
 * Implement a program to convert an array into matrix.
 * 
 * Input Format
 * 
 * array size and elements
 * 
 * Constraints
 * 
 * element count should be 1,4,9,16,25 and so on
 * 
 * Output Format
 * 
 * matrix
 * 
 * Sample Input 0
 * 
 * 1 1 Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * 4 1 2 3 4 Sample Output 1
 * 
 * 1 2 3 4
 */