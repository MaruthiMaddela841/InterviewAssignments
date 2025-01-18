package in.ineuron.easy;

import java.util.Scanner;

public class LBP030 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s))
            System.out.println("valid");
        else
            System.out.println("invalid");

	}

}

/*
Given a string, determine if it is a Palindrome string or not. A String is Palindrome if it is equal to reverse of the original string.

Input Format

A String from the user

Constraints

Non-empty String

Output Format

Palindrome or not

Sample Input 0

abba
Sample Output 0

valid
Sample Input 1

abc
Sample Output 1

invalid
Sample Input 2

madam
Sample Output 2

valid
*/