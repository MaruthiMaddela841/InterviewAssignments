package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP182 {

	static boolean primedef(int num) {
		int flag = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = 1;
			}
		}
		if (flag == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] brr = new int[0];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int j = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 1) {
				continue;
			} else if (arr[i] > 1) {
				boolean b = primedef(arr[i]);
				if (b) {
					brr = Arrays.copyOf(brr, brr.length + 1);
					brr[j] = arr[i];
					j++;
				}
			}
		}
		if (brr.length <= 1) {
			System.out.println(0);
		} else {
			System.out.println(brr[brr.length - 1] - brr[0]);
		}

	}

}
/*
 * You are given an array of integers, N of size array length. Find the absolute
 * difference (i.e. diff>=0) between the largest and smallest prime numbers.
 * Note: 1. if there are 1 or fewer prime numbers in array return 0. 2. the
 * array may contain +ve and -ve numbers, ignore -ve numbers. 3. 1 and 0 are not
 * prime.
 * 
 * Input Format
 * 
 * array size and array elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * absolute diff
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 3 Sample Input 1
 * 
 * 5 1 -2 3 4 5 Sample Output 1
 * 
 * 2 Sample Input 2
 * 
 * 5 1 -2 -3 4 5 Sample Output 2
 * 
 * 0
 */