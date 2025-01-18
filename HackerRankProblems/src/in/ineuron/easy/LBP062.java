package in.ineuron.easy;

import java.util.Scanner;

public class LBP062 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        if(str.contains("bomb") || str.contains("BOMB") || str.contains("Bomb")){
            System.out.println("DUCK!");
        }
        else
            System.out.println("Relax, there's no bomb.");

	}

}
/*Write a function that finds the word "bomb" in the given string (not case sensitive). Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".

Input Format

String

Constraints

No

Output Format

"DUCK!" or "Relax, there's no bomb.".

Sample Input 0

There is a bomb.
Sample Output 0

DUCK!
Sample Input 1

Hey, did you think there is a BOMB?
Sample Output 1

DUCK!
Sample Input 2

This goes boom!!!
Sample Output 2

Relax, there's no bomb.
*/