package in.ineuron.hard;

import java.util.Scanner;

public class LBP267 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num = num + 1;
		boolean b = true;
		while (b) {
			for (int i = 2; i < num; i++) {
				if ((i * i) == num) {
					System.out.println(num);
					b = false;
				}
			}
			num++;
		}

	}

}
/*
 * While sitting in party, Tom came up with an idea of a quiz. and the quiz is,
 * Tom will spell out a number, and a person has to tell a number which is next
 * to it. But this number has to be perfect square.
 * 
 * Input Format
 * 
 * a number from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * the perfect square after N
 * 
 * Sample Input 0
 * 
 * 5 Sample Output 0
 * 
 * 9 Sample Input 1
 * 
 * 7 Sample Output 1
 * 
 * 9 Sample Input 2
 * 
 * 2 Sample Output 2
 * 
 * 4
 */