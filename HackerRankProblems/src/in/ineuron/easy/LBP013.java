package in.ineuron.easy;

import java.util.Scanner;

public class LBP013 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n>0){
            while(n>0){
                sum=sum+1;
                n=n/10;
            }
            System.out.println(sum);
        }

	}

}

/*
Implement a program to calculate number of digits in the given number

Input Format

a number from the user

Constraints

n>0

Output Format

print number of digits in the number

Sample Input 0

124
Sample Output 0

3
Sample Input 1

6789
Sample Output 1

4
*/