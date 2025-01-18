package in.ineuron.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class AllAreUniqueCharacters {

	public static void main(String[] args) {
		
		String str="Shira";
		if(checkAllUnique(str,0,new HashMap<Character,Integer>())) {
			System.out.println("All Unique");
		}
		else {
			System.out.println("Not Unique");
		}
		
		 if (areAllUnique(str)) {
	            System.out.println("All Unique");
	        } else {
	            System.out.println("Not Unique");
	        }
		 
		  if (areAllUniqueArray(str)) {
	            System.out.println("All Unique");
	        } else {
	            System.out.println("Not Unique");
	        }
		  if (areAllUniqueStreams(str)) {
	            System.out.println("All Unique");
	        } else {
	            System.out.println("Not Unique");
	        }
	}
	
	 private static boolean areAllUniqueStreams(String str) {
	        return str.chars()
	                  .mapToObj(c -> (char) c)
	                  .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
	                  .values()
	                  .stream()
	                  .allMatch(count -> count == 1);
	    }
	
	 private static boolean areAllUniqueArray(String str) {
	        boolean[] charSet = new boolean[256]; // Assuming extended ASCII

	        for (char c : str.toCharArray()) {
	            if (charSet[c]) { // Duplicate found
	                return false;
	            }
	            charSet[c] = true;
	        }
	        return true; // No duplicates
	    }
	 
	private static boolean areAllUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) { // Duplicate found
                return false;
            }
            set.add(c);
        }
        return true; // No duplicates
    }

	private static boolean checkAllUnique(String str, int i, HashMap<Character, Integer> map) {
		if(i==str.length()) {
			for(char c:str.toCharArray()) {
				if(map.get(c)==0) {
					map.remove(c);
				}
			}
			return map.isEmpty();
		}
		if(map.containsKey(str.charAt(i))) {
			map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		else {
			map.put(str.charAt(i),0);
		}
		
		return checkAllUnique(str,i+1,map);
	}

}
