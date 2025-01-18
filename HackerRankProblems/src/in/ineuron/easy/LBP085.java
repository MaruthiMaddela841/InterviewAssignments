package in.ineuron.easy;

import java.util.Scanner;

public class LBP085 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String test="";
        for(int i=0;i<s1.length();i++){
            if(Character.toString(s1.charAt(i)).equals(s2)){
                continue;
            }
            else{
                test=test+Character.toString(s1.charAt(i));
            }
        }
        System.out.println(test);

	}

}
/*Fanny is given a string along with the string which contains single character x. She has to remove the character x from the given string. Help her write a program to remove all occurrences of x character from the given string.

Input Format

String and character from the user

Constraints

non-empty string

Output Format

Updated string

Sample Input 0

welcome
e
Sample Output 0

wlcom
Sample Input 1

prakash
a
Sample Output 1

prksh
Sample Input 2

java
a
Sample Output 2

jv
Sample Input 3

python
y
Sample Output 3

pthon
*/