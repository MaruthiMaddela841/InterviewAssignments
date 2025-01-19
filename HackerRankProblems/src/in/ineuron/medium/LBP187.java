package in.ineuron.medium;

import java.util.Scanner;

public class LBP187 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(str.charAt(str.length() - 1) + "," + str.charAt(str.length() - 2));

	}

}
/*
 * Given a string, create a new string made up of its last two letters, reversed
 * and seperated by comma.
 * 
 * Input Format
 * 
 * a string from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * comma seperated last and second-last character
 * 
 * Sample Input 0
 * 
 * demo Sample Output 0
 * 
 * o,m Sample Input 1
 * 
 * prakash Sample Output 1
 * 
 * h,s
 */