package in.ineuron.easy;

import java.util.Scanner;

public class LBP038 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (Character.isAlphabetic(c) || Character.isDigit(c) || c == ' ') {
				continue;
			} else {
				sum += 1;
			}
		}
		System.out.println(sum);

	}

}

/*
 * A company launched a new text editor that allows users to enter english
 * letters, numbers and white spaces only. If a user attempts to enter any other
 * type of characters, it is counted as miss. Given a String text, write an
 * algorithm to help the developer detect the number of misses by a given user
 * in the given input.
 * 
 * Input Format
 * 
 * String
 * 
 * Constraints
 * 
 * non-empty string
 * 
 * Output Format
 * 
 * number of misses
 * 
 * Sample Input 0
 * 
 * aa a234bc@ sa% hasgd^ Sample Output 0
 * 
 * 3 Sample Input 1
 * 
 * g@@d morning# Sample Output 1
 * 
 * 3
 */