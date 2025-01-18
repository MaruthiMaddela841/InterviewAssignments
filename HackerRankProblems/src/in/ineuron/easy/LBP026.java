package in.ineuron.easy;

import java.util.Scanner;

public class LBP026 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int res=(int)((num-32)/1.8);
        System.out.println(res);

	}

}

/*
Program to convert fahrenheit to celsius.

Input Format

fahrenheit

Constraints

no

Output Format

celsius

Sample Input 0

32
Sample Output 0

0
Sample Input 1

12
Sample Output 1

-11
*/