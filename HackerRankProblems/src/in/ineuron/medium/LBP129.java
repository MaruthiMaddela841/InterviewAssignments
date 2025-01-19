package in.ineuron.medium;

import java.util.Scanner;

public class LBP129 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 100) {
			int sum = 0;
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			String str = "";
			for (int i = 0; i < size; i++) {
				int el = arr[i];
				for (int j = i + 1; j < size; j++) {
					if (arr[j] == el) {
						if (!str.contains(Integer.toString(el)))
							str = str + el;
					}

				}
			}
			System.out.println(str.length());
		}

	}

}
/*
 * Implement a program to find the number of duplicate elements present in the
 * given array.
 * 
 * Input Format
 * 
 * size, array elements
 * 
 * Constraints
 * 
 * size<100
 * 
 * Output Format
 * 
 * number of duplicate elements in the array
 * 
 * Sample Input 0
 * 
 * 5 1 1 2 2 3 Sample Output 0
 * 
 * 2 Sample Input 1
 * 
 * 4 1 1 1 2 Sample Output 1
 * 
 * 1 Sample Input 2
 * 
 * 6 1 2 3 4 5 6 Sample Output 2
 * 
 * 0 Sample Input 3
 * 
 * 3 1 1 1 Sample Output 3
 * 
 * 1
 */