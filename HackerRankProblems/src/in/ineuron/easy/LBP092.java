package in.ineuron.easy;

import java.util.Scanner;

public class LBP092 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char c=sc.next().charAt(0);
        String res="";
        int count=1;
        for(int i=0;i<str.length();i++){
            if(c==str.charAt(i)){
                String s=String.valueOf(count);
                res=res+count;
                    count++;
            }
            else{
                res=res+Character.toString(str.charAt(i));
            }
        }
        System.out.println(res);

	}

}
/*Implement a Program to replace a character with it's occurrence in given string.

Input Format

a string and a character from the user.

Constraints

non-empty string

Output Format

replaced string

Sample Input 0

test
t
Sample Output 0

1es2
Sample Input 1

prakash
a
Sample Output 1

pr1k2sh
*/