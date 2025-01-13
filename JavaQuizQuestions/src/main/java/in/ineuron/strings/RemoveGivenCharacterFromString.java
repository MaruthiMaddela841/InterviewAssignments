package in.ineuron.strings;

import java.util.regex.Pattern;

public class RemoveGivenCharacterFromString {

	public static void main(String[] args) {
		
		String str="maruthimaddela";
		char c='m';
		String op="";
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				continue;
			}
			else {
				op+=str.charAt(i);
			}
		}
		System.out.println("Using Iterative::"+op);
		System.out.println("Using Recursive::"+removeChar(str,c,0,new StringBuilder("")));
		System.out.println("Using Replace::"+removeCharUsingReplace(str,c));
		System.out.println("Using Streams::"+removeCharUsingStreams(str,c));
		System.out.println("Using Advanced Recursive::"+removeCharRecursive(str,c,0,new StringBuilder("")));
		System.out.println("Using Pattern::"+removeCharUsingRegex(str,c));
	}

	private static String removeChar(String str, char c, int length, StringBuilder string) {
		if(length>str.length()-1) {
			return string.toString();
		}
		else {
			if(str.charAt(length)!=c) {
				string.append(str.charAt(length));
				
			}
			return removeChar(str,c,length+1,string);
		}
		
	}
	
	private static String removeCharUsingReplace(String str, char c) {
	    return str.replace(String.valueOf(c), "");
	}
	
	private static String removeCharUsingStreams(String str, char c) {
	    return str.chars()
	              .filter(ch -> ch != c)
	              .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	              .toString();
	}

	private static String removeCharRecursive(String str, char c, int index, StringBuilder sb) {
	    if (index == str.length()) {
	        return sb.toString();
	    }
	    if (str.charAt(index) != c) {
	        sb.append(str.charAt(index));
	    }
	    return removeCharRecursive(str, c, index + 1, sb);
	}
	
	private static String removeCharUsingRegex(String str, char c) {
	    return Pattern.compile(String.valueOf(c)).matcher(str).replaceAll("");
	}

}
