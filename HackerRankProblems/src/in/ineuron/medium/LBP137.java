package in.ineuron.medium;

import java.util.Scanner;

public class LBP137 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int[] arr = new int[size];
			int[] brr = new int[0];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < size; i++) {
				int num = arr[i];
				int rev = 0;
				while (num != 0) {
					int r = num % 10;
					rev = rev * 10 + r;
					num = num / 10;
				}
				System.out.print(rev + " ");
			}
		}

	}

}
/*
 * Implement a program to print reverse of each element in an array
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
 * print reverse of each element in an array
 * 
 * Sample Input 0
 * 
 * 5 121 131 123 124 125 Sample Output 0
 * 
 * 121 131 321 421 521 Sample Input 1
 * 
 * 4 178 205 637 111 Sample Output 1
 * 
 * 871 502 736 111 Sample Input 2
 * 
 * 2 121 131 Sample Output 2
 * 
 * 121 131
 */