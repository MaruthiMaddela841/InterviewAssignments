package in.ineuron.easy;

import java.util.Scanner;

public class LBP087 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String lb="(";
        String rb=")";
        int lcount=0;
        int rcount=0;
        for(int i=0;i<str.length();i++){
            if(Character.toString(str.charAt(i)).equals(lb)){
                lcount++;
            }
            else if(Character.toString(str.charAt(i)).equals(rb)){
                rcount++;
            }
            
        }
        if(lcount==rcount){
            System.out.println(0);
        }
        else if(lcount>rcount){
            System.out.println(lcount-rcount);
        }
        else{
             System.out.println(rcount-lcount);
        }

	}

}
/*Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid. Formally, a parentheses string is valid if and only if: It is the empty string, or It can be written as AB (A concatenated with B), where A and B are valid strings, or It can be written as (A), where A is a valid string. Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

Input Format

string from the user

Constraints

non-empty string

Output Format

minimum number of ( or ) required.

Sample Input 0

()
Sample Output 0

0
Sample Input 1

()(
Sample Output 1

1
*/