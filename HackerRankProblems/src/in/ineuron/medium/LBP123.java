package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP123 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int pos = sc.nextInt();
			for (int i = pos; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr = Arrays.copyOf(arr, arr.length - 1);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to delete an element from an array at the position
 * 
 * Input Format
 * 
 * size,array elements and position
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * return array after deleting from the location
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 0 Sample Output 0
 * 
 * 2 3 4 5 Sample Input 1
 * 
 * 3 7 8 6 1 Sample Output 1
 * 
 * 7 6 Sample Input 2
 * 
 * 5 11 22 33 44 55 4 Sample Output 2
 * 
 * 11 22 33 44
 */