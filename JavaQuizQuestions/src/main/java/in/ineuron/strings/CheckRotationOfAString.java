package in.ineuron.strings;

import java.util.stream.IntStream;

public class CheckRotationOfAString {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("xad");
		String check="dax";
		
		System.out.println(checkRotation(str,check,0));
		
		 if (isRotation(str.toString(), check)) {
	            System.out.println("Rotation");
	        } else {
	            System.out.println("Not a Rotation");
	        }
		 
		 if (isRotationUsingQueue(str.toString(), check)) {
	            System.out.println("Rotation");
	        } else {
	            System.out.println("Not a Rotation");
	        }
		 
		 if (isRotationUsingStreams(str.toString(), check)) {
	            System.out.println("Rotation");
	        } else {
	            System.out.println("Not a Rotation");
	        }
		 
		 if (isRotationRecursive(str.toString(), check, 0)) {
	            System.out.println("Rotation");
	        } else {
	            System.out.println("Not a Rotation");
	        }
	}

	private static boolean checkRotation(StringBuffer str, String check,int flag) {
		if(str.length()!=check.length() || flag>=str.length()-1) {
			return false;
		}
		else {
			char last=str.charAt(str.length()-1);
			str.insert(0, last);
			str.deleteCharAt(str.length() - 1);
			flag++;
			System.out.println("String::"+str);
			if(str.toString().equals(check)) {
				return true;
			}
			else {
				return checkRotation(str,check,flag);
			}
		}
		
	}
	
	private static boolean isRotation(String str, String check) {
        if (str.length() != check.length()) {
            return false;
        }
        String concatenated = str + str; // Concatenate the string with itself
        return concatenated.contains(check); // Check if the second string is a substring
    }
	
	 private static boolean isRotationUsingQueue(String str, String check) {
	        if (str.length() != check.length()) {
	            return false;
	        }

	        StringBuilder sb = new StringBuilder(str);
	        for (int i = 0; i < str.length(); i++) {
	            char last = sb.charAt(sb.length() - 1);
	            sb.insert(0, last);
	            sb.deleteCharAt(sb.length() - 1);
	            if (sb.toString().equals(check)) {
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 private static boolean isRotationUsingStreams(String str, String check) {
	        if (str.length() != check.length()) {
	            return false;
	        }

	        return IntStream.range(0, str.length())
	                .anyMatch(i -> (str.substring(i) + str.substring(0, i)).equals(check));
	    }
	 private static boolean isRotationRecursive(String str, String check, int rotations) {
	        if (str.length() != check.length() || rotations == str.length()) {
	            return false;
	        }

	        if (str.equals(check)) {
	            return true;
	        }

	        // Rotate the string
	        str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
	        return isRotationRecursive(str, check, rotations + 1);
	    }
}
