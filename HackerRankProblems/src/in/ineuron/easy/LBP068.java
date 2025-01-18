package in.ineuron.easy;

import java.util.Scanner;

public class LBP068 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		for (int i = 0; i < 3; i++) {
			int count = 0;
			char test;
			if (i == 0) {
				test = 'A';
			} else if (i == 1) {
				test = 'B';
			} else {
				test = 'C';
			}
			for (int j = 0; j < c.length; j++) {
				if (test == c[j])
					count++;
			}
			System.out.print(count + " ");
		}
		
		 // Test cases
        System.out.println(arrayToString(calculateScores("A")));    // Output: 1 0 0
        System.out.println(arrayToString(calculateScores("ABC")));  // Output: 1 1 1
        System.out.println(arrayToString(calculateScores("AABCC"))); // Output: 2 1 2

	}
	
	public static int[] calculateScores(String input) {
        // Initialize scores for Andy, Ben, and Charlotte
        int[] scores = {0, 0, 0};

        // Count scores based on characters
        for (char c : input.toCharArray()) {
            if (c == 'A') {
                scores[0]++;
            } else if (c == 'B') {
                scores[1]++;
            } else if (c == 'C') {
                scores[2]++;
            }
        }

        return scores;
    }
	
	 public static String arrayToString(int[] arr) {
	        StringBuilder result = new StringBuilder();
	        for (int num : arr) {
	            result.append(num).append(" ");
	        }
	        return result.toString().trim();
	    }

}
/*
 * Andy, Ben and Charlotte are playing a board game. the three of them decided
 * to come up with a new scoring system. A player's first initial ("A","B" and
 * "C") denotes that players scoring a signle point. Given a string of capital
 * letters. return an array of the player's score.
 * 
 * Input Format
 * 
 * A string from the user
 * 
 * Constraints
 * 
 * No
 * 
 * Output Format
 * 
 * Score
 * 
 * Sample Input 0
 * 
 * A Sample Output 0
 * 
 * 1 0 0 Sample Input 1
 * 
 * ABC Sample Output 1
 * 
 * 1 1 1
 */