package in.ineuron.medium;

import java.util.Scanner;

public class LBP132 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int max = arr[0];
			for (int i = 0; i < size; i++) {
				if (arr[i] >= max) {
					max = arr[i];
					for (int j = i; j >= 0; j--) {
						arr[j] = max;
					}

				}
			}
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}

		}
		
		// Replace each element with the greatest element on its right side
//        int max = arr[size - 1]; // Initialize with the last element
//        for (int i = size - 2; i >= 0; i--) {
//            int temp = arr[i];   // Store the current value
//            arr[i] = Math.max(max, arr[i + 1]); // Update with the max so far
//            max = Math.max(temp, max);         // Update max for next iteration
//        }

	}

}
/*
 * Implement a program to read an array and replace every element with the
 * greatest element on its right side.
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
 * print updated array elements
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 5 5 5 5 5 Sample Input 1
 * 
 * 6 1 0 2 1 0 2 Sample Output 1
 * 
 * 2 2 2 2 2 2
 */