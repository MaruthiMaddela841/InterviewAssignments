package in.ineuron.hard;

import java.util.Scanner;

public class LBP255 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int org=num;
        int rev=0;
        while(num!=0){
            int temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        System.out.println(org-rev);

	}

}
/*In a game, organizers has given a number to the player. The player has to find out the differnece between the number and the reverse of the number. The difference between two numbers is the player's score. The number given to the player and the player's score can be a negative or positive number.
Write an algorithm to find the player's score.

Input Format

an integer

Constraints

no

Output Format

player's score

Sample Input 0

123
Sample Output 0

-198
Sample Input 1

721
Sample Output 1

594
*/