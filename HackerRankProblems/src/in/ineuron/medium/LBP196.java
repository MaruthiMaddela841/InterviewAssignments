package in.ineuron.medium;

import java.util.Scanner;

public class LBP196 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int mod = sc.nextInt();

        // Power result
        double powerResult = Math.pow(base, exponent); // 2^5 = 32

        // Modulus result
        int modResult = Math.floorMod((int) powerResult, mod); // 32 % 3 = 2

        System.out.println(modResult);

	}

}
/*Given three numbers b,e, and m. fill in a function that takes these three positive integer values and outputs b^e mod m.

Input Format

b,e and m values

Constraints

no

Output Format

b^e mod m

Sample Input 0

2 1 2
Sample Output 0

0
Sample Input 1

3 2 2
Sample Output 1

1
*/