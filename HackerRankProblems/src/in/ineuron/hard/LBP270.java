package in.ineuron.hard;

import java.util.Scanner;

public class LBP270 {
	
	static boolean validateSentence(String str){
        if(str==null || str.isEmpty()){
            return false;
        }
        char firstChar=str.charAt(0);
        if(!Character.isUpperCase(firstChar))
            return false;
        char lastChar=str.charAt(str.length()-1);
        if(lastChar!='.')
            return false;
        return true;
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean isValid = validateSentence(str);
		System.out.println(isValid);
		//regex:"^[A-Z].*\\.$"
	}

}
/*
 * The teacher in a school has started to teach the very basics rule for a
 * sentence is that it should start with a capital letter and ends with a full
 * stop. If the sentence fails any of the above mentioned criteria, it will be
 * an incorrect sentence. Make a program to validate whether a given statement
 * is a correct sentence or not. The program should return True/False based on
 * the validity.
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
 * true or false
 * 
 * Sample Input 0
 * 
 * This is demo. Sample Output 0
 * 
 * true Sample Input 1
 * 
 * hello. Sample Output 1
 * 
 * false
 */