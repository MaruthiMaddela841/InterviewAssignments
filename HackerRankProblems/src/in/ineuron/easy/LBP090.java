package in.ineuron.easy;

import java.util.Scanner;

public class LBP090 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        String str= sc.nextLine();
	        if(str.length()>0){
	            for(int i=97;i<=122;i++){
	                char c=(char)i;
	                if(str.contains(Character.toString(c))){
	                    continue;
	                }
	                else
	                    System.out.print(c);
	            }
	        }

	}

}
/*Given a string containing unique letters, return a sorted string with the letters that don't appear in the string.

Input Format

A string from the user

Constraints

non empty string

Output Format

return missing characters in the given string

Sample Input 0

abcdefgpqrstuvwxyz
Sample Output 0

hijklmno
Sample Input 1

zyxwvutsrq
Sample Output 1

abcdefghijklmnop
Sample Input 2

abc
Sample Output 2

defghijklmnopqrstuvwxyz
Sample Input 3

abcdefhijklmnopqrstuvwxyz
Sample Output 3

g
*/