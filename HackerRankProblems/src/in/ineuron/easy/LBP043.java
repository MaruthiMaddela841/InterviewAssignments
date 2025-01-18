package in.ineuron.easy;

import java.util.Scanner;

public class LBP043 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        int num=sc.nextInt();
	        int esum=0;
	        int osum=0;
	        while(num!=0){
	            int r=num%10;
	            if(r%2==0){
	                esum+=r;
	            }
	            else{
	                osum+=r;
	            }
	            num=num/10;
	        }
	        System.out.println(esum*osum);
	        
	}

}
/*
An e-Commerce company plans to give thier customers a discount for the newyears holiday. The discount will be calcualted on the basis of the bill amount of the order place. The discount amount is the product of the sum of all odd digits and the sum of all even digits of the customers total bill amount.

Input Format

an integer bill amount, representing the total bill amount of the customer.

Constraints

no

Output Format

print an integer representing the discount amount for the given total bill.

Sample Input 0

2514795
Sample Output 0

162
Sample Input 1

12345
Sample Output 1

54
Sample Input 2

75385
Sample Output 2

160
*/