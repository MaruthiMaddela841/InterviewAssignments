package in.ineuron.medium;

import java.util.Scanner;

public class LBP113 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int max = arr[0];
			for (int i = 1; i < size; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println(max);
		}

	}

}
/*
 * Implement a program to read array elements and find the max element in an
 * array.
 * 
 * Input Format
 * 
 * size and array elements.
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * return max element
 * 
 * Sample Input 0
 * 
 * 8 1 22 33 4 8 9 88 99 Sample Output 0
 * 
 * 99 Sample Input 1
 * 
 * 5 1 2 3 4 5 Sample Output 1
 * 
 * 5 Sample Input 2
 * 
 * 12 1 2 3 4 5 6 7 8 9 -10 -11 -12 Sample Output 2
 * 
 * 9
 */