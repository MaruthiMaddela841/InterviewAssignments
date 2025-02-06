package in.ineuron.hard;

import java.util.Scanner;

public class LBP264 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int res=1;
        for(int i=1;i<=n2;i++){
            res=res*n1;
        }
        System.out.println(res%10);

	}

}
/*In a mathematics class, the students are beign taught power function. So "a" raised to the power of "b" is shown as a^b and the calculatation goes as a*a*a...b times. Now there is slight twist to the problem, the students have to find out the last digit of the resultant a^b.

Input Format

an integer value as base and power

Constraints

no

Output Format

last digit of a^b

Sample Input 0

2 3
Sample Output 0

8
Sample Input 1

10 2
Sample Output 1

0
Sample Input 2

12 2
Sample Output 2

4
*/