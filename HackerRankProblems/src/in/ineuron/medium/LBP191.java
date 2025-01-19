package in.ineuron.medium;

import java.util.Scanner;

public class LBP191 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = num;
		while (res > 26) {
			int flag = 0;
			while (res != 0) {
				int temp = res;
				temp = temp % 10;
				flag += temp;
				res = res / 10;
			}
			res = flag;
		}
		char c = ((char) (res + 64));
		System.out.println(c);

	}

}
/*
 * In an online exam, the test paper set is categorized by the letters A-Z. The
 * students enrolled in the exam have been assigned a numeric value called
 * application ID. To assign the test set to the student, firstly the sum of all
 * digits in the application ID is calculated. If the sum is within the numeric
 * range 1-26 the corresponding alphanetic set code is assigned to the student,
 * else the sum of the digits are calcualted again and so on unitil the sum
 * falls within the 1-26 range.
 * 
 * Input Format
 * 
 * application id as int
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * set number
 * 
 * Sample Input 0
 * 
 * 123 Sample Output 0
 * 
 * F Sample Input 1
 * 
 * 786 Sample Output 1
 * 
 * U
 */