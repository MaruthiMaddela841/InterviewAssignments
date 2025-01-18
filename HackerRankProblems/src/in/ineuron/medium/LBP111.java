package in.ineuron.medium;

import java.util.Scanner;

public class LBP111 {

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
					if (arr[j] < arr[j + 1]) {
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
 * Implement a program to sort the given array elements in DESC order.
 * 
 * Input Format
 * 
 * size and array elements
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * sorted array in DESC
 * 
 * Sample Input 0
 * 
 * 4 1 3 2 4 Sample Output 0
 * 
 * 4 3 2 1 Sample Input 1
 * 
 * 5 5 1 3 2 4 Sample Output 1
 * 
 * 5 4 3 2 1 Sample Input 2
 * 
 * 6 10 50 20 40 30 60 Sample Output 2
 * 
 * 60 50 40 30 20 10
 */