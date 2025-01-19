package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP122 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			arr = Arrays.copyOf(arr, size - 1);
			for (int i = 0; i < size - 1; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to delete an element from an array at the last position
 * 
 * Input Format
 * 
 * size,array elements
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * return array after deleting from last location
 * 
 * Sample Input 0
 * 
 * 3 1 2 3 Sample Output 0
 * 
 * 1 2 Sample Input 1
 * 
 * 8 44 55 77 88 11 22 33 44 Sample Output 1
 * 
 * 44 55 77 88 11 22 33 Sample Input 2
 * 
 * 3 3 2 1 Sample Output 2
 * 
 * 3 2
 */