package in.ineuron.medium;

import java.util.Scanner;

public class LBP152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size >= 1 && size <= 100) {
			int[] arr = new int[size];
			int sum = 0;
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - 1; j++) {
					if (arr[j] % 2 != 0 && arr[j + 1] % 2 == 0) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			for (int n : arr) {
				System.out.print(n + " ");
			}
		}

	}

}
/*
 * You are playing an online game. In the game, a list of N numbers is given.
 * The player has to arrange the numbers so that all the odd numbers of the list
 * come after even numbers. Write an algorithm to arrange the given list such
 * that all the odd numbers of the list come after the even numbers.
 * 
 * Input Format
 * 
 * array size and array elements.
 * 
 * Constraints
 * 
 * 1<=size<=100.
 * 
 * Output Format
 * 
 * modified array.
 * 
 * Sample Input 0
 * 
 * 8 10 98 3 33 12 22 21 11 Sample Output 0
 * 
 * 10 98 12 22 3 33 21 11 Sample Input 1
 * 
 * 5 1 2 3 4 5 Sample Output 1
 * 
 * 2 4 1 3 5 Sample Input 2
 * 
 * 6 1 2 3 4 5 6 Sample Output 2
 * 
 * 2 4 6 1 3 5 Sample Input 3
 * 
 * 10 1 2 3 4 5 6 7 8 9 10 Sample Output 3
 * 
 * 2 4 6 8 10 1 3 5 7 9
 */