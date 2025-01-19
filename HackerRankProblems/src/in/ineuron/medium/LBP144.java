package in.ineuron.medium;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LBP144 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		double sum = 0;
		for (int i = 0; i < c.length; i++) {
			char ch = c[i];
			int num = (int) ch;
			num = num - 96;
			sum = sum + num;
		}
		double res = (sum / c.length);
		// double roundOff = Math.round(res * 100.0) / 100.0;
		// System.out.println(roundOff);
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println(f.format(res));

	}

}
/*
 * Create a function that returns the average of an array composed of letters.
 * First, find the number of the letter in the alphabet in order to find the
 * average of the array. A = 1 B = 2 C = 3 D = 4 E = 5 average = total sum of
 * all numbers / number of item in the set Return the result rounded to two
 * decimal points.
 * 
 * Input Format
 * 
 * an array as string
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * Return the result rounded to two decimal points.
 * 
 * Sample Input 0
 * 
 * myworld Sample Output 0
 * 
 * 15.71 Sample Input 1
 * 
 * youarethebest Sample Output 1
 * 
 * 12.62 Sample Input 2
 * 
 * prakash Sample Output 2
 * 
 * 10.57
 */