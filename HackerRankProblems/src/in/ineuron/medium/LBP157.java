package in.ineuron.medium;

import java.util.Scanner;

public class LBP157 {

	public static void findSeven(int[] arr) {
		boolean containsSeven = false;
        for (int num : arr) {
            if (String.valueOf(num).contains("7")) {
                containsSeven = true;
                break;
            }
        }

        // Output the result
        if (containsSeven) {
            System.out.println("Boom!");
        } else {
            System.out.println("there is no 7 in the array");
        }
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		findSeven(arr);

	}

}
/*
 * Create a function that takes an array of numbers and return "Boom!" if the
 * digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
 * 
 * Input Format
 * 
 * an array from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * Boom! or "there is no 7 in the array".
 * 
 * Sample Input 0
 * 
 * 7 1 2 3 4 5 6 7 Sample Output 0
 * 
 * Boom! Sample Input 1
 * 
 * 4 8 6 33 100 Sample Output 1
 * 
 * there is no 7 in the array
 */