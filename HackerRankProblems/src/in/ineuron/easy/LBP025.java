package in.ineuron.easy;

import java.util.Scanner;

public class LBP025 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int res=(int)(num*1.8)+32;
        System.out.println(res);

	}

}

/*
 * Create a function/method to convert celsius to fahrenheit

Input Format

celsius

Constraints

no

Output Format

Fahrenheit

Sample Input 0

0
Sample Output 0

32
Sample Input 1

4
Sample Output 1

39
Sample Input 2

90
Sample Output 2

194
 */