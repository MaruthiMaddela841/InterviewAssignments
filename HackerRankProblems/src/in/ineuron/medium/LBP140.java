package in.ineuron.medium;

import java.util.Scanner;

public class LBP140 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			int[] brr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < size; i++) {
				brr[i] = sc.nextInt();
			}

			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] - brr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to find the difference between two arrays
 * 
 * Input Format
 * 
 * size and array elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * print difference between two arrays as third array
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 5 4 3 2 1 Sample Output 0
 * 
 * -4 -2 0 2 4 Sample Input 1
 * 
 * 6 10 11 12 13 15 17 7 14 12 1 5 9 Sample Output 1
 * 
 * 3 -3 0 12 10 8 Sample Input 2
 * 
 * 3 1 2 3 3 2 1 Sample Output 2
 * 
 * -2 0 2
 */