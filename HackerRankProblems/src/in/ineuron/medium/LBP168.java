package in.ineuron.medium;

import java.util.Scanner;

public class LBP168 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		boolean b = false;
		for (int i = 0; i < size / 2; i++) {
			if (arr[i] == arr[size - i - 1]) {
				b = true;
			} else {
				b = false;
				break;
			}
		}
		System.out.println(b);

	}

}
/*
 * Implement a program to check whether an array is paliandrome or not.
 * 
 * Input Format
 * 
 * Array size N and Array Elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 2 1 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * 4 10 11 12 13 Sample Output 1
 * 
 * false
 */