package in.ineuron.hard;

import java.util.Scanner;
import java.util.stream.Collectors;

public class LBP259 {

	public static String swapConsonants(String str) {
		String vowels = "aeiouAEIOU"; // Define vowels
		StringBuilder result = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (vowels.indexOf(ch) != -1) {
				// If vowel, retain as is
				result.append(ch);
			} else {
				// If consonant, replace with next consonant
				result.append(getNextConsonant(ch));
			}
		}
		return result.toString();
	}

	public static char getNextConsonant(char ch) {
		if (!Character.isLetter(ch))
			return ch; // If not a letter, return as is

		char nextChar = (char) (ch + 1); // Get next character

		// If next character is a vowel, move further
		while ("aeiouAEIOU".indexOf(nextChar) != -1) {
			nextChar++;
		}

		// Wrap 'z' or 'Z' back to 'b' or 'B'
		if (ch == 'z')
			return 'b';
		if (ch == 'Z')
			return 'B';

		return nextChar;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Input string
		System.out.print("Enter the string: ");
		String input = scanner.nextLine();

		// Process and output the modified string
		String result = swapConsonants(input);
		String result2 = swapConsonants2(input);
		System.out.println("Updated string: " + result);

		scanner.close();

	}

	public static String swapConsonants2(String str) {
		return str.chars().mapToObj(c -> (char) c) // Convert int to char
				.map(in.ineuron.hard.LBP259::getNextConsonant2) // Apply transformation
				.map(String::valueOf) // Convert char to String
				.collect(Collectors.joining()); // Join characters to form final string
	}

	public static char getNextConsonant2(char ch) {
		String vowels = "aeiouAEIOU";
		if (vowels.indexOf(ch) != -1 || !Character.isLetter(ch))
			return ch; // If vowel or non-letter, return as is

		char nextChar = (char) (ch + 1);
		while (vowels.indexOf(nextChar) != -1) { // Skip vowels
			nextChar++;
		}

		// Wrap 'z' or 'Z' back to 'b' or 'B'
		if (ch == 'z')
			return 'b';
		if (ch == 'Z')
			return 'B';

		return nextChar;
	}

}
/*
 * Student of a school are assembled in a straight line for the morning prayer.
 * To uplift the sprit of the students, an exercise is conducted. THe initial
 * letter of all the student's names is noted down(str). The task here is to
 * substitute the intitial letters in the list with consonants such that if the
 * initial letter of the student is a vowel, retain the student in the same
 * position. If the initial letter of the student is a consonant, swap with the
 * next immediate consonants from the english alphabet sequence (a-z). Say,
 * initial letter of a student starts with b swap with c, next immediate
 * consonant. If the initial letter is 'z' swap with 'b'.
 * 
 * Input Format
 * 
 * a string from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * updated string
 * 
 * Sample Input 0
 * 
 * abc Sample Output 0
 * 
 * acd Sample Input 1
 * 
 * prakash Sample Output 1
 * 
 * qsalatj
 */