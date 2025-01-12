package in.ineuron.examsquestons;

public class ArrangeWords {

	public static void main(String[] args) {
		 String input = "wer77s, s99se, as44gd, h1, w34d, sgd99f";

	        // Split the input string into an array of words
	        String[] words = input.split(", ");

	        // Variables to track the largest number and its corresponding word
	        String largestWord = null;
	        int largestNumber = Integer.MIN_VALUE;

	        // Find the word with the largest number in it
	        for (String word : words) {
	            int number = extractNumber(word);
	            if (number > largestNumber) {
	                largestNumber = number;
	                largestWord = word;
	            }
	        }

	        // Create the output
	        StringBuilder result = new StringBuilder();
	        result.append(largestWord); // Add the largest word first

	        for (String word : words) {
	            if (!word.equals(largestWord)) { // Exclude the largest word
	                result.append(", ").append(word);
	            }
	        }

	        // Print the result
	        System.out.println("Output: " + result.toString());
	    }

	    // Method to extract the numeric part from a word
	    public static int extractNumber(String word) {
	        StringBuilder number = new StringBuilder();
	        for (char ch : word.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                number.append(ch);
	            }
	        }
	        return number.length() > 0 ? Integer.parseInt(number.toString()) : 0;

	}

}
