package in.ineuron.easy;

import java.util.Scanner;

public class LBP011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int last;
		if (n > 0) {
			while (n > 0) {
				last = n % 10;
				if (last == 2 || last == 3 || last == 5 || last == 7) {
					sum = sum + last;
				}
				n = n / 10;
			}
			System.out.println(sum);
		}

	}

}

/*
 * Implement a program to calculate sum of prime digits present in the given
 * number
 * 
 * Input Format
 * 
 * a number from the user
 * 
 * Constraints
 * 
 * n>0
 * 
 * Output Format
 * 
 * print sum of prime digits
 * 
 * Sample Input 0
 * 
 * 123 Sample Output 0
 * 
 * 5 Sample Input 1
 * 
 * 101 Sample Output 1
 * 
 * 0 Sample Input 2
 * 
 * 142 Sample Output 2
 * 
 * 2
 */