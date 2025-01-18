package in.ineuron.easy;

import java.util.Scanner;

public class LBP046 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str2=sc.nextLine();
        String[] str=str2.split("-");
        int mul=Integer.parseInt(str[0])*Integer.parseInt(str[1]);
        System.out.println("Mul::"+mul);
        if(str[2].endsWith(String.valueOf(mul))) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	}

}
/*
Program to read date, month and year from the user and check whether it is magic date or not.
Here are the rules for magic date.

1) mm*dd is a 1-digit number that matches the last digit in YYYY
2) mm*dd is a 2-digit number that matches the last two digits in YYYY
3) mm*dd is a 3-digit number that matches the last three digits in YYYY

Input Format

three int values

Constraints

no

Output Format

true or false

Sample Input 0

1-1-2001
Sample Output 0

true
Sample Input 1

5-2-2010
Sample Output 1

true
Sample Input 2

5-1-2010
Sample Output 2

false
*/