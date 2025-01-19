package in.ineuron.medium;

import java.util.Scanner;

public class LBP130 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < size; i++) {
				int el = arr[i];
				int count = 0;
				for (int j = i + 1; j < size; j++) {
					if (arr[j] == el) {
						count++;
					}
				}
				if (count > 0) {
					continue;
				} else
					System.out.print(el + " ");
			}

		}

	}

}
/*
 * Implement a program to find the unique elements present in the given array.
 * 
 * Input Format
 * 
 * size, array elements
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * print unique elements present in the array
 * 
 * Sample Input 0
 * 
 * 5 1 1 2 3 4 Sample Output 0
 * 
 * 1 2 3 4 Sample Input 1
 * 
 * 6 1 1 1 1 1 2 Sample Output 1
 * 
 * 1 2 Sample Input 2
 * 
 * 7 1 1 1 2 2 2 3 Sample Output 2
 * 
 * 1 2 3
 */