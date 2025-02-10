package in.ineuron.hard;

import java.util.Scanner;

public class LBP299 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        char[] c=sc.next().toCharArray();
	        int sum=0;
	        for(int i=0;i<c.length;i++){
	            sum=sum+c[i];
	        }
	        if(sum%2==0)
	            System.out.println(true);
	        else
	            System.out.println(false);

	}

}
/*Write a program to find whether the given string is lucky or not, A string is said to be lucky if the sum of ascii values of the characters in the string is even.

Input Format

a string

Constraints

non empty string

Output Format

true or false

Sample Input 0

abc
Sample Output 0

true
Sample Input 1

anitha
Sample Output 1

false
Sample Input 2

technology
Sample Output 2

true
*/