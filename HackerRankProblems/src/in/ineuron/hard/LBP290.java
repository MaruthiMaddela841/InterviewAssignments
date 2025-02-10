package in.ineuron.hard;

import java.util.Scanner;

public class LBP290 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] > 0)
				sum++;
		}
		System.out.println(sum);

	}

}
/*
 * The e-commerce company "TodaysApparel" has a list of sales values of N days.
 * Some days the company made a profit, represented as a positive value. Other
 * days the company incurred a loss, represented as a negative sales value. The
 * company wishes to know the number of profitable days in the list. Write an
 * algorithm to help the company know the number of profitable days in the list.
 * 
 * Input Format
 * 
 * array size and elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * count number of +ve values
 * 
 * Sample Input 0
 * 
 * 7 23 -7 13 -34 56 43 -12 Sample Output 0
 * 
 * 4 Sample Input 1
 * 
 * 5 1 2 -3 4 5 Sample Output 1
 * 
 * 4
 */