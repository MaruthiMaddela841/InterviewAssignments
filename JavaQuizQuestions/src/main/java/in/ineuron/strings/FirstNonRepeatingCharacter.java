package in.ineuron.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str="maruthimaddela";
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 0);
			}
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==0) {
				System.out.println(entry.getKey()+"::"+entry.getValue());
				break;
			}
		}
		
		 //Using Streams to find the first non-repeating character
	        Character result = str.chars()
	                .mapToObj(c -> (char) c) // Convert int stream to Character stream
	                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Group by character and count
	                .entrySet()
	                .stream()
	                .filter(entry -> entry.getValue() == 1) // Filter characters with count == 1
	                .map(Map.Entry::getKey) // Extract the character
	                .findFirst() // Get the first non-repeating character
	                .orElse(null); // Return null if no such character exists

	        if (result != null) {
	            System.out.println("First non-repeating character: " + result);
	        } else {
	            System.out.println("No non-repeating character found.");
	        }

	}

}
