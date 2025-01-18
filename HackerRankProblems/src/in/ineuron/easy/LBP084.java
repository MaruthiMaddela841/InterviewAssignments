package in.ineuron.easy;

import java.util.Scanner;

public class LBP084 {

	static boolean isAlphabaticOrder(String s) {
		int n = s.length();

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) < s.charAt(i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        // check whether the string is
        // in alphabetical order or not
        if (isAlphabaticOrder(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}

}
/*
 * Implement a program that takes a string and returns true or false, depending
 * on whether the characters are in order or not.
 * 
 * Input Format
 * 
 * String from the user
 * 
 * Constraints
 * 
 * non-empty string
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * abc Sample Output 0
 * 
 * true Sample Input 1
 * 
 * prakash Sample Output 1
 * 
 * false Sample Input 2
 * 
 * 123 Sample Output 2
 * 
 * true
 */