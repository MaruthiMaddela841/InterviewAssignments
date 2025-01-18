package in.ineuron.easy;

import java.util.Scanner;

public class LBP020 {

	public static int fibo(int num) {
		if (num == 0 || num == 1) {
			return num;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn = fibo(n);
		System.out.println(nn);

	}

}

/*
 * An e-commerce website wishes to find the lucky customer who will be eligible
 * for full value cash back. For this purpose,a number N is fed to the system.
 * It will return another number that is calculated by an algorithm. In the
 * algorithm, a sequence is generated, in which each number n the sum of the
 * preceding numbers. initially the sequence will have two 1's in it. The System
 * will return the Nth number from the generated sequence which is treated as
 * the order ID. The lucky customer will be one who has placed that order. Write
 * an alorithm to help the website find the lucky customer. Fibonacci Problem
 * Input Format
 * 
 * an integer value from the user
 * 
 * Constraints
 * 
 * no constraints
 * 
 * Output Format
 * 
 * print order ID as an integer
 * 
 * Sample Input 0
 * 
 * 8 Sample Output 0
 * 
 * 21 Sample Input 1
 * 
 * 5 Sample Output 1
 * 
 * 5
 */