package in.ineuron.recursive;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubsetsOfStringPermutation {

	public static void main(String[] args) {
		
		String str="abc";
		Set<String> result = new HashSet<>();
        generatePermutations(str, 0, "", result);

        System.out.println("Input: " + str);
        System.out.println("Permutations:");
        result.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

	}

	private static void generatePermutations(String str, int length, String string, Set<String> result) {
		if(length==str.length()) {
			result.add(string);
			return;
		}
		char c=str.charAt(length);
		generatePermutations(str,length+1,string+c,result);
		generatePermutations(str,length+1,string,result);
		generatePermutations(str,length+1,c+string,result);
	}

}
