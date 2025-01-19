package in.ineuron.medium;

import java.util.Scanner;

public class LBP164 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input size of the array
		int size = sc.nextInt();

		// Input array elements
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Create a new array to store the updated values
		int[] updatedArr = new int[size];

		// Update array elements
		for (int i = 0; i < size; i++) {
			if (i == 0) {
				// First element (multiply with the second element)
				updatedArr[i] = arr[i] * arr[i + 1];
			} else if (i == size - 1) {
				// Last element (multiply with the second-to-last element)
				updatedArr[i] = arr[i] * arr[i - 1];
			} else {
				// Middle elements (multiply with previous and next elements)
				updatedArr[i] = arr[i - 1] * arr[i + 1];
			}
		}

		// Output updated array
		for (int num : updatedArr) {
			System.out.print(num + " ");
		}

	}

}
/*
 * Implement a progra to update every array element with multiplication of
 * previous and next numbers in array.
 * 
 * Input Format
 * 
 * size and array elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * updated array
 * 
 * Sample Input 0
 * 
 * 6 1 2 3 4 5 6 Sample Output 0
 * 
 * 2 3 8 15 24 5 Sample Input 1
 * 
 * 4 10 20 30 40 Sample Output 1
 * 
 * 20 300 800 30
 */