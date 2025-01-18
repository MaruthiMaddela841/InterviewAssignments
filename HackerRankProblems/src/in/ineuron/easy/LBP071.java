package in.ineuron.easy;

import java.util.Scanner;

public class LBP071 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String ch=sc.nextLine();
        String vowels="aeiouAEIOU";
        String res="";
        for(int i=0;i<str.length();i++){
            if(vowels.contains(Character.toString(str.charAt(i)))){
                res=res+ch;
            }
            else{
                res=res+Character.toString(str.charAt(i));
            }
        }
        System.out.println(res);

	}

}
/*Create a function that replaces all the vowels in a string with a specified character,

Input Format

A string from the user

Constraints

No

Output Format

A string

Sample Input 0

welcome
#
Sample Output 0

w#lc#m#
Sample Input 1

prakash
.
Sample Output 1

pr.k.sh
*/