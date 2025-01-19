package in.ineuron.medium;

import java.util.Scanner;

public class LBP155 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println(arr[k - 1]);

	}

}
/*
 * A company wishes to modify the technique by which tasks in the processing
 * queue are executed. There are N processes with unique ID's from 0 to N-1.
 * Each of these tasks has its own execution time. The company wishes to
 * implement a new algorithm for processing tasks. for this purpose they have
 * identified a value K by the new algorithm, the processor will first process
 * the task that has the Kth shortest execution time. Write an algorithm to find
 * the Kth shortest execution time.
 * 
 * Input Format
 * 
 * array size, k value and array
 * 
 * Constraints
 * 
 * NA
 * 
 * Output Format
 * 
 * kth shortest execution time.
 * 
 * Sample Input 0
 * 
 * 7 5 9 -3 8 -6 -7 18 10 Sample Output 0
 * 
 * 9 Sample Input 1
 * 
 * 6 3 1 2 3 4 5 6 Sample Output 1
 * 
 * 3
 */