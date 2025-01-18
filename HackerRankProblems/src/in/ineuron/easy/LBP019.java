package in.ineuron.easy;

import java.util.Scanner;

public class LBP019 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		StringBuilder sb=new StringBuilder("");
		while(num>0) {
			sb.append(num%2);
			num=num/2;
		}
		System.out.println(sb.reverse());
	}

}

/*
A network protocol specifies how data is exchanged via transmission media. The protocol converts each message into a stream of 1's and 0's.
Given a decimal number, write an algorithm to convert the number into a binary form.

Input Format

a decimal number from the user

Constraints

n>=0

Output Format

its equalent binary form

Sample Input 0

4
Sample Output 0

100
Sample Input 1

8
Sample Output 1

1000
*/