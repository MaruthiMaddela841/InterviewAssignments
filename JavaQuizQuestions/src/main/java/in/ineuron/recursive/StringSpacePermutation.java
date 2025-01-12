package in.ineuron.recursive;

import java.util.ArrayList;
import java.util.List;

public class StringSpacePermutation {

	public static void main(String[] args) {
		
		String str="a b c d";
		List<String> result=new ArrayList<String>();
		spacePermutation(str,0,"",result);
		for(String s:result) {
			System.out.println(s);
		}

	}

	@SuppressWarnings("deprecation")
	private static void spacePermutation(String str, int length, String string, List<String> result) {
		if(length==str.length()) {
			result.add(string);
			return;
		}
		char c=str.charAt(length);
		if(Character.isWhitespace(c)) {
			spacePermutation(str,length+1,string+c,result);
			spacePermutation(str,length+1,string,result);
		}
		else {
			spacePermutation(str,length+1,string+c,result);
		}
	}

}
