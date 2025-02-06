package in.ineuron.hard;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LBP266 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean b = Pattern.matches("^[a-zA-Z_][a-zA-Z0-9_]*$", str);
		System.out.println(b);
	}

}
/*
 * Tom has joined a new company and he is assigned a program to code. But before
 * starting to code, he needs to know the coding standards. He need to make sure
 * that the variable name should meet the below standards, => contains only
 * english letter => and/or digits => and/or underscore (_) => should not start
 * with digits
 * 
 * The program should return True/False based on the above conditions
 * 
 * Input Format
 * 
 * a string from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * abc7 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * abc# Sample Output 1
 * 
 * false Sample Input 2
 * 
 * ab$c Sample Output 2
 * 
 * false
 */