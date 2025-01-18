package in.ineuron.easy;

import java.util.Scanner;

public class LBP088 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.length()>0){

        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
            int count1=0;
            int count2=0;
            int count3=0;
            for(int i=0;i<str.length();i++){
                if(s1.contains(Character.toString(str.charAt(i)))){
                    count1+=1;
                }
                else if(s2.contains(Character.toString(str.charAt(i)))){
                    count2+=1;
                }
                else if(s3.contains(Character.toString(str.charAt(i)))){
                    count3+=1;
                }
                
            }
            if(count1==str.length() || count2==str.length() || count3==str.length())
                System.out.println("true");
            else
                System.out.println("false");
        }

	}

}
/*Given a string, return the true if that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 In the American keyboard:
=> the first row consists of the characters "qwertyuiop",
=> the second row consists of the characters "asdfghjkl", and
=> the third row consists of the characters "zxcvbnm".

Note:
1. You may use one character in the keyboard more than once.
2. You may assume the input string will only contain letters of alphabet.

Input Format

A string from the user

Constraints

length of string >1

Output Format

true or false

Sample Input 0

mom
Sample Output 0

false
Sample Input 1

dad
Sample Output 1

true
Sample Input 2

love
Sample Output 2

false
Sample Input 3

false
Sample Output 3

false
*/