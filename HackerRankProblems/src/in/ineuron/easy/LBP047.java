package in.ineuron.easy;

import java.util.Scanner;

public class LBP047 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        int num= sc.nextInt();
	        int sum=0;
	        while(num!=0){
	            int r=num%10;
	            sum=sum+r;
	            num=num/10;
	        }
	        if(sum%2==0){
	            System.out.println("Evenish");
	        }
	        else
	            System.out.println("Oddish");

	}

}
/*
Create a function that determines whether a number is Oddish or Evenish. A number is Oddish if the sum of all of its digits is Odd, and number is Evenish if the sum of all of its digits is even, if a number is Oddish return Oddish else return Evenish.

Input Format

a number

Constraints

n>0

Output Format

Oddish or Evenish

Sample Input 0

43
Sample Output 0

Oddish
Sample Input 1

373
Sample Output 1

Oddish
Sample Input 2

4433
Sample Output 2

Evenish
*/