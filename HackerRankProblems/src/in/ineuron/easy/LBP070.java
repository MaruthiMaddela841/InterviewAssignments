package in.ineuron.easy;

import java.util.Scanner;

public class LBP070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}

}
/*
 * Create a function that takes a string as input and returns a string with
 * spaces in between all of the characters.
 * 
 * Input Format
 * 
 * A string from the user
 * 
 * Constraints
 * 
 * No
 * 
 * Output Format
 * 
 * A space seperated string
 * 
 * Sample Input 0
 * 
 * abc Sample Output 0
 * 
 * a b c Sample Input 1
 * 
 * space Sample Output 1
 * 
 * s p a c e Sample Input 2
 * 
 * kpb Sample Output 2
 * 
 * k p b
 */