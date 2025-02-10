package in.ineuron.hard;

import java.util.Scanner;

public class LBP285 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		for (int i = c + 1; i < c + 6; i++) {
			System.out.print((char) i + " ");
		}

	}

}
/*
 * Implement a program to display next 5 characters after input character.
 * 
 * Input Format
 * 
 * a character from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * next 5 characters exluding input
 * 
 * Sample Input 0
 * 
 * a Sample Output 0
 * 
 * b c d e f Sample Input 1
 * 
 * m Sample Output 1
 * 
 * n o p q r
 */