package in.ineuron.easy;

import java.util.Scanner;

public class LBP079 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split(" ");
		String first = s[0];
		String last = s[s.length - 1];
		System.out.print(last + " ");
		for (int i = s.length - 2; i > 0; i--) {
			String test = s[i];
			String res = "";
			for (int j = test.length() - 1; j >= 0; j--) {
				res = res + Character.toString(test.charAt(j));
			}
			System.out.print(res + " ");
		}
		System.out.print(first);

	}

}
/*
 * Write a Java program to take an input string and exchange the first and last
 * word and reverse the middle word.
 * 
 * Input Format
 * 
 * a string
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * a string
 * 
 * Sample Input 0
 * 
 * Hello welcome to java Sample Output 0
 * 
 * java ot emoclew Hello Sample Input 1
 * 
 * java is very easy Sample Output 1
 * 
 * easy yrev si java
 */