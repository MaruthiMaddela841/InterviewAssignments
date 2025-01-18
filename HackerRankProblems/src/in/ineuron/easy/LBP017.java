package in.ineuron.easy;

import java.util.Scanner;

public class LBP017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp;
		temp = num;
		if (num > 0) {
			int res = 0;
			while (num != 0) {
				int r;
				r = num % 10;
				res = res * 10 + r;
				num = num / 10;
			}
			if (res == temp) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}

/*
 * Program to check whether the given number is paliandrome or not
 * 
 * Input Format
 * 
 * a number from the user
 * 
 * Constraints
 * 
 * n>0
 * 
 * Output Format
 * 
 * Yes or No
 * 
 * Sample Input 0
 * 
 * 123 Sample Output 0
 * 
 * No Sample Input 1
 * 
 * 121 Sample Output 1
 * 
 * Yes
 */