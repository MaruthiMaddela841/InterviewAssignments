package in.ineuron.recursive;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubsetsOfStringPermutation {

	public static void main(String[] args) {
		
		String str="abcd";
		Set<String> result = new HashSet<>();
        generatePermutations(str, 0, "", result);

        System.out.println("Input: " + str);
        System.out.println("Permutations:");
        for (String permutation : result) {
            System.out.println(permutation);
        }

	}

	private static void generatePermutations(String str, int length, String string, Set<String> result) {
		if(length==str.length()) {
			result.add(string);
			return;
		}
		char c=str.charAt(length);
		generatePermutations(str,length+1,string+c,result);
		generatePermutations(str,length+1,string,result);
		
	}

}
