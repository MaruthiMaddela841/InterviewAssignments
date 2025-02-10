package in.ineuron.hard;

import java.util.Scanner;

public class LBP276 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=num;
        int sum=0;
        while(num>0){
            int temp=num%10;
            sum=sum+temp;
            num=num/10;
        }
        int sqr=(int)Math.pow(sum,2);
        if(sqr==flag)
            System.out.println(true);
        else
            System.out.println(false);

	}

}
/*Rahul's teacher gave an assignment to all the student that when they show up tomorrow they should find a special type of number and report her. He thought very carefully and came up with an idea to have neon numbers. A neon number is a number where the square of the sum of each digit of the number results in the given number.Given an integer N, Write aprogramto find whether the number N is a Neon number. If it's not a Neon number, print the sqaure of the sum of digits of the number.

Input Format

a number

Constraints

no

Output Format

true or false

Sample Input 0

81
Sample Output 0

true
Sample Input 1

91
Sample Output 1

false
*/