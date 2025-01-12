package in.ineuron.strings;

/*
 * Write a function to perform basic string expansion 
 * e.g. a2b1c5a3 would become aabcccccaaa
 */

public class String_a2b1c5a3 {

	public static void main(String[] args) {
		String output="";
		String str="a2b4c5d2";
		if(str.length()<1) {
			System.out.println("Please provide valid string");
		}
		else if(str.length()==1) {
			System.out.println(str);
		}
		else {
			for(int i=0;i<str.length()-1;i=i+2) {
				char c=str.charAt(i);
				int count=Integer.parseInt(""+str.charAt(i+1));
				for(int j=0;j<count;j++) {
					output=output+c;
				}
			}
		}
		System.out.println(output);

	}

}
