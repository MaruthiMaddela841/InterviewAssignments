package in.ineuron.easy;

import java.util.Scanner;

public class LBP040 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        int rev=0;
	        while(num!=0){
	            int r=num%10;
	            rev=rev*10+r;
	            num=num/10;
	        }
	        System.out.println(rev);

	}

}
/*
A company wishes to transmit data to another server. The data consists of numbers only. To secure the data during transmission, they plan to reverse the data during transmission, they plan to reverse the data first. **Write an algorithm to reverse the data first **

Input Format

an integer data, representing the data to be transmitted

Constraints

no

Output Format

print an integer representing the given data in reverse form

Sample Input 0

123
Sample Output 0

321
Sample Input 1

456789
Sample Output 1

987654
*/