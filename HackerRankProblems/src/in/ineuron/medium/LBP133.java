package in.ineuron.medium;

import java.util.Scanner;

public class LBP133 {

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
				System.out.print(arr[i] + brr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to find the sum of two arrays and display the result
 * array
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
 * print resultent array
 * 
 * Sample Input 0
 * 
 * 4 1 2 3 4 5 6 7 8 Sample Output 0
 * 
 * 6 8 10 12 Sample Input 1
 * 
 * 5 1 2 3 4 5 1 1 1 1 1 Sample Output 1
 * 
 * 2 3 4 5 6 Sample Input 2
 * 
 * 3 1 1 1 2 2 2 Sample Output 2
 * 
 * 3 3 3
 */