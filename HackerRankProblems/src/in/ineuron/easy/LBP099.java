package in.ineuron.easy;

import java.util.Scanner;

public class LBP099 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        for(int i=0;i<s.length;i++){
            String test=s[i];
            String res="";
            char c=test.charAt(0);
            c=Character.toUpperCase(c);
            
            for(int j=0;j<test.length();j++){
                if(j==0){
                    res=res+c;
                }
                else
                    res=res+Character.toString(test.charAt(j));
            }
            System.out.print(res+" ");
        }

	}

}
/*Implement a program to capitalize first letter of each word in a string.

Input Format

a string from the user

Constraints

non-empty string

Output Format

a string with capitalization

Sample Input 0

welcome to java
Sample Output 0

Welcome To Java
Sample Input 1

welcome to logic based programming
Sample Output 1

Welcome To Logic Based Programming
Sample Input 2

python programming by prakash sir
Sample Output 2

Python Programming By Prakash Sir
*/