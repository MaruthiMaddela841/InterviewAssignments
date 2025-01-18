package in.ineuron.strings;

import java.util.stream.IntStream;

public class SubStrings {

	public static void main(String[] args) {
		
		String str="abcd";
//		System.out.println("Using Recursion::");
//		System.out.println(usingRecursion(str,0,0,new StringBuilder("")));
//		 printSubstrings(str, 0, "");
//		System.out.println("***************************");
//		for(int i=0;i<str.length();i++) {
//			StringBuilder s=new StringBuilder("");
//			for(int j=i;j<str.length();j++) {
//				s.append(str.charAt(j));
//				System.out.println(s);
//			}
//		}
		
		//**************************
		
//		for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j <= str.length(); j++) {
//                System.out.println(str.substring(i, j));
//            }
//        }
		 
		 IntStream.range(0, str.length()).forEach(i -> 
         IntStream.range(i + 1, str.length() + 1)
                  .forEach(j -> System.out.println(str.substring(i, j)))
     );

	}
	
	private static void printSubstrings(String str, int index, String current) {
        if (index == str.length()) {
            return;
        }

        for (int i = index; i < str.length(); i++) {
            current += str.charAt(i);
            System.out.println(current);
            printSubstrings(str, i + 1, "");
        }
    }

	private static String usingRecursion(String str, int length,int length2, StringBuilder string) {
		if(length==str.length()) {
			return string.toString();
		}
		else {
			string.append(str.charAt(length2));
			System.out.println(string);
			if(length2!=str.length()-1) {
				length2++;
			}
			else {
				length++;
				length2=length;
				string=new StringBuilder("");
			}
			return usingRecursion(str,length,length2,string);
		}
		
	}

}
