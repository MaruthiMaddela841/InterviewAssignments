package in.ineuron.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromGivenString {

	public static void main(String[] args) {
		
		String str="maruthimaddela";
		char[] arr=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		for(Character c:map.keySet()) {
			if(map.get(c)==1) {
				System.out.print(c+"");
			}
		}
		System.out.println();
		System.out.println("Using Recursive::"+removeSecondDuplicatesFromString(str,0,""));
		System.out.println("Using Recursive::"+removeDuplicates(str,0,new HashMap<Character, Integer>(), new StringBuilder("")));
		
		// Count character occurrences using Streams
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Filter out duplicates and collect unique characters
        String result = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> String.valueOf(entry.getKey()))
                .collect(Collectors.joining());

        System.out.println("Unique characters: " + result);
        
        //Can use Set Collection too
	}
	
	 private static String removeDuplicates(String str, int index, Map<Character, Integer> map, StringBuilder result) {
	        if (index == str.length()) {
	            return result.toString();
	        }

	        char currentChar = str.charAt(index);
	        map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

	        // Add character to result if it's the first occurrence
	        if (map.get(currentChar) == 1) {
	            result.append(currentChar);
	        }

	        return removeDuplicates(str, index + 1, map, result);
	    }

	private static String removeSecondDuplicatesFromString(String str, int i, String string) {
		if(i==str.length()) {
			return string;
		}
		if(!string.contains(String.valueOf(str.charAt(i)))){
			string+=str.charAt(i);
		}
		return removeSecondDuplicatesFromString(str,i+1,string);
		
	}

}
