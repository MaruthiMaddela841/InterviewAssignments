package in.ineuron.hard;

import java.util.Scanner;

public class LBP257 {
	
	public static int calculateScore(int n, int k) {
        if (k <= 0) return 0;
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += fib[i];
        }
        return sum;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n=k;
        int sum = calculateScore(n, k);
        System.out.println(sum);
        scanner.close();
	}

}
/*The games development company "FunGames" has developed a ballon shooter games. The ballons are arranged in a linear sequence and each ballon has a number associated with it. The numbers on the ballons are fibonacci series. In the game the player shoots 'k' ballons. The player's score is the sum of numbers on k ballons.
Write an algorithm to generate the player's score.

Input Format

an integer vlaue n

Constraints

no

Output Format

sum value

Sample Input 0

1
Sample Output 0

0
Sample Input 1

2
Sample Output 1

1
Sample Input 2

3
Sample Output 2

2
*/