package in.ineuron.medium;

import java.util.Scanner;
//import java.util.regex.Pattern;

public class LBP194 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("");
		for (int i = 0; i < arr.length; i++) {
//			boolean b = Pattern.matches("[a-z]", arr[i]);
//			if (b) {
//				System.out.print(arr[i].toUpperCase() + "");
//			} else
//				System.out.print(arr[i].toLowerCase() + "");
		}

	}

}
/*
 * Prakash a technical person wants to update his password for every 15 days, to
 * create a new password, he is converting all lower case letters to upper case
 * and upper case letters to lower case, help prakash to update password.
 * 
 * Input Format
 * 
 * a string from the user old password
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * updated password
 * 
 * Sample Input 0
 * 
 * welCOME Sample Output 0
 * 
 * WELcome Sample Input 1
 * 
 * pRaKaSh Sample Output 1
 * 
 * PrAkAsH Sample Input 2
 * 
 * welcome Sample Output 2
 * 
 * WELCOME
 */