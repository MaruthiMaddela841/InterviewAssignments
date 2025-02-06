package in.ineuron.hard;

import java.util.Scanner;

public class LBP258 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int sum=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                sum++;
            }
        }
        System.out.println(sum);
	}

}
/*To create a profile on a scocial media account "ThePastBook". The user needs to enter a string value in the form of user name. The username should consist of only characters tagged a-z. if the user enters an incorrect string containing digits the system automcatically identifiers the number of digits in the string and removes them.
Write an alogorithm to help the system identify the count of digits present in the username.

Input Format

A string from the user.

Constraints

no

Output Format

count of digits

Sample Input 0

a1b2c3
Sample Output 0

3
Sample Input 1

string
Sample Output 1

0
Sample Input 2

abc34
Sample Output 2

2
*/