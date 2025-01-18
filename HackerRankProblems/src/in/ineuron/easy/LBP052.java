package in.ineuron.easy;

import java.util.Scanner;

public class LBP052 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        String s1=sc.nextLine();
	        String s2=sc.nextLine();
	        String s3=s1+s2+s2+s1;
	        System.out.println(s3);

	}

}
/*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

Input Format

two strings s1 and s2

Constraints

non-empty strings

Output Format

return expected string

Sample Input 0

Hi
Bye
Sample Output 0

HiByeByeHi
Sample Input 1

What
Up
Sample Output 1

WhatUpUpWhat
Sample Input 2

tea
coffee
Sample Output 2

teacoffeecoffeetea
Sample Input 3

x
y
Sample Output 3

xyyx
*/