package in.ineuron.medium;

import java.util.Scanner;

public class LBP150 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int res = 0;
		for (int i = 0; i < size; i++) {
			int num = arr[i];
			int count = 0;
			if (num == 1) {
				continue;
			} else {
				for (int j = 1; j <= num; j++) {
					if (num % j == 0)
						count++;
				}
				if (count == 2)
					res++;
			}

		}
		if (res == size) {
			System.out.println("true");
		} else
			System.out.println("false");

	}

}
/*
 * Create a function thats takes an array of integers and returns true if every
 * number is prime. Otherwise, return false.
 * 
 * Input Format
 * 
 * size and an array
 * 
 * Constraints
 * 
 * 1 is not a prime number.
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * false Sample Input 1
 * 
 * 9 2 3 5 7 13 17 19 23 29 Sample Output 1
 * 
 * true Sample Input 2
 * 
 * 3 1 5 3 Sample Output 2
 * 
 * false
 */