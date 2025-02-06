package in.ineuron.hard;

import java.util.Scanner;

public class LBP260 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num = num * i;
		}
		while (num > 0) {
			int temp = num % 10;
			if (temp == 0) {
				num = num / 10;
			} else {
				System.out.println(temp);
				break;
			}
		}

	}

}
/*
 * Mikes likes to play with numbers. His friends are also good with numbers and
 * often plays mathematical games. they made a small game where they will spell
 * the last digit of a factorial of a number other than 0. Let say the given
 * number is 5, so 5! will be 120, Here 0 is the last digit. But we dn't want 0,
 * we want a number other than 0. Then last digit is 2.
 * 
 * Input Format
 * 
 * an integer value
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * an integer vlaue
 * 
 * Sample Input 0
 * 
 * 1 Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * 2 Sample Output 1
 * 
 * 2
 */