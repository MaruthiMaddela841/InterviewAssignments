package in.ineuron.easy;

import java.util.Scanner;

public class LBP095 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
	        String[] s=str.split(" ");
	        for(int i=0;i<s.length;i++){
	            String ct=s[i];
	            char c=ct.charAt(0);
	            System.out.print(c);
	        }

	}

}
/*Implement a function/Method to return first character in each word from the given input string.

Input Format

a string

Constraints

no

Output Format

first character in each string

Sample Input 0

welcome to java programming
Sample Output 0

wtjp
Sample Input 1

Hi hello every one
Sample Output 1

Hheo
*/