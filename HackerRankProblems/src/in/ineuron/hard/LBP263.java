package in.ineuron.hard;

import java.util.Scanner;

public class LBP263 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int num=sc.nextInt();
        if(num>str.length()){
            System.out.println(-1);
        }
        else{
            System.out.println(str.charAt(num-1));
        }

	}

}
/*In a mathematics class, number system is being taught to students, before teaching them 10's and 100's place, they will be taught the number positions. The positions will be starting from sequence number 1 and the direction will be from left to right.
So if i want to find second position of a digit in the number 90876, it will be 0. if the kth digit exceeds the number position return -1.
write a program to find the kth digit in a given number.

Input Format

integer value and kth digit

Constraints

no

Output Format

no

Sample Input 0

90876
2
Sample Output 0

0
Sample Input 1

90876
3
Sample Output 1

8
Sample Input 2

90876
1
Sample Output 2

9
*/