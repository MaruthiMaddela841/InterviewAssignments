package in.ineuron.medium;

import java.util.Scanner;

public class LBP149 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Write a function that returns all the elements in an array that are strictly
 * greater than their adjacent left and right neighbors.
 * 
 * Input Format
 * 
 * size, an array
 * 
 * Constraints
 * 
 * Do not count boundary numbers, since they only have one left/right neighbor.
 * 
 * Output Format
 * 
 * an array
 * 
 * Sample Input 0
 * 
 * 8 4 5 2 1 4 9 7 2 Sample Output 0
 * 
 * 5 9 Sample Input 1
 * 
 * 9 1 2 1 1 3 2 5 4 4 Sample Output 1
 * 
 * 2 3 5 Sample Input 2
 * 
 * 6 1 2 3 4 5 6
 */