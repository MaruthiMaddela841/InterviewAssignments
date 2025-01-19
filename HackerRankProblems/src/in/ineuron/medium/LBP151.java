package in.ineuron.medium;

import java.util.Scanner;

public class LBP151 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				sum = sum + arr[i] - arr[i + 1];
			} else {
				sum = sum + arr[i + 1] - arr[i];
			}
		}
		System.out.println(sum);

	}

}
/*
 * Write a program to calculate the sum of distances between the adjacent
 * numbers in an array of positive integers.
 * 
 * Input Format
 * 
 * array size and array elements
 * 
 * Constraints
 * 
 * 1<=size<=100
 * 
 * Output Format
 * 
 * print sum of distances between adjacent numbers
 * 
 * Sample Input 0
 * 
 * 5 10 11 7 12 14 Sample Output 0
 * 
 * 12 Sample Input 1
 * 
 * 5 1 2 3 4 5 Sample Output 1
 * 
 * 4 Sample Input 2
 * 
 * 4 11 22 33 44 Sample Output 2
 * 
 * 33 Sample Input 3
 * 
 * 3 100 200 50 Sample Output 3
 * 
 * 250
 */