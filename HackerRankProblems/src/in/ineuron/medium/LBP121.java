package in.ineuron.medium;

import java.util.Scanner;

public class LBP121 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			// arr=Arrays.copyOf(arr,size-1);
			for (int i = 0; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			for (int i = 0; i < size - 1; i++) {
				System.out.print(arr[i] + " ");
			}

		}

	}
}
/*
 * Implement a program to delete an element from an array at the first position
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
 * return array after deleting from first location
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 2 3 4 5 Sample Input 1
 * 
 * 3 11 87 25 Sample Output 1
 * 
 * 87 25 Sample Input 2
 * 
 * 2 1 5 Sample Output 2
 * 
 * 5
 */