package in.ineuron.medium;

import java.util.Scanner;

public class LBP154 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			if (i < size / 2 && arr[i] >= s1) {
				System.out.print(arr[i] + " ");
			} else if (i >= size / 2 && arr[i] <= s2) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
/*
 * A compnay wishes to provide cab service for their N employees. The employees
 * have distance ranging from 0 to N-1. The company has calculated the total
 * distance from an employee's residence to the company, considering the path to
 * be followed by the cab is a straight path. The distance of the company from
 * it self is 0. The distance for the employees who live to the left side of the
 * company is represented with a negative sign. The distance for the employees
 * who live to the right side of the company is represented with a positive
 * sign. the cab will be allotted a range of distance. The company wishes to
 * find the distance for the employees who live within the particular distance
 * range. write a alogrithm to find the distance for the employees who live
 * within the distance range.
 * 
 * Input Format
 * 
 * size of the list N ,SD,ED and an array of distance
 * 
 * Constraints
 * 
 * distance within the range else -1
 * 
 * Output Format
 * 
 * con
 * 
 * Sample Input 0
 * 
 * 6 30 50 29 38 12 48 39 55 Sample Output 0
 * 
 * 38 48 39 Sample Input 1
 * 
 * 5 20 30 10 20 30 40 25 Sample Output 1
 * 
 * 20 30 25
 */