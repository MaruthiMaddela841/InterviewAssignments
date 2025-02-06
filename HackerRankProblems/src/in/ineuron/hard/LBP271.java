package in.ineuron.hard;

import java.util.Scanner;

public class LBP271 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=0;
        int sum=0;
        while(num>0){
                int temp=num%10;
            int resnum=(int)(temp*Math.pow(2,pow));
            sum=sum+resnum;
                pow++;
            num=num/10;
        }
        System.out.println(sum);

	}

}
/*Geetha Singh is trying to create a system to convert binary number to its decimal eqivalent. Help her to automate the process.

Input Format

a binary value

Constraints

no

Output Format

decimal value

Sample Input 0

1101
Sample Output 0

13
Sample Input 1

1111
Sample Output 1

15
*/