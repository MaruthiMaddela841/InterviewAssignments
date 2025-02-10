package in.ineuron.hard;

import java.util.Scanner;

public class LBP283 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		// DecimalFormat df=new DecimalFormat("0.00");
		// System.out.println(df.format(sum/arr.length));
		double rounded = Math.round((sum / arr.length) * 100.00) / 100.00;
		System.out.println(String.format("%.2f", rounded));

	}

}
/*
 * Implement a function that takes an array of numbers and returns the mean
 * (average) of all those numbers.
 * 
 * Input Format
 * 
 * an array size and elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * print mean value and round to two decimal places.
 * 
 * Sample Input 0
 * 
 * 6 5 3 6 7 5 3 Sample Output 0
 * 
 * 4.83 Sample Input 1
 * 
 * 5 1 2 3 4 6 Sample Output 1
 * 
 * 3.20
 */