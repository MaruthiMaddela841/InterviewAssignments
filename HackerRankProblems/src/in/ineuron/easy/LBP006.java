package in.ineuron.easy;

import java.util.Scanner;

public class LBP006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		if (n >= 1)
			m = n / 6;
		System.out.println(n + m);

	}

}

/*
 * Implement a program to calculate the free number of cups the user gets for a
 * specified number of cups bought by the user. In this particular case, the
 * user gets 1 cup free for every 6 cups bought. (Example: If the user buys 12
 * cups, he gets 2 cups free as per the Buy 6 Get 1 Free offer, and hence the
 * output will be 12+2 = 14 cups).
 * 
 * Input Format
 * 
 * The input here is the number of coffee cups bought by the user.
 * 
 * Constraints
 * 
 * number of cups>=1.
 * 
 * Output Format
 * 
 * The output is the total number of cups the user gets including the free
 * coffee cups
 * 
 * Sample Input 0
 * 
 * 6 Sample Output 0
 * 
 * 7 Sample Input 1
 * 
 * 12 Sample Output 1
 * 
 * 14 Sample Input 2
 * 
 * 7 Sample Output 2
 * 
 * 8
 */