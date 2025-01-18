package in.ineuron.easy;

import java.util.Scanner;

public class LBP037 {

	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
	        String str=sc.nextLine();
	        int len=str.length();
	        if(str!=null){
	        for(int i=0;i<len;i++){
	            char c=str.charAt(i);
	            if(Character.isUpperCase(c)){
	                System.out.print(Character.toLowerCase(c));
	            }
	            else{
	                System.out.print(Character.toUpperCase(c));
	            }
	        }
	        }

	}

}

/*
Implement a program to calculate toggle case of each characters of a string

Input Format

A String from user

Constraints

non-empty String

Output Format

toggle case string

Sample Input 0

Hello
Sample Output 0

hELLO
Sample Input 1

tEsT
Sample Output 1

TeSt
Sample Input 2

Java
Sample Output 2

jAVA
*/