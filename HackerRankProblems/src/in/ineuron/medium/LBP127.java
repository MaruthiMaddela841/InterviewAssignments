package in.ineuron.medium;

import java.util.Scanner;

public class LBP127 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int[] res = new int[size];
			int count = 0;
			for (int i = size - 1; i >= 0; i--) {
				res[count] = arr[i];
				count++;
			}
			for (int i = 0; i < size; i++) {
				System.out.print(res[i] + " ");
			}
		}

	}

}
/*
 * Write a program to reverse the elements present in an array
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
 * return array in reverse
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 5 4 3 2 1 Sample Input 1
 * 
 * 6 1 2 3 1 2 3 Sample Output 1
 * 
 * 3 2 1 3 2 1 Sample Input 2
 * 
 * 10 10 20 30 40 50 60 70 80 90 100 Sample Output 2
 * 
 * 100 90 80 70 60 50 40 30 20 10
 */