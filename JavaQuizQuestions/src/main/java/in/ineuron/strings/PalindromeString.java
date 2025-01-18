package in.ineuron.strings;

import java.util.stream.IntStream;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "xamama";
		String rev = palindromeCheck(str, str.length() - 1, new StringBuilder(""));
		if (rev.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

		if (isPalindrome(str, 0, str.length() - 1)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
		
		String reversed = new StringBuilder(str).reverse().toString();
		if (reversed.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		
		if (isPalindromeStreams(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	private static String palindromeCheck(String str, int i, StringBuilder string) {
		if (i < 0) {
			return string.toString();
		}
		string.append(str.charAt(i));
		return palindromeCheck(str, i = i - 1, string);
	}

	private static boolean isPalindrome(String str, int start, int end) {
		if (start >= end) { // Base case: All characters checked
			return true;
		}
		if (str.charAt(start) != str.charAt(end)) { // Check mismatch
			return false;
		}
		return isPalindrome(str, start + 1, end - 1); // Recur for inner substring
	}
	
	 private static boolean isPalindromeStreams(String str) {
	        return IntStream.range(0, str.length() / 2)
	                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1)); // Compare pairs
	    }

}
