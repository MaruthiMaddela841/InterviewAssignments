package in.ineuron.medium;

import java.util.Scanner;

public class LBP162 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] brr = new int[2];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int num = arr[i];
			while (num != 0) {
				int temp = num;
				temp = temp % 10;
				if (temp == 5) {
					count++;
				}
				num = num / 10;
			}
			if (count >= 1) {
				if (brr[1] < count || brr[1] == count) {
					brr[0] = i;
					brr[1] = count;
				}
			}
		}
		System.out.print(arr[brr[0]]);

	}

}
/*
 * Arun is obsessed with primes, especially five. He considers a number to be
 * luckiest if it has the highest number of five in it. If two numbers have the
 * same frequency of five, Arun considers the last occurence of them to be
 * luckiest, and if there is no five in any number, the first given number is
 * considered luckiest. Help him choose the luckiest number.
 * 
 * Input Format
 * 
 * array size and elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * return luckiest number
 */