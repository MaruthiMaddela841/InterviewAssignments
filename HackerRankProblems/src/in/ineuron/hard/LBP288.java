package in.ineuron.hard;

import java.util.Scanner;

public class LBP288 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.contains("a"))
			System.out.println(true);
		else
			System.out.println(false);

	}

}
/*
 * Write a program to check whether a string not having alphabet 'a'?
 * 
 * Input Format
 * 
 * string from the user
 * 
 * Constraints
 * 
 * con
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * apple Sample Output 0
 * 
 * true Sample Input 1
 * 
 * demo Sample Output 1
 * 
 * false
 */