package in.ineuron.medium;

import java.util.Scanner;

public class LBP136 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int a = 0;
			int b = arr.length - 1;
			while (a <= b) {
				System.out.print(arr[a] + arr[b] + " ");
				a++;
				b--;
			}
		}

	}

}
/*
 * Implement a program to find the sum of first and last, second and second last
 * and so on in an array.
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
 * print sum of first and last, second and second last and so on
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 6 6 6 Sample Input 1
 * 
 * 4 1 2 3 4 Sample Output 1
 * 
 * 5 5 Sample Input 2
 * 
 * 6 1 2 3 4 5 6 Sample Output 2
 * 
 * 7 7 7 Sample Input 3
 * 
 * 7 1 2 3 4 5 6 7 Sample Output 3
 * 
 * 8 8 8 8
 */