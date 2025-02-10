package in.ineuron.hard;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LBP282 {
	
	  private static int sumOfSquares(int num) {
	        return String.valueOf(num)
	                .chars() // Convert number to stream of digits
	                .map(Character::getNumericValue) // Convert char to integer
	                .map(d -> d * d) // Square each digit
	                .sum(); // Sum up the squares
	    }

	public static boolean isHappy(int num) {
		Set<Integer> seenNumbers = new HashSet<>();

		while (num != 1 && seenNumbers.add(num)) { // Loop until num becomes 1 or repeats
			num = sumOfSquares(num);
		}
		return num == 1;
	}

	  public static boolean isHappy2(int num, Set<Integer> seenNumbers) {
	        if (num == 1) return true;
	        if (!seenNumbers.add(num)) return false; // Cycle detected

	        int nextNum = sumOfSquares2(num);
	        return isHappy2(nextNum, seenNumbers);
	    }

	    private static int sumOfSquares2(int num) {
	        return num == 0 ? 0 : (num % 10) * (num % 10) + sumOfSquares2(num / 10);
	    }
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isHappy(num));
		System.out.println(isHappy2(num, new HashSet<>()));
		int sum = 0;
		boolean b = true;
		while (b) {
			while (num > 0) {
				int temp = num % 10;
				sum = sum + (temp * temp);
				num = num / 10;
			}
			if (sum < 10) {
				b = false;
			}
			num = sum;
			sum = 0;
		}

		if (num == 1) {
			System.out.println(true);
		} else if (num == 4) {
			System.out.println(false);
		}

	}

}
/*
 * The happy number can be defined as a number which will yield 1 when it is
 * replaced by the sum of the square of its digits repeatedly. If this process
 * results in an endless cycle of numbers containing 4, then the number is
 * called an unhappy number. Write a program that accepts a number and
 * determines whether the number is a happy number or not. Return true if so,
 * false otherwise.
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
 * true or false
 * 
 * Sample Input 0
 * 
 * 32 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * 16 Sample Output 1
 * 
 * false
 */