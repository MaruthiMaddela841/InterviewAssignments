package in.ineuron.medium;

import java.util.Scanner;

public class LBP158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		boolean isAlternating = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i] > 0 && arr[i + 1] > 0) || (arr[i] < 0 && arr[i + 1] < 0)) {
				isAlternating = false;
				break;
			}
		}
		System.out.println(isAlternating);
	}
}
/*
 * Create a function which validates whether a given array alternates between
 * positive and negative numbers.
 * 
 * Input Format
 * 
 * an array size and array
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * 3 3 -2 5 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * 6 3 -2 5 -5 2 -8 Sample Output 1
 * 
 * true
 */