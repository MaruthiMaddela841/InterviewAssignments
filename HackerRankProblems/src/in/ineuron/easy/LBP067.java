package in.ineuron.easy;

import java.util.Scanner;

public class LBP067 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char[] c=str.toCharArray();
        int count=0;
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1])
                count+=1;
        }
        if(count>=1)
            System.out.println("true");
        else
            System.out.println("false");

	}

}
/*Create a function/method that takes, a word and returns true if the word has two consecutive identical letters.

Input Format

A string from the user

Constraints

No

Output Format

true or false

Sample Input 0

loop
Sample Output 0

true
Sample Input 1

yummy
Sample Output 1

true
Sample Input 2

orange
Sample Output 2

false
*/