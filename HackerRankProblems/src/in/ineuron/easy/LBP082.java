package in.ineuron.easy;

import java.util.Scanner;

public class LBP082 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] c= str.toCharArray();
        for(int i=0;i<c.length;i++){
            int num=(int)c[i];
            num=num+1;
            char ch=(char)num;
            System.out.print(ch);
        }

	}

}
/*Write a function that changes every letter to the next letter:
"a" becomes "b"
"b" becomes "c"
"d" becomes "e"
and so on ...

note: there is no z's in test cases, be happy.

Input Format

a string from the user

Constraints

no

Output Format

modified string

Sample Input 0

hello
Sample Output 0

ifmmp
Sample Input 1

bye
Sample Output 1

czf
Sample Input 2

welcome
Sample Output 2

xfmdpnf
*/