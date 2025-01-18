package in.ineuron.easy;

import java.util.Scanner;

public class LBP057 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        String str=sc.nextLine();
	        char[] c=str.toCharArray();
	        for(int i=c.length-1;i>=0;i--){
	            System.out.print(c[i]);
	        }

	}

}
/*Create a function/method that takes a string as its argument and returns the string in reversed order.

Input Format

A string

Constraints

No

Output Format

reversed string

Sample Input 0

Hello Word
Sample Output 0

droW olleH
Sample Input 1

The quick brown fox
Sample Output 1

xof nworb kciuq ehT
Sample Input 2

Test Demo
Sample Output 2

omeD tseT
*/