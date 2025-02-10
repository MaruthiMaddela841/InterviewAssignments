package in.ineuron.hard;

import java.util.Scanner;

public class LBP296 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        for(int i=1;i<=num;i++){
	            if(i%5==0 || i%7==0)
	                System.out.print(i+" ");
	        }

	}

}
/*Implement a program to print the list of integers which are divisible by 5 or 7.

Input Format

a number from the user

Constraints

no

Output Format

seq of int values which are divisible by 5 or 7

Sample Input 0

10
Sample Output 0

5 7 10
Sample Input 1

15
Sample Output 1

5 7 10 14 15
*/