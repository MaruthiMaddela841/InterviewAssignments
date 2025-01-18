package in.ineuron.easy;

import java.util.Scanner;

public class LBP069 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String c = "aeiouAEIOU";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (c.contains(Character.toString(str.charAt(i)))) {
				continue;
			} else {
				res = res + Character.toString(str.charAt(i));
			}
		}
		System.out.println(res);

	}

}
/*
 * Create a function/method that takes a string as a argument and returns a new
 * string by removing all vowels from it
 * 
 * Input Format
 * 
 * a string from the user
 * 
 * Constraints
 * 
 * No
 * 
 * Output Format
 * 
 * A string
 * 
 * Sample Input 0
 * 
 * welcome Sample Output 0
 * 
 * wlcm Sample Input 1
 * 
 * demo Sample Output 1
 * 
 * dm
 */