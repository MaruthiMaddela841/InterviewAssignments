package in.ineuron.medium;

import java.util.Scanner;

public class LBP131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - 1; j++) {
					if (arr[j] >= arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to read an array and sort array elements with 0s, 1s and
 * 2s.
 * 
 * Input Format
 * 
 * size, array elements
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * print sorted elements
 * 
 * Sample Input 0
 * 
 * 3 1 0 2 Sample Output 0
 * 
 * 0 1 2 Sample Input 1
 * 
 * 4 1 0 1 2 Sample Output 1
 * 
 * 0 1 1 2 Sample Input 2
 * 
 * 5 1 1 0 2 2 Sample Output 2
 * 
 * 0 1 1 2 2
 */