package in.ineuron.medium;

import java.util.Scanner;

public class LBP126 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int e1 = sc.nextInt();
			int e2 = sc.nextInt();
			arr[e1] = e2;
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to update an element in the given array based on position
 * 
 * Input Format
 * 
 * size,array elements and element to be updated and location
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * return array after updating
 * 
 * Sample Input 0
 * 
 * 8 4 7 8 6 1 2 3 5 0 9 Sample Output 0
 * 
 * 9 7 8 6 1 2 3 5 Sample Input 1
 * 
 * 3 11 22 33 1 44 Sample Output 1
 * 
 * 11 44 33 Sample Input 2
 * 
 * 5 8 9 4 5 3 4 111 Sample Output 2
 * 
 * 8 9 4 5 111
 */