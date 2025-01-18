package in.ineuron.easy;

import java.util.HashMap;
import java.util.Map;

public class LBP060 {

	public static void main(String[] args) {
		
		 String input3 = "aabbbccccddddd";
	        System.out.println(getMaxOccurringChar(input3));  // Output: d

	}
	    public static char getMaxOccurringChar(String s) {
	        // Edge case: empty string
	        if (s == null || s.isEmpty()) {
	            throw new IllegalArgumentException("String cannot be empty");
	        }

	        // Map to store character frequencies
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        // Count character frequencies
	        for (char c : s.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }

	        // Find the maximum occurring character
	        char maxChar = s.charAt(0);
	        int maxCount = 0;

	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            char currentChar = entry.getKey();
	            int currentCount = entry.getValue();

	            if (currentCount > maxCount) {
	                maxChar = currentChar;
	                maxCount = currentCount;
	            }
	        }

	        return maxChar;
	    }

}
/*Given s string, implement a program to find max occurring character in the given string.

Input Format

A string

Constraints

No

Output Format

max occuuring character

Sample Input 0

welcome
Sample Output 0

e
Sample Input 1

java
Sample Output 1

a
Sample Input 2

aabbbccccddddd
Sample Output 2

d
*/