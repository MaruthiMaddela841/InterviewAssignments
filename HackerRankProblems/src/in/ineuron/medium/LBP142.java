package in.ineuron.medium;

import java.util.Scanner;

public class LBP142 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ele = sc.nextInt();
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = ele * (i + 1);
			}
			for (int n : arr) {
				System.out.print(n + " ");
			}
		}

	}

}
/*
 * Implement a program to create an array with n elements by taking multiples of
 * m.
 * 
 * Input Format
 * 
 * m and n
 * 
 * Constraints
 * 
 * size of the array must be n
 * 
 * Output Format
 * 
 * return an array with n elements which contains multiples of m.
 * 
 * Sample Input 0
 * 
 * 7 5 Sample Output 0
 * 
 * 7 14 21 28 35 Sample Input 1
 * 
 * 12 10 Sample Output 1
 * 
 * 12 24 36 48 60 72 84 96 108 120 Sample Input 2
 * 
 * 2 5 Sample Output 2
 * 
 * 2 4 6 8 10
 */