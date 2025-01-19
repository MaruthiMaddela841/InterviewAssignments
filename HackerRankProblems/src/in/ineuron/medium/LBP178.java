package in.ineuron.medium;

import java.util.Scanner;

public class LBP178 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w1 = sc.nextInt();
		int w2 = sc.nextInt();
		int w3 = sc.nextInt();
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();

		if (w1 + w2 <= l1 && w3 <= l2) {
			System.out.println("Yes");
		} else if (w2 + w3 <= l1 && w1 <= l2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
/*
 * amir is travelling to mumbai, but this time he is taking flight. His brother
 * has already told him about luggage weight limits but forgot it. Now he is
 * taking with him 3 trolly bags. As per the current airlines which amir will
 * fly. has below weight limits. There can be at max 2 check-in and 1 cabin
 * luggage. Check-in has total limit of L1 and Cabin has limit of L2. Now, amir
 * has 3 luggage has weights as W1 and W2 and W3 respectively. Now he should be
 * smart enough to make sure that he can travel with all the 3 luggage without
 * paying extra charge.
 * 
 * Find out whether amir can take all of his luggage without any extra charges
 * or not. If all good and no extra changes were paid, output "Yes" otherwise
 * "No".
 * 
 * Input Format
 * 
 * integers W1,W2,W3 and L1,L2
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * Yes or No
 * 
 * Sample Input 0
 * 
 * 1 2 3 1 2 Sample Output 0
 * 
 * No Sample Input 1
 * 
 * 6 9 7 16 7 Sample Output 1
 * 
 * Yes
 */