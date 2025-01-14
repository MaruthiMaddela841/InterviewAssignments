package in.ineuron.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSubString {

	public static void main(String[] args) {
		
		String str="maruthi";
		String check="ra";
		int j=0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==check.charAt(j)) {
				j++;
				count++;
				if(count==check.length()) {
					break;
				}
			}
			else {
				if(count>0) {
					count=0;
				}
			}
		}
		if(count==check.length()) {
			System.out.println("SubString");
		}
		else {
			System.out.println("Not a Substring");
		}
		
		if (str.contains(check)) {
		    System.out.println("Substring");
		} else {
		    System.out.println("Not a Substring");
		}
		
		if (str.indexOf(check) != -1) {
		    System.out.println("Substring");
		} else {
		    System.out.println("Not a Substring");
		}
		
		boolean isSubstring = str.chars()
			    .anyMatch(i -> str.substring(i).startsWith(check));

			if (isSubstring) {
			    System.out.println("Substring");
			} else {
			    System.out.println("Not a Substring");
			}
			
			Pattern pattern = Pattern.compile(check);
			Matcher matcher = pattern.matcher(str);

			if (matcher.find()) {
			    System.out.println("Substring");
			} else {
			    System.out.println("Not a Substring");
			}
			
			boolean isSubstring2 = false;
			for (int i = 0; i <= str.length() - check.length(); i++) {
			    if (str.substring(i, i + check.length()).equals(check)) {
			    	isSubstring2 = true;
			        break;
			    }
			}

			if (isSubstring2) {
			    System.out.println("Substring");
			} else {
			    System.out.println("Not a Substring");
			}

	}

}
