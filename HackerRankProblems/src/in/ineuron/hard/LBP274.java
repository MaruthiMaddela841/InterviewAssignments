package in.ineuron.hard;

import java.util.Scanner;

public class LBP274 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        int sum=0;
	        for(int i=n1;i<=n2;i++){
	            if(i%7==0){
	                sum=sum+i;
	            }
	        }
	        System.out.println(sum);

	}

}
/*Implement a program to find sum of all integers between two integer numbers taken as input and are divisible by 7.

Input Format

an integer value

Constraints

no

Output Format

sum value

Sample Input 0

1 7
Sample Output 0

7
Sample Input 1

1 25
Sample Output 1

42
*/