package in.ineuron.hard;

import java.util.Scanner;

public class LBP268 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int add = num1 + num2;
		int mul = num1 * num2;
		if (add >= mul)
			System.out.println(add - mul);
		else
			System.out.println(mul - add);

	}

}
/*
 * Write a program to get two inputs from the user and find the absolute
 * difference between the sum of two numbers and the product of two numbers.
 * 
 * Input Format
 * 
 * two numbers from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * absolute difference
 * 
 * Sample Input 0
 * 
 * 35 67 Sample Output 0
 * 
 * 2243 Sample Input 1
 * 
 * 37 66 Sample Output 1
 * 
 * 2339 Sample Input 2
 * 
 * 74 99 Sample Output 2
 * 
 * 7153
 */