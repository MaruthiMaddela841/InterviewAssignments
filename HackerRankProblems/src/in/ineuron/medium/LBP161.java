package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP161 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int[] arr = new int[size1];
		boolean a = true;
		boolean b = true;
		for (int i = 0; i < size1; i++) {
			arr[i] = sc.nextInt();
		}
		int size2 = sc.nextInt();
		int[] brr = new int[size2];
		for (int i = 0; i < size2; i++) {
			brr[i] = sc.nextInt();
		}
		arr = Arrays.copyOf(arr, arr.length + brr.length);
		int j = 0;
		for (int i = size1; i < (size1 + size2); i++) {
			arr[i] = brr[j];
			j++;
		}
		Arrays.sort(arr);
		boolean res = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i + 1] - arr[i]) != 1) {
				res = false;
			}
		}
		System.out.println(res);

	}

}
/*
 * Write a function that returns true if two arrays, when combined, form a
 * consecutive sequence. A consecutive sequence is a sequence without any gaps
 * in the integers, e.g. 1, 2, 3, 4, 5 is a consecutive sequence, but 1, 2, 4, 5
 * is not.
 * 
 * Input Format
 * 
 * two array sizes and array elements
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
 * 4 12 13 17 19 4 14 16 15 18 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * 4 7 4 5 1 3 2 3 6 Sample Output 1
 * 
 * true
 */