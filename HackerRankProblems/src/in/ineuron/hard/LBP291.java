package in.ineuron.hard;

import java.util.Scanner;

public class LBP291 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			int sum = 0;
			while (arr[i] > 0) {
				int temp = arr[i] % 10;
				sum = sum + temp;
				arr[i] = arr[i] / 10;
			}
			System.out.print(sum + " ");
		}

	}

}
/*
 * A data company wishes to store its data files on the server. They N files.
 * Each file has a particular size. the server stires the files in bucket list.
 * The bucket ID is calculated as the sum of the digits of its file size. The
 * server.. the bucket ID for every file request where the file is stored. Write
 * an algorithm to find the bucketIDs where the files are stored.
 * 
 * Input Format
 * 
 * an array size and elements
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * bucketIds
 * 
 * Sample Input 0
 * 
 * 4 43 345 20 987 Sample Output 0
 * 
 * 7 12 2 24 Sample Input 1
 * 
 * 5 12 13 14 15 16 Sample Output 1
 * 
 * 3 4 5 6 7
 */