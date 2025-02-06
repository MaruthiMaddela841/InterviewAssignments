package in.ineuron.hard;

import java.util.Scanner;

public class LBP261 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int count = Integer.bitCount(n);
	        System.out.println(count);
	        
	        
	        count = 0;
	        while (n > 0) {
	            count += n & 1; // Check if last bit is 1
	            n >>= 1; // Right shift
	        }

	        System.out.println(count);
	        scanner.close();

	}

}
/*
 * Jack was in 9th standard. He appeared for a speed maths competivie exam. Jack
 * is taking longer time to solve one of the problems. Count the number of 1's
 * in the binary representation of an integer. Help him to solve the below
 * problem and write a code for the same.
 * 
 * Input Format
 * 
 * an integer value
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * an int value
 * 
 * Sample Input 0
 * 
 * 5 Sample Output 0
 * 
 * 2 Sample Input 1
 * 
 * 8 Sample Output 1
 * 
 * 1 Sample Input 2
 * 
 * 11 Sample Output 2
 * 
 * 3
 */