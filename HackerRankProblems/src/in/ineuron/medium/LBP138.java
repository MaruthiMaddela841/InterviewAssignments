package in.ineuron.medium;

import java.util.Scanner;

public class LBP138 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int[] arr = new int[size];
			int[] brr = new int[0];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int ecount = 0;
			int ocount = 0;
			for (int i = 0; i < size; i++) {
				int el = arr[i];
				if (el % 2 == 0)
					ecount++;
				else
					ocount++;
			}
			System.out.println(ecount);
			System.out.println(ocount);
		}

	}

}
/*
 * Implement a program to find number of even and odd elements in the given
 * array
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
 * print number of even and odd elements line by line
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 2 3 Sample Input 1
 * 
 * 6 1 2 3 4 5 6 Sample Output 1
 * 
 * 3 3 Sample Input 2
 * 
 * 4 1 2 3 4 Sample Output 2
 * 
 * 2 2 Sample Input 3
 * 
 * 3 1 2 3 Sample Output 3
 * 
 * 1 2
 */