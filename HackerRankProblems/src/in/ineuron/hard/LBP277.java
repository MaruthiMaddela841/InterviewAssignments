package in.ineuron.hard;

import java.util.Scanner;

public class LBP277 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int mul = 1;
		while (num > 0) {
			int temp = num % 10;
			mul = mul * temp;
			num = num / 10;
		}
		System.out.println(mul);

	}

}
/*
 * A super market maintains a pricing format for all its products. A value N is
 * printed on each product. When the scanner reads the value N on the item, the
 * product of all the digits in the value N is the price of the item. the task
 * here is to design the software such that given the code of any item N the
 * product (multiplication) of all the digits of value should be computed
 * (price).
 * 
 * Input Format
 * 
 * an integer value
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * price
 * 
 * Sample Input 0
 * 
 * 5244 Sample Output 0
 * 
 * 160 Sample Input 1
 * 
 * 123 Sample Output 1
 * 
 * 6 Sample Input 2
 * 
 * 4511 Sample Output 2
 * 
 * 20
 */