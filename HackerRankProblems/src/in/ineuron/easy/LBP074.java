package in.ineuron.easy;

import java.util.Scanner;

public class LBP074 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        if(len==1 || len==2){
            System.out.println(str);
        }
        else if(len%2!=0){
            len=len/2;
            System.out.println(str.charAt(len));
        }
        else{
            len=len/2;
            System.out.print(str.charAt(len-1));
            System.out.print(str.charAt(len));
        }

	}

}
/*create a function that takes a string and returns, the middle character(s). if the word's length is odd return the midlle character. if the word's length is even, return the middle two characters.

Input Format

a string from the user

Constraints

no

Output Format

middle character(s)

Sample Input 0

test
Sample Output 0

es
Sample Input 1

testing
Sample Output 1

t
Sample Input 2

middle
Sample Output 2

dd
*/