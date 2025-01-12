package in.ineuron.recursive;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str="mrarm";
		String rev=reverseString(str,str.length(),"");
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	private static String reverseString(String str, int length, String string) {
		if(length==0) {
			return string;
		}
		string=string+str.charAt(length-1);
		return reverseString(str,length-1,string);
	}

}
