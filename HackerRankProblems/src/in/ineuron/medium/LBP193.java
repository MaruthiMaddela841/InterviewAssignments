package in.ineuron.medium;

import java.util.Scanner;

public class LBP193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num % 10 != 0) {
			num = num + 1;
		}
		System.out.println(num);

	}

}
/*
 * There was a grocery shop. Shopkeeper would like to keep trasactions as simple
 * as he can. Hence, he used to take money as whole number. To optimize
 * trasactions, he decided if someone buys groceries from his shop, he will
 * round money to the nearest whole number having zeros as last digit. Write a
 * program to help shopkeeper to make trasactions much simple.
 * 
 * Input Format
 * 
 * a number
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * nearest int value which ending with 0
 * 
 * Sample Input 0
 * 
 * 17 Sample Output 0
 * 
 * 20 Sample Input 1
 * 
 * 153 Sample Output 1
 * 
 * 160 Sample Input 2
 * 
 * 174 Sample Output 2
 * 
 * 180
 */