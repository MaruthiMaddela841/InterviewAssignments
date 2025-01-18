package in.ineuron.easy;

public class LBP053 {

	public static void main(String[] args) {

		String s = "code";
		int[] indices = { 3, 0, 1, 2 };

		// Output the shuffled string
		System.out.println(restoreString(s, indices)); // Output: "edoc"

	}

	public static String restoreString(String s, int[] indices) {
		char[] shuffled = new char[s.length()];

		// Place each character in its new position
		for (int i = 0; i < s.length(); i++) {
			shuffled[indices[i]] = s.charAt(i);
		}

		// Convert the shuffled array to a string and return it
		return new String(shuffled);
	}

}
/*
 * Given a string s, and an integer array indices of the same length. The string
 * s will be shuffled such that the character at the ith position moves to
 * indices[i] in the shuffled string, return shuffled string.
 * 
 * Input Format
 * 
 * a string and an array
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * a string
 */