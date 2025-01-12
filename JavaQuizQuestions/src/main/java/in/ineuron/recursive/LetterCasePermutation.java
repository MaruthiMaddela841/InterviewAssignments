package in.ineuron.recursive;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
	
	public static void main(String[] args) {
        String input = "a1b2c3";
        List<String> result = new ArrayList<>();
        generatePermutations(input, 0, "", result);

        System.out.println("Input: " + input);
        System.out.println("Permutations:");
        for (String permutation : result) {
            System.out.println(permutation);
        }
    }
	private static void generatePermutations(String str, int index, String current, List<String> result) {
        if(index==str.length()) {
        	result.add(current);
        	return;
        }
        char c=str.charAt(index);
        if(Character.isAlphabetic(c)) {
        	generatePermutations(str,index+1,current+Character.toUpperCase(c),result);
        	generatePermutations(str,index+1,current+Character.toLowerCase(c),result);
        }
        else {
        	generatePermutations(str,index+1,current+c,result);
        }
    }
}
