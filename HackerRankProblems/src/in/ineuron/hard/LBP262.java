package in.ineuron.hard;

import java.util.Scanner;

public class LBP262 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num * num * num;
		boolean b = true;
		while (num > 0) {
			int flag1 = num % 10;
			int flag2 = temp % 10;
			num = num / 10;
			temp = temp / 10;
			if (flag1 != flag2) {
				b = false;
				break;
			}
		}
		System.out.println(b);

	}

}
/*
 * Dennis was solving a puzle. the puzzle was to verify a number whose cube ends
 * with the number itself. Help Dennis to find the solution of the puzzle and
 * write the code accordingly.
 * 
 * Input Format
 * 
 * integer value to verified
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * boolean value True or False
 * 
 * Sample Input 0
 * 
 * 3 Sample Output 0
 * 
 * false Sample Input 1
 * 
 * 4 Sample Output 1
 * 
 * true
 */