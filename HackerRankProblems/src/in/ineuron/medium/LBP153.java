package in.ineuron.medium;

import java.util.Scanner;

public class LBP153 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size >= 1 && size <= 100) {
			int[] arr = new int[size];
			int count = 0;
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < size; i++) {
				int sqrt = (int) Math.sqrt(arr[i]);
				if (sqrt * sqrt == arr[i])
					count++;
			}
			System.out.println(count);
		}

	}

}
/*
 * The garments company apparel wishes to open outlets at various locations. The
 * company shortlisted several plots in these locations and wishes to select
 * only plots that are square shaped. Write an algorithm to help Apparel find
 * the number of plots that it can select for its outlets.
 * 
 * Input Format
 * 
 * input consists of an integer N, and A1,A2,...AN representing areas of
 * outlets.
 * 
 * Constraints
 * 
 * 1>=size of the array<=100
 * 
 * Output Format
 * 
 * print an integer representing the number of plots selected for outlets.
 * 
 * Sample Input 0
 * 
 * 5 12 13 14 15 16 Sample Output 0
 * 
 * 1 Explanation 0
 * 
 * Have you observed that, 16 is perfect square (4x4), Hence output is 1.
 * 
 * Sample Input 1
 * 
 * 4 1 2 3 4 Sample Output 1
 * 
 * 2 Sample Input 2
 * 
 * 3 14 15 16 Sample Output 2
 * 
 * 1 Sample Input 3
 * 
 * 6 25 26 35 36 49 50 Sample Output 3
 * 
 * 3 Sample Input 4
 * 
 * 10 81 83 85 87 89 91 93 95 97 100 Sample Output 4
 * 
 * 2
 */