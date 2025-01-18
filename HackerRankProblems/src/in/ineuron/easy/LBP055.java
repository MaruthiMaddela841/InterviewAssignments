package in.ineuron.easy;

import java.util.Scanner;

public class LBP055 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int count=0;
        int c1length=c1.length-1;
        for(int i=c2.length-1;i>=0;i--){
            if(c2[i]==c1[c1length]){
                count+=1;
            }
            c1length--;
        }
        if(count==c2.length)
            System.out.println("true");
        else
            System.out.println("false");
///////////////////////////////////////////////////
        if(s1.endsWith(s2))
            System.out.println("true");
        else
            System.out.println("false");

	}

}
/*Create a function/method that takes two Strings and returns true of the first string ends with second string, otherwise return false

Input Format

two strings

Constraints

No

Output Format

true or false

Sample Input 0

abc
bc
Sample Output 0

true
Sample Input 1

abc
d
Sample Output 1

false
*/