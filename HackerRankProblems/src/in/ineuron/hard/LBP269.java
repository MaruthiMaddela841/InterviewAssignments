package in.ineuron.hard;

import java.util.Scanner;

public class LBP269 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
/*
 * James wants to travel by bus to reach his friend John's home. John gave a
 * hint that all busses from Jame's location will reach his home if the bus
 * number is prime number. Write a programto help James find the bus that
 * reaches John's home.
 * 
 * Input Format
 * 
 * a number from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * yes or no
 * 
 * Sample Input 0
 * 
 * 12 Sample Output 0
 * 
 * no Sample Input 1
 * 
 * 23 Sample Output 1
 * 
 * yes Sample Input 2
 * 
 * 15 Sample Output 2
 * 
 * no
 */