package in.ineuron.medium;

import java.util.Scanner;

public class LBP197 {

	public static String checkBackspaces(String s1) {
		StringBuilder sb1 = new StringBuilder("");
		for (char c : s1.toCharArray()) {
			if (c == '#') {
				if (sb1.length() > 0) {
					sb1.deleteCharAt(sb1.length() - 1);
				}
			} else {
				sb1.append(c);
			}
		}
		return sb1.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		s1 = checkBackspaces(s1);
		s2 = checkBackspaces(s2);
		if (s1.equals(s2)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
/*
 * Two strings are said to the same if they are of the same length and have the
 * same character at each index. Backspacing in a string removes the previous
 * character in the string. Given two strings containing lowercase english
 * letters and the character '#' which represents a backspace key. determine if
 * the two final strings are equal or not. Return 1 if they are equal else 0.
 * 
 * Input Format
 * 
 * two strings s1 and s2
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * 1 or 0
 * 
 * Sample Input 0
 * 
 * axx#bb#c axbd#c#c Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * ayx#cb#c axbd#c#c Sample Output 1
 * 
 * 0
 */