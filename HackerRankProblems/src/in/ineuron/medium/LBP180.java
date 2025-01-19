package in.ineuron.medium;

import java.util.Scanner;

public class LBP180 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int bin=Integer.parseInt(Integer.toBinaryString(num));
        int count=0;
        while(bin!=0){
            int temp=bin;
            temp%=10;
            if(temp==1){
                count+=1;
            }
            bin/=10;
        }
        if(count%2==0){
            System.out.println("even");
        }
        else
            System.out.println("odd");

	}

}
/*Michael wants to check the parity of the given number. To find tha parity, follow below steps.
1. convert decimal number into binary number.
2. count the number of 1's and 0's in the binary representation.

if it contains odd number of 1-bits, then it is "odd parity" and if contains even number of 1-bits then "even parity" Write a program to validate the given number belongs to odd parity or even parity.

Input Format

a number from the user.

Constraints

no

Output Format

odd parity or even parity.

Sample Input 0

5
Sample Output 0

even
Sample Input 1

8
Sample Output 1

odd
Sample Input 2

7
Sample Output 2

odd
*/