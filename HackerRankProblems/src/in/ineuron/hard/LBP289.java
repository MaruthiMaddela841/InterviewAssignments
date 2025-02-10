package in.ineuron.hard;

import java.util.Scanner;

public class LBP289 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		while (num > 0) {
			int temp = num % 10;
			if (temp != k)
				count++;
			num = num / 10;
		}
		System.out.println(count);

	}

}
/*
 * The online math course provider 'MathAtTip' has designed a course for
 * children called Learning Number Recognition and Coutning. The assessment part
 * of the course has a question where the student is given a number and a digit.
 * The student needs to find out the total count of the digits present in the
 * number excluding the given digit.
 * 
 * Input Format
 * 
 * two space seperated int values
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * count of total digits excluding k
 * 
 * Sample Input 0
 * 
 * 12345 5 Sample Output 0
 * 
 * 4 Sample Input 1
 * 
 * 5644456 5 Sample Output 1
 * 
 * 5
 */