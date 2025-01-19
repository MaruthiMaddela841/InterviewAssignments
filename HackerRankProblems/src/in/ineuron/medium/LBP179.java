package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i <= arr.length - 1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
/*
 * given an array of size n, write a function to rearrange the numbers of the
 * array in such that even and odd numbers are arranged alternatively in
 * increasing order.
 * 
 * Input Format
 * 
 * array size n and elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * updated array
 * 
 * Sample Input 0
 * 
 * 4 1 2 3 4 Sample Output 0
 * 
 * 2 1 4 3 Sample Input 1
 * 
 * 6 1 2 3 4 5 6 Sample Output 1
 * 
 * 2 1 4 3 6 5
 */