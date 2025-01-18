package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP120 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int insertion = sc.nextInt();
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = insertion;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to insert an element into an array at the last position
 * 
 * Input Format
 * 
 * size,array elements and element to be inserted
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * return array after insertion
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 10 Sample Output 0
 * 
 * 1 2 3 4 5 10 Sample Input 1
 * 
 * 4 7 8 9 10 5 Sample Output 1
 * 
 * 7 8 9 10 5 Sample Input 2
 * 
 * 3 2 3 4 1 Sample Output 2
 * 
 * 2 3 4 1
 */