package in.ineuron.easy;

import java.util.Scanner;

public class LBP086 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String vowels=sc.nextLine();
        char[] c=vowels.toCharArray();
        int k=0;
        String res="";
        for(int i=0;i<str.length();i++){
            String test=Character.toString(str.charAt(i));
            if(test.equals("*")){
                res=res+Character.toString(c[k]);
                k++;
            }
            else
                res=res+test;
        }
        System.out.println(res);

	}

}
/*Someone has attempted to censor my strings by replacing every vowel with a *, l*k* th*s. Luckily, I've been able to find the vowels that were removed.
Given a censored string and a string of the censored vowels, return the original uncensored string.

Input Format

censored string and removed vowels as string

Constraints

non-empty string

Output Format

updated string

Sample Input 0

w*lc*m*
eoe
Sample Output 0

welcome
Sample Input 1

Wh*r* d*d my v*w*ls g*?
eeioeo
Sample Output 1

Where did my vowels go?
Sample Input 2

*bcd*
ae
Sample Output 2

abcde
Sample Input 3

*PP*RC*S*
UEAE
Sample Output 3

UPPERCASE
*/