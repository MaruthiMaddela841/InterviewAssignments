package in.ineuron.medium;

import java.util.Scanner;

public class LBP115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int max = arr[0];
			int min = arr[0];
			for (int i = 1; i < size; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
				if (min > arr[i]) {
					min = arr[i];
				}
			}
			System.out.println(max - min);
		}

	}

}
/*
 * Implement a program to read array elements and find the difference between
 * max and min element in an array.
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
 * return difference between max and min element.
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 4 Sample Input 1
 * 
 * 10 1 2 3 4 5 6 7 8 9 -10 Sample Output 1
 * 
 * 19 Sample Input 2
 * 
 * 5 1 -2 3 -4 5 Sample Output 2
 * 
 * 9
 */