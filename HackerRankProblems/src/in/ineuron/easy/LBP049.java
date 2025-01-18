package in.ineuron.easy;

import java.util.Scanner;

public class LBP049 {

	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
	        int num=sc.nextInt();
	        int j=0;
	        while(j==0){
	            int count=0;
	            for(int i=1;i<=num;i++){
	                if(num%i==0){
	                    count+=1;
	                }
	            }
	            if(count==2){
	                System.out.println(num);
	                break;
	            }
	            num=num+1;
	        }

	}

}
/*
Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

Input Format

a number

Constraints

no

Output Format

prime number

Sample Input 0

12
Sample Output 0

13
Sample Input 1

24
Sample Output 1

29
*/