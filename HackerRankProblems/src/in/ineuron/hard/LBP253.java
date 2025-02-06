package in.ineuron.hard;

import java.util.Scanner;

public class LBP253 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] == arr[i + 1] - 1) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}

	}

}
/*
 * A company trasfers an encrypted code to one of its clients. The code needed
 * to be decrypted so that it can be used for accessing all the required
 * information. The code can be decrypted by interchanging each consecutive
 * digit and once if the digit got interchanged then it cannot be used again. If
 * at a certain point there is no digits to be interchanged with, then that
 * single digit must be left as it is. Write an algorithm to decrypt the code so
 * that it can be used to access the required information.
 * 
 * Input Format
 * 
 * a number from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * an integer value
 * 
 * Sample Input 0
 * 
 * 5 1 2 3 4 5 Sample Output 0
 * 
 * 2 1 4 3 5 Sample Input 1
 * 
 * 6 1 2 3 4 5 6 Sample Output 1
 * 
 * 2 1 4 3 6 5
 */