package in.ineuron.hard;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LBP280 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.length() != 4) {
			System.out.println(false);
		} else if (str.contains(" "))
			System.out.println(false);
		else if (Pattern.matches("[0-9]{4}", str)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// boolean isValid = str.length() == 4 && str.matches("\\d{4}");

	}

}
/*
 * Implement a program that will test if a string is a valid PIN or not via a
 * regular expression. A valid PIN has:
 * 
 * Exactly 4 characters. Only numeric characters (0-9). No whitespace.
 * 
 * Input Format
 * 
 * an input from the user
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
 * 0511 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * 78945 Sample Output 1
 * 
 * false
 */