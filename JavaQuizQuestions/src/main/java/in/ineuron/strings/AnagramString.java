package in.ineuron.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramString {

	public static void main(String[] args) {
		
		String s1="agra";
		String s2="aags";
		
		if(s1.length()==s2.length()) {
			if(isAnagram(s1,s2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not an anagram");
			}
		}
		else {
			System.out.println("Not an anagram");
		}
		
		if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

	}

	private static boolean isAnagram(String s1,String s2) {
		int count=0;
		char[] c1=s1.toCharArray();
		Arrays.sort(c1);
		char[] c2=s2.toCharArray();
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
	
//	private static boolean areAnagrams(String str1, String str2) {
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//
//        int[] charCount = new int[26]; // Assuming lowercase English letters
//
//        for (int i = 0; i < str1.length(); i++) {
//            charCount[str1.charAt(i) - 'a']++;
//            charCount[str2.charAt(i) - 'a']--;
//        }
//
//        for (int count : charCount) {
//            if (count != 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
	
//    private static boolean areAnagrams(String str1, String str2) {
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//
//        return str1.chars()
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .equals(
//                        str2.chars()
//                                .boxed()
//                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                );
//    }

	  private static boolean areAnagrams(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        Map<Character, Integer> charCount = new HashMap<>();

	        for (char c : str1.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        for (char c : str2.toCharArray()) {
	            if (!charCount.containsKey(c)) {
	                return false;
	            }
	            charCount.put(c, charCount.get(c) - 1);
	            if (charCount.get(c) == 0) {
	                charCount.remove(c);
	            }
	        }

	        return charCount.isEmpty();
	    }
}
