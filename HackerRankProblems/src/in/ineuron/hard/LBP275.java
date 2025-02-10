package in.ineuron.hard;

import java.util.Scanner;

public class LBP275 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuffer str = new StringBuffer("");
		while (num > 0) {
			int temp = num % 10;
			if (temp % 2 == 0) {
				temp = temp + 1;
			} else {
				temp = temp - 1;
			}
			str.append(temp);
			num = num / 10;
		}
		System.out.println(str.reverse());

	}

}
/*
 * The country visa center generates the token number for its applicants from
 * their application ID. the application ID is numberic value. The token number
 * is generated in a specific form. the even digits in the applicant's ID are
 * replaced by the digit one greater than the even digitand the odd digits in
 * the applicant's ID are replaced by the digit one lesser than the odd digit.
 * The numeric calue thus generated represents the token number of applicant.
 * 
 * Write an algorithm togenerate the token number from the applicant ID.
 * 
 * Input Format
 * 
 * application ID
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * token id
 * 
 * Sample Input 0
 * 
 * 235 Sample Output 0
 * 
 * 324 Sample Input 1
 * 
 * 417 Sample Output 1
 * 
 * 506
 */