package in.ineuron.easy;

import java.util.Scanner;

public class LBP097 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        String str=sc.nextLine();
	        String vowels="aeiouAEIOU";
	        int count=0;
	        for(int i=0;i<str.length();i++){
	            if(!vowels.contains(Character.toString(str.charAt(i)))){
	                count+=1;
	            }
	        }
	        System.out.println(count);

	}

}
/*Implement a program to return number of consonants present in the given string

Input Format

a string from the user

Constraints

non-empty string

Output Format

return number of consonants

Sample Input 0

welcome
Sample Output 0

4
Sample Input 1

abc
Sample Output 1

2
Sample Input 2

xyz
Sample Output 2

3
*/