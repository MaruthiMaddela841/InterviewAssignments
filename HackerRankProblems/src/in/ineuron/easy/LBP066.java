package in.ineuron.easy;

import java.util.Scanner;

public class LBP066 {

	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
	        String str=sc.nextLine();
	        char[] c=str.toCharArray();
	        for(int i=0;i<c.length;i++){
	            System.out.print(c[i]);
	            System.out.print(c[i]);
	        }

	}

}
/*Create a function/method that takes a string and returns a string in which each character is repeated once

Input Format

A string from the user

Constraints

No

Output Format

String

Sample Input 0

string
Sample Output 0

ssttrriinngg
Sample Input 1

hello
Sample Output 1

hheelllloo
Sample Input 2

1234
Sample Output 2

11223344
*/