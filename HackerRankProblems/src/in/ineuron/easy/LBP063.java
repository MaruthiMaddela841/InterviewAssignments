package in.ineuron.easy;

import java.util.Scanner;

public class LBP063 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        String str=sc.nextLine();
	        String vowels="aeiouAEIOU";
	        int count=0;
	        for(int i=0;i<str.length();i++){
	            String s=Character.toString(str.charAt(i));
	            if(vowels.contains(s)){
	                count+=1;
	            }
	        }
	        System.out.println(count);

	}

}
/*Create a function that takes a string and returns the number of vowels contained within it.

Input Format

A string from the user

Constraints

no

Output Format

number of vowels

Sample Input 0

celebration
Sample Output 0

5
Sample Input 1

palm
Sample Output 1

1
*/