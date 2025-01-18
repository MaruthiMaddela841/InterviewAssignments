package in.ineuron.easy;

import java.util.Scanner;

public class LBP023 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        int num=sc.nextInt();
	        int temp=num;
	        if(num>=10 && num<=99){
	            int sum=0;
	            int mul=1;
	            while(num!=0){
	                int r=num%10;
	                sum=sum+r;
	                mul=mul*r;
	                num=num/10;
	            }
	            int res=sum+mul;
	            if(res==temp)
	                System.out.println("Yes");
	            else
	                System.out.println("No");
	        }

	}

}

/*
A special two digit number is a number such that when the sum of its digits is added to the product of its digits, the result should be equal to the original two-digit number.
Implement a program to accept a two digit number and check whether it is a special two digit number or not.

Input Format

a two digit number

Constraints

10<=n<=99

Output Format

Yes or No

Sample Input 0

59
Sample Output 0

Yes
Sample Input 1

69
Sample Output 1

Yes
Sample Input 2

11
Sample Output 2

No
*/