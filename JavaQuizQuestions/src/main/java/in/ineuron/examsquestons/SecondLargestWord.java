package in.ineuron.examsquestons;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestWord {

	public static void main(String[] args) {
		
		String input = "I am a good programmer";

        String[] words = input.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());

        if (words.length > 1) {
            System.out.println("The second largest word is: " + words[1]);
        } else {
            System.out.println("Not enough words to find the second largest.");
        }

	}

}
