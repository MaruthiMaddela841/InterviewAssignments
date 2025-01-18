package in.ineuron.easy;

import java.util.Scanner;

public class LBP078 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String test = "";
		for (int i = 0; i < str.length(); i++) {
			if (test.contains(Character.toString(str.charAt(i)))) {
				continue;
			} else
				test = test + Character.toString(str.charAt(i));
		}
		System.out.println(test);

	}

}
/*
 * Given a string S, the task is to remove all the duplicates in the given
 * string.
 * 
 * Input Format
 * 
 * a string from the user
 * 
 * Constraints
 * 
 * remove all duplicates
 * 
 * Output Format
 * 
 * a string without duplicates
 * 
 * Sample Input 0
 * 
 * hello Sample Output 0
 * 
 * helo Sample Input 1
 * 
 * welcome Sample Output 1
 * 
 * welcom
 */