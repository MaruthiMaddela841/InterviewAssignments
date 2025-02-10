package in.ineuron.hard;

import java.util.Scanner;

public class LBP293 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = arr[i] + sum;
			System.out.print(sum + " ");
		}

	}

}
/*
 * Implement a program to find sum of adjacent elements in the array
 * 
 * Input Format
 * 
 * an array size and elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * array with sum of adjacent elements
 * 
 * Sample Input 0
 * 
 * 3 1 2 3 Sample Output 0
 * 
 * 1 3 6 Sample Input 1
 * 
 * 4 1 0 1 4 Sample Output 1
 * 
 * 1 1 2 6
 */