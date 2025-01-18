package in.ineuron.medium;

import java.util.Scanner;

public class LBP119 {

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
			int[] res = new int[arr.length + 1];
			for (int i = 1; i < res.length; i++) {
				res[i] = arr[i - 1];
			}
			res[0] = insertion;
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i] + " ");
			}

		}

	}

}
/*
 * Implement a program to insert an element into an array at the first position
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
 * 10 1 2 3 4 5 Sample Input 1
 * 
 * 4 7 8 9 10 5 Sample Output 1
 * 
 * 5 7 8 9 10 Sample Input 2
 * 
 * 3 2 3 4 1 Sample Output 2
 * 
 * 1 2 3 4
 */