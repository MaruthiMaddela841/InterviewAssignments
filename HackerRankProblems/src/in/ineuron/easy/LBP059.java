package in.ineuron.easy;

import java.util.Scanner;

public class LBP059 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int count=0;
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                if(s2.contains(Character.toString(s1.charAt(i)))){
                    count+=1;
                }
            }
        }
        if(count==s1.length()){
            System.out.println("true");
            
        }
        else
            System.out.println("false");

	}

}
/*Two Strings a and b are called anagrams, if they contain all the same characters in the same frequencies

Input Format

Two Strings

Constraints

No

Output Format

true or false

Sample Input 0

anagram
margana
Sample Output 0

true
Sample Input 1

python
java
Sample Output 1

false
*/