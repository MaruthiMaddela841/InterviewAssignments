package in.ineuron.easy;

import java.util.Scanner;

public class LBP001 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n >= 0) {
			if (n % 2 == 0) {
				System.out.println("even");

			} else
				System.out.println("odd");
		} else {
			System.out.println("invalid");
		}
	}
}

//Implement a program to check whether the given number is even number or odd number.
//
//Input Format
//
//An integer value
//
//Constraints
//
//n>=0
//
//Output Format
//
//even or odd or invalid
//
//Sample Input 0
//
//12
//Sample Output 0
//
//even
//Sample Input 1
//
//13
//Sample Output 1
//
//odd
//Sample Input 2
//
//-12
//Sample Output 2
//
//invalid