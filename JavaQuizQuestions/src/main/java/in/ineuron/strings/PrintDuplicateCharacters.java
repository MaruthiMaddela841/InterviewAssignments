package in.ineuron.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateCharacters {

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
			if(map.get(c)>1) {
				System.out.print(c+" ");
			}
		}
		
		// Stream approach
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Filter and print duplicates
        charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.print(entry.getKey() + " "));
        
     // Using flatMap and Set
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicates = str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> !unique.add(ch))
                .collect(Collectors.toSet());

        // Print duplicates
        duplicates.forEach(ch -> System.out.print(ch + " "));
        
        
	}

}
