package in.ineuron.medium;

import java.util.Scanner;

public class LBP125 {

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
			for (int i = 0; i < size; i++) {
				if (arr[i] == e1) {
					arr[i] = e2;
				}
			}
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Implement a program to update an element in the given array
 * 
 * Input Format
 * 
 * size,array elements and element to be updated (old element & new element)
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
 * 6 11 22 33 44 55 66 33 99 Sample Output 0
 * 
 * 11 22 99 44 55 66 Sample Input 1
 * 
 * 3 1 2 3 3 4 Sample Output 1
 * 
 * 1 2 4 Sample Input 2
 * 
 * 5 1 1 1 1 1 1 6 Sample Output 2
 * 
 * 6 6 6 6 6 Sample Input 3
 * 
 * 8 1 1 1 1 1 1 7 8 1 10 Sample Output 3
 * 
 * 10 10 10 10 10 10 7 8
 */