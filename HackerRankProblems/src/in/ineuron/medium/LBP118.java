package in.ineuron.medium;

import java.util.Scanner;

public class LBP118 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int search = sc.nextInt();
			int count = 0;
			for (int i = 0; i < size; i++) {
				if (search == arr[i]) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
/*
 * Implement a program to find the number of occurrences of the given element.
 * 
 * Input Format
 * 
 * size,array element and key element
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * return number of occurrences
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 3 Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * 8 1 1 1 1 1 1 1 8 1 Sample Output 1
 * 
 * 7 Sample Input 2
 * 
 * 8 1 1 1 1 1 1 1 8 8 Sample Output 2
 * 
 * 1
 */