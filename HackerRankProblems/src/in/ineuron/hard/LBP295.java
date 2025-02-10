package in.ineuron.hard;

import java.util.Scanner;

public class LBP295 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.printf("%.2f%n", area); // Rounded to 2 decimal places
		sc.close();

	}

}
/*
 * Implement a program to find the area of the circle
 * 
 * Input Format
 * 
 * radius value
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * area of the circle (round to two decimals)
 * 
 * Sample Input 0
 * 
 * 12 Sample Output 0
 * 
 * 458.38 Sample Input 1
 * 
 * 1 Sample Output 1
 * 
 * 3.14
 */