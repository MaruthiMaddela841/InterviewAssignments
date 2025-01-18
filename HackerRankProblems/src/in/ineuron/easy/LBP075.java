package in.ineuron.easy;

import java.util.Scanner;

public class LBP075 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String vowels="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if(vowels.contains(Character.toString(str.charAt(i)))){

            System.out.println(i);
                break;
            }
        }

	}

}
/*create a function that returns the index of first vowel in a string

Input Format

a string

Constraints

no

Output Format

an int value

Sample Input 0

apple
Sample Output 0

0
Sample Input 1

hello
Sample Output 1

1
*/