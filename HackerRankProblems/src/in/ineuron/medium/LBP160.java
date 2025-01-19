package in.ineuron.medium;

import java.util.Scanner;

public class LBP160 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int count = 1;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			String s = "";
			int num = arr[i];
			int num2 = arr[i + 1];
			while (num > 0) {
				int res = num % 10;
				if (!s.contains(String.valueOf(res))) {
					s += res;
				}
				num = num / 10;
			}
			while (num2 > 0) {
				int res = num2 % 10;
				if (s.contains(String.valueOf(res))) {
					count++;
					break;
				}
				num2 = num2 / 10;
			}
		}
		if (count == size) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
/*
 * Create a function that returns true if each pair of adjacent numbers in an
 * array shares at least one digit and false otherwise.
 * 
 * Input Format
 * 
 * array size and array elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * 5 12 13 17 19 79 Sample Output 0
 * 
 * true Sample Input 1
 * 
 * 6 33 53 6351 12 2242 44 Sample Output 1
 * 
 * true
 */