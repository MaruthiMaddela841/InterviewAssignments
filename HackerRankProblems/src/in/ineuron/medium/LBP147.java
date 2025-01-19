package in.ineuron.medium;

import java.util.Scanner;

public class LBP147 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int count = 0;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			int el = arr[i];
			if (el > 0 && count < 2) {
				sum = sum + el;
				count++;
			}
		}
		System.out.println(sum);

	}

}
/*
 * Create a function that takes an array of numbers and returns the sum of the
 * two lowest positive numbers.
 * 
 * Input Format
 * 
 * size and an array
 * 
 * Constraints
 * 
 * Dn't count negative numbers
 * 
 * Output Format
 * 
 * sum of two smallest positive numbers
 * 
 * Sample Input 0
 * 
 * 5 19 5 42 2 77 Sample Output 0
 * 
 * 7 Sample Input 1
 * 
 * 4 2 9 6 -1 Sample Output 1
 * 
 * 8 Sample Input 2
 * 
 * 10 879 953 694 -847 342 221 -91 -723 791 -587 Sample Output 2
 * 
 * 563
 */