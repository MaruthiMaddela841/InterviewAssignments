package in.ineuron.medium;

import java.util.Scanner;

public class LBP128 {

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
				int temp = arr[i];
				arr[i] = temp + 1;
			}
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to increment each element in the given array
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
 * increment each element by one unit
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 2 3 4 5 6 Sample Input 1
 * 
 * 4 10 11 12 13 Sample Output 1
 * 
 * 11 12 13 14 Sample Input 2
 * 
 * 10 11 22 33 44 55 66 77 88 99 0 Sample Output 2
 * 
 * 12 23 34 45 56 67 78 89 100 1
 */