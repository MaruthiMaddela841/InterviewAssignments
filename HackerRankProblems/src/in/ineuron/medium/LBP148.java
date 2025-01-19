package in.ineuron.medium;

import java.util.Scanner;

public class LBP148 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		if (num > size) {
			System.out.println(0);
		} else {
			for (int i = size - num; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * Write a function that retrieves the last n elements from an array.
 * 
 * Input Format
 * 
 * size, an array and N value
 * 
 * Constraints
 * 
 * return 0 if n exceeds size of the array
 * 
 * Output Format
 * 
 * last N elements
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 1 Sample Output 0
 * 
 * 5 Sample Input 1
 * 
 * 6 4 3 9 9 7 6 3 Sample Output 1
 * 
 * 9 7 6 Sample Input 2
 * 
 * 5 1 2 3 4 5 7 Sample Output 2
 * 
 * 0
 */