package in.ineuron.medium;

import java.util.Scanner;

public class LBP139 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int mid = size / 2; // Midpoint of the array
		for (int i = 0, j = mid - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
/*Implement a program to reverse only first half of the array and keep remaining elements as original.

Input Format

size and array elements

Constraints

no

Output Format

reverse only first half of the array

Sample Input 0

5
5 1 4 2 3
Sample Output 0

1 5 4 2 3
Sample Input 1

6
5 2 3 6 1 4
Sample Output 1

2 3 5 6 1 4
*/