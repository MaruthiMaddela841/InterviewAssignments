package in.ineuron.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LBP251 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] % 10 == 0 && arr[j + 1] % 10 != 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}

		// java8
		List<Integer> nonMultiplesOf10 = Arrays.stream(arr).filter(num -> num % 10 != 0).boxed()
				.collect(Collectors.toList());
		List<Integer> multiplesOf10 = Arrays.stream(arr).filter(num -> num % 10 == 0).boxed()
				.collect(Collectors.toList());

// Combine both lists
		nonMultiplesOf10.addAll(multiplesOf10);

// Output the result
		nonMultiplesOf10.forEach(num -> System.out.print(num + " "));
		
		
		// Partition logic
//        for (int num : arr) {
//            if (num % 10 != 0) {
//                temp[start++] = num;
//            } else {
//                temp[end--] = num;
//            }
//        }

	}

}
/*
 * Given an array A of N integer numbers. The task is to rewrite the array by
 * putting all multiples of 10 at the end of the given array. Note: The order of
 * the numbers which arenot multiples of 10 should remain unaltered, and
 * similarly. the order of all multiples of 10 should be unaltered.
 * 
 * Input Format
 * 
 * N and Array Elements
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
 * 9 10 12 5 40 30 7 50 9 10 Sample Output 0
 * 
 * 12 5 7 9 10 40 30 50 10 Sample Input 1
 * 
 * 5 10 2 3 4 5 Sample Output 1
 * 
 * 2 3 4 5 10
 */