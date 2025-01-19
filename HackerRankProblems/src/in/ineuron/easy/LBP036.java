package in.ineuron.easy;

import java.util.Scanner;

import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class LBP036 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int len=str.length();
        char res='\0';
        if(str!=null){
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
                res=c;
                break;
            }
        }
    }
        System.out.println(res);

	}

}
/*
Implement a program to return First capital letter in a String

Input Format

A string from the user

Constraints

non-empty string

Output Format

First Capital letter

Sample Input 0

Test
Sample Output 0

T
Sample Input 1

Hello
Sample Output 1

H
Sample Input 2

wElCoMe
Sample Output 2

E
*/