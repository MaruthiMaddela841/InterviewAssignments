package in.ineuron.easy;

import java.util.Scanner;

public class LBP089 {

	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
	        String s1=sc.nextLine();
	        char[] c1=s1.toCharArray();
	        String s2=sc.nextLine();
	        int iterator=0;
	        int count=0;
	        if(s1.equals(s2))
	            System.out.println("true");
	        else{
	        while(iterator<=s1.length()){
	            String teststr="";
	            char test=c1[0];
	            for(int i=0;i<c1.length-1;i++){
	                c1[i]=c1[i+1];
	            }
	            c1[c1.length-1]=test;
	            for(char ch:c1){
	                teststr=teststr+Character.toString(ch);
	            }
	            if(teststr.equals(s2)){
	                count+=1;
	            }
	            iterator++;
	        }
	          if(count>=1) 
	              System.out.println("true");
	          else
	              System.out.println("false");
	        }

	}

}
/*Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s. A shift on s consists of moving the leftmost character of s to the rightmost position. For example, if s = "abcde", then it will be "bcdea" after one shift.

Input Format

string s1 and s2 from the user

Constraints

non empty string

Output Format

true or false

Sample Input 0

abcde
bcdea
Sample Output 0

true
Sample Input 1

kpb
psk
Sample Output 1

false
Sample Input 2

xyz
yzx
Sample Output 2

true
Sample Input 3

nayan
abcde
Sample Output 3

false
*/