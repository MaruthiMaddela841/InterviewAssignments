package in.ineuron.easy;

import java.util.Scanner;

public class LBP065 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char[] c=str.toCharArray();
        int cycle=1;
        while(cycle<=2){
            for(int i=0;i<2;i++){
                System.out.print(c[i]);
            }
            System.out.print("...");
            cycle++;
        }
        System.out.print(str+"?");

	}

}
/*write a function that shutters a word as if someone is struggling to read it. The first two letters are repeated twice with an ellipsis ... , and then the word is pronounced with a question mark?

Input Format

a string

Constraints

no

Output Format

xx... xx... ~~~~~~~?

Sample Input 0

incredible
Sample Output 0

in...in...incredible?
Sample Input 1

abc
Sample Output 1

ab...ab...abc?
*/