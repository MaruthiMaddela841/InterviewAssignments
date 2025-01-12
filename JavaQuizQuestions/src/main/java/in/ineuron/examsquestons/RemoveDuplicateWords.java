package in.ineuron.examsquestons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String input = "god sees the sees people, season listens to gos, hello hello hello";

        // Split sentences by commas
        String[] sentences = input.split(",");

        HashSet<String> globalSeenWords = new HashSet<>(); // Tracks all seen words across sentences

        System.out.println("Processed Sentences:");

        for (String sentence : sentences) {
            String result = processSentence(sentence.trim(), globalSeenWords);
            System.out.println(result);
        }
    }

    // Method to process a sentence and remove global duplicates
    public static String processSentence(String sentence, HashSet<String> globalSeenWords) {
        String[] words = sentence.split(" ");
        LinkedHashSet<String> resultWords = new LinkedHashSet<>(); // Tracks unique words in the current sentence

        for (String word : words) {
            if (!globalSeenWords.contains(word)) {
                resultWords.add(word);      // Add word to the current sentence's result
                globalSeenWords.add(word); // Mark word as seen globally
            }
        }

        // If no words are added to the result, return "-1"
        if (resultWords.isEmpty()) {
            return "-1";
        }

        // Return the sentence with global duplicates removed
        return String.join(" ", resultWords);
	}

}
