package in.ineuron.medium;

import java.util.Scanner;

public class LBP141 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			for (int j = 0; j < size; j++) {
				for (int i = 0; i < size - 1; i++) {
					int temp;
					if (arr[i] > arr[i + 1]) {
						temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
				}
			}
			if (size % 2 != 0) {
				for (int i = 0; i <= size / 2; i++) {
					System.out.print(arr[i] + " " + arr[size - 1 - i] + " ");
				}
			} else {
				for (int i = 0; i < size / 2; i++) {
					System.out.print(arr[i] + " " + arr[size - 1 - i] + " ");
				}
			}
		}

	}

}
/*
 * Implement a program to rearrange an array in such an order that-
 * smallest,largest,2nd smallest, 2nd largest and so on.
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
 * print the elements smallest,largest,2nd smallest,2nd largest and so on.
 * 
 * Sample Input 0
 * 
 * 5 1 4 5 3 2 Sample Output 0
 * 
 * 1 5 2 4 3 3 Sample Input 1
 * 
 * 6 10 -10 20 -20 30 -30 Sample Output 1
 * 
 * -30 30 -20 20 -10 10 Sample Input 2
 * 
 * 4 1 2 3 4 Sample Output 2
 * 
 * 1 4 2 3
 */