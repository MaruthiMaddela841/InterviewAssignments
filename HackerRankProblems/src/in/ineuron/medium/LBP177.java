package in.ineuron.medium;
import java.util.*;

public class LBP177 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
//	        char[] ch=str.toCharArray();
//	        for(int i=0;i<ch.length;i++){
//	            boolean b3 = Pattern.matches("[A-Z0-9]",String.valueOf(ch[i]));
//	            if(b3){
//	                System.out.print(ch[i]);
//	            }
//	        }  
	        char[] ch = str.toCharArray();
	        
	        // Iterate through each character
	        for (int i = 0; i < ch.length; i++) {
	            // Check if character is a letter or digit
	            if (Character.isLetterOrDigit(ch[i])) {
	                System.out.print(ch[i]);
	            }
	        }

	}

}
/*
 * A spy wants to send some secret information to the government. As the data is
 * very important, he encrypts the message by encoding by adding some extra
 * characters. the original message has only upper case letters and numbers,
 * while the extra characters are madeup of lowercase letters and special
 * characters. Can you help the receiver in designing a program that accepts the
 * message and returns the secret information.
 * 
 * Input Format
 * 
 * a string from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * original message
 * 
 * Sample Input 0
 * 
 * Wel1c%OmE Sample Output 0
 * 
 * W1OE Sample Input 1
 * 
 * pRak123aSh Sample Output 1
 * 
 * R123S Sample Input 2
 * 
 * dEmO Sample Output 2
 * 
 * EO
 */