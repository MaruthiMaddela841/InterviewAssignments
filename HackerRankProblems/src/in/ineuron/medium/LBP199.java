package in.ineuron.medium;

import java.util.Scanner;

public class LBP199 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
                arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+(arr[i]/k);
        }
        System.out.println(sum);

	}

}
/*a game developing company has developed a math game for kids called "Brain Fun". The game is for smartphone users and the player is given list of N positive numbers and a random number K. the player need to divide all the numbers in the list with random number k and then need to add all the quotients received in each division. the sum of all the quotients is the score of the player.
Write an algorithm to generate the score of the player.

Input Format

array size, elements and random number k

Constraints

no

Output Format

an int value

Sample Input 0

5
1 2 3 4 5
3
Sample Output 0

3
Sample Input 1

5
7 3 2 10 4
5
Sample Output 1

3
*/