package in.ineuron.medium;

import java.util.Scanner;

public class LBP117 {

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
			System.out.println(arr[arr.length - 2]);
		}

	}

}
/*
 * Implement a program to read array elements and find the second min element in
 * an array.
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
 * return second min element
 * 
 * Sample Input 0
 * 
 * 5 1 8 7 5 2 Sample Output 0
 * 
 * 2 Sample Input 1
 * 
 * 7 10 11 12 7 8 9 -10 Sample Output 1
 * 
 * 7 Sample Input 2
 * 
 * 3 1 2 3 Sample Output 2
 * 
 * 2
 */