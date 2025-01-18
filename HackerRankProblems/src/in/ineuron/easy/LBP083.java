package in.ineuron.easy;

import java.util.Scanner;

public class LBP083 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		String s = "aeiouAEIOU";
		String test = "";
		for (int i = 0; i < str.length(); i++) {
			if (s.contains(Character.toString(str.charAt(i)))) {
				test = test + Character.toString(str.charAt(i));
			}
		}
		if (n <= test.length()) {
			for (int i = 0; i <= n - 1; i++) {
				System.out.print(test.charAt(i));
			}
		} else
			System.out.println("invalid");

	}

}
/*
 * Write a function that returns the first n vowels of a string.
 * 
 * Input Format
 * 
 * a string from the user and an integer value
 * 
 * Constraints
 * 
 * Return "invalid" if the n exceeds the number of vowels in a string.
 * 
 * Output Format
 * 
 * return first n vowels in the string
 * 
 * Sample Input 0
 * 
 * sharpening skills 3 Sample Output 0
 * 
 * aei Sample Input 1
 * 
 * major league 5 Sample Output 1
 * 
 * aoeau Sample Input 2
 * 
 * hostess 5 Sample Output 2
 * 
 * invalid
 */