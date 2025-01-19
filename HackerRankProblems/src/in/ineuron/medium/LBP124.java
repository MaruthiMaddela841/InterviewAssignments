package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP124 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int ele = sc.nextInt();
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == ele) {
					for (int j = i; j < arr.length - 1; j++) {
						arr[j] = arr[j + 1];
					}
					break;
				}
				count++;
			}
			if (count == size && arr[size - 1] != ele) {
				System.out.println(-1);
			} else {

				arr = Arrays.copyOf(arr, arr.length - 1);
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			}
		}

	}

}
/*
 * Implement a program to delete the given element from an array
 * 
 * Input Format
 * 
 * size,array elements and element
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * return array after deleting
 * 
 * Sample Input 0
 * 
 * 5 7 6 1 2 3 1 Sample Output 0
 * 
 * 7 6 2 3 Sample Input 1
 * 
 * 3 11 22 33 44 Sample Output 1
 * 
 * -1 Sample Input 2
 * 
 * 4 1 2 3 4 3 Sample Output 2
 * 
 * 1 2 4
 */