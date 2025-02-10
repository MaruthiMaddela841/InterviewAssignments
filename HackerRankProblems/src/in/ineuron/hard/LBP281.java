package in.ineuron.hard;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LBP281 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double value = (double) num - (num * 0.07);
		double rounded = Math.round(value * 100.0) / 100.0;
		 DecimalFormat df = new DecimalFormat("#.##");
		// String formatted = df.format(value);
		System.out.println(rounded);

	}

}
/*
 * Implement a program that takes the memory size as an argument and returns the
 * actual memory size. Note: The actual storage loss on a USB device is 7% of
 * the overall memory size!
 * 
 * Input Format
 * 
 * memory size in GB
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * actual memory size, round your result to two decimal places.
 * 
 * Sample Input 0
 * 
 * 1 Sample Output 0
 * 
 * 0.93 Sample Input 1
 * 
 * 3 Sample Output 1
 * 
 * 2.79
 */