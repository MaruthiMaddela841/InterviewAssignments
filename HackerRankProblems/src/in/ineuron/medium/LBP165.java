package in.ineuron.medium;

import java.util.Scanner;

public class LBP165 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < size; j++) {
			for (int i = 0; i < size - 1; i++) {
				int temp = arr[i];
				if (arr[i] > arr[i + 1]) {
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println(arr[1] + arr[size - 3]);

	}

}
/*
 * Given an integer array and an integer N denoting the array length as input.
 * your task is to return the sum of third largest and second minimum elements
 * of the array.
 * 
 * Input Format
 * 
 * array size and array elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * an int value
 * 
 * Sample Input 0
 * 
 * 5 5 3 2 1 4 Sample Output 0
 * 
 * 5 Sample Input 1
 * 
 * 6 12 45 100 250 300 450 Sample Output 1
 * 
 * 295
 */