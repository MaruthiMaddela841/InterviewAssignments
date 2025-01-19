package in.ineuron.medium;

import java.util.Scanner;

public class LBP143 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if (m < n || m == n) {
			for (int i = m; i <= n; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println(m);
		}

	}

}
/*
 * Write a function that, given the start startNum and end endNum values, return
 * an array containing all the numbers inclusive to that range. Note: The
 * numbers in the array are sorted in ascending order. If startNum is greater
 * than endNum, return an array with the higher value.
 * 
 * Input Format
 * 
 * n and m values
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * return an array with elements from n to m.
 * 
 * Sample Input 0
 * 
 * 1 5 Sample Output 0
 * 
 * 1 2 3 4 5 Sample Input 1
 * 
 * 2 8 Sample Output 1
 * 
 * 2 3 4 5 6 7 8 Sample Input 2
 * 
 * 10 20 Sample Output 2
 * 
 * 10 11 12 13 14 15 16 17 18 19 20
 */