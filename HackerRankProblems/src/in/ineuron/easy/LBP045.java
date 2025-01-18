package in.ineuron.easy;

import java.util.Scanner;

public class LBP045 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        int num=sc.nextInt();
	        int sum=0;
	        for(int i=1;i<num;i++){
	            if(num%i==0){
	             sum+=i;
	            }
	        }
	        if(sum==num){
	            System.out.println("true");
	        }
	        else{
	            System.out.println("false");
	        }

	}

}
/*
Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as sum of its factors. (equal to sum of its proper divisors) excluding the number itself.

Input Format

a number from the user

Constraints

n>0

Output Format

true or false

Sample Input 0

6
Sample Output 0

true
Sample Input 1

28
Sample Output 1

true
Sample Input 2

12
Sample Output 2

false
Sample Input 3

97
Sample Output 3

false
*/