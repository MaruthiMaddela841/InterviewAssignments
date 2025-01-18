package in.ineuron.easy;

import java.util.Scanner;

public class LBP032 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        int len=c.length;
        int count=0;
        for(int i=0;i<len;i++){
            if(!Character.isLetter(c[i]) && !Character.isDigit(c[i]) ){
                count++;
            }
        }
        System.out.println(count);
	}

}

/*
Program to count number of special characters and white spaces in a given string.

Input Format

A string from the user

Constraints

non-empty string

Output Format

number of special characters

Sample Input 0

wel123come@
Sample Output 0

1
Sample Input 1

abc@123#
Sample Output 1

2
*/