package in.ineuron.medium;

import java.util.Scanner;

public class LBP134 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int[] arr = new int[size];
			int[] brr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < size; i++) {
				if (i % 2 == 0) {
					sum = sum + arr[i];
				}
			}
			System.out.println(sum);
		}

	}

}
/*
 * Implement a program to find the sum of elements avaiable at even index
 * locations in an array.
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
 * print sum value
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 9 Sample Input 1
 * 
 * 5 1 1 1 1 1 Sample Output 1
 * 
 * 3 Sample Input 2
 * 
 * 6 1 2 3 4 5 6 Sample Output 2
 * 
 * 9
 */