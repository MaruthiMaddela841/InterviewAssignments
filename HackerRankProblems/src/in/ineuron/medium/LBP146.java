package in.ineuron.medium;

import java.util.Scanner;

public class LBP146 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int pcount = 0;
		int nsum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				pcount++;
			} else {
				nsum = nsum + arr[i];
			}
		}
		System.out.println(pcount + " " + nsum);

	}

}
/*
 * Create a function that takes an array of positive and negative numbers.
 * Return an array where the first element is the count of positive numbers and
 * the second element is the sum of negative numbers.
 * 
 * Input Format
 * 
 * size and an array
 * 
 * Constraints
 * 
 * If given an empty array, return an empty array and 0 is not positive.
 * 
 * Output Format
 * 
 * two space seperated int values
 * 
 * Sample Input 0
 * 
 * 15 1 2 3 4 5 6 7 8 9 10 -11 -12 -13 -14 -15 Sample Output 0
 * 
 * 10 -65 Sample Input 1
 * 
 * 10 92 6 73 -77 81 -90 99 8 -85 34 Sample Output 1
 * 
 * 7 -252
 */