package in.ineuron.medium;

import java.util.Scanner;

public class LBP145 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			int num = arr[i];
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}

	}

}
/*
 * Create a function that takes an array of numbers and returns only the even
 * values. Note:
 * 
 * Return all even numbers in the order they were given. All test cases contain
 * valid numbers ranging from 1 to 3000.
 * 
 * Input Format
 * 
 * size and an array
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * remove all odd numbers and print
 * 
 * Sample Input 0
 * 
 * 8 1 2 3 4 5 6 7 8 Sample Output 0
 * 
 * 2 4 6 8 Sample Input 1
 * 
 * 7 43 65 23 89 53 9 6 Sample Output 1
 * 
 * 6 Sample Input 2
 * 
 * 6 718 991 449 644 380 440 Sample Output 2
 * 
 * 718 644 380 440
 */