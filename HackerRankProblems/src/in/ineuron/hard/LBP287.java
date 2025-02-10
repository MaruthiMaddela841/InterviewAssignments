package in.ineuron.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LBP287 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<Integer>();
		int num = sc.nextInt();
		do {
			al.add(num);
			num = sc.nextInt();
		} while (num != -1);
		for (Integer i : al) {
			int temp = i % 10;
			// System.out.println("Temp::"+temp);
			if (temp == 2 && i < 50) {
				System.out.print("-6 ");
			} else if (temp != 2 && i < 50) {
				System.out.print("-5 ");
			} else if (temp == 2 && i >= 50) {
				System.out.print("-1 ");
			} else
				System.out.print(i + " ");
		}

	}

}
/*
 * Immplement a program, it reads integers from the input device(until it gets
 * -ve number) and put them into array. We define a hot number as any number
 * whose last digit is 2, and cold number as any number that is less than 50.
 * You have to modify the program such that if it is hot number replace by -1 if
 * it is cold number replace by -5 if it is both hot and cold replace by -6 else
 * keep old number
 * 
 * Input Format
 * 
 * a sequence of int values
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * a sequence of int values
 * 
 * Sample Input 0
 * 
 * 92 61 13 42 -1 Sample Output 0
 * 
 * -1 61 -5 -6 Sample Input 1
 * 
 * 11 12 85 96 82 -1 Sample Output 1
 * 
 * -5 -6 85 96 -1
 */