package in.ineuron.easy;

import java.util.Scanner;

public class LBP018 {

	public static int checkBirthday(String m, int d) {

		if (m.equals("july") && d == 5) {
			return 1;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {

		int res;
		Scanner sc = new Scanner(System.in);
		String month;
		month = sc.nextLine();
		int day;
		day = sc.nextInt();
		res = checkBirthday(month, day);
		System.out.println(res);

	}

}

/*
 * 
 * Lisa always forgets her birthday which is on th 5th July. So develop a
 * function/method which will be helpful to remember her birthday. The
 * function/method checkBirthday return an integer 1, if it is her birthday else
 * return 0. the function/method checkBirthday accepts two arguments.Month, a
 * string representing the month of her birth and day, an integer representing
 * the data of her birthday.
 * 
 * Input Format
 * 
 * month & day
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * 1 or 0
 * 
 * Sample Input 0
 * 
 * july 5 Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * june 5 Sample Output 1
 * 
 * 0
 */