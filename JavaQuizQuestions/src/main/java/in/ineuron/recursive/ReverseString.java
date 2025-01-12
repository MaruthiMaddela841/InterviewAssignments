package in.ineuron.recursive;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Maruthi";
		System.out.print("Using for::");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+"");
		}
		System.out.println();
		System.out.print("Using recursive::");
		reverseString(str,str.length());

	}

	private static void reverseString(String str, int length) {
	
		if(length>=1) {
			System.out.print(str.charAt(length-1));
			reverseString(str, length-1);
		}
		
	}

}
