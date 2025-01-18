package in.ineuron.medium;

import java.util.Scanner;

public class LBP109 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Validate size
        if (size <= 0 || size >= 100) {
            System.out.println("Invalid size. Size should be between 1 and 99.");
            return;
        }

        // Read the array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the element to search
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        // If not found
        if (!found) {
            System.out.println("Element not found.");
        }

	}

}
/*Implement a program to search for an element in an array.

Input Format

size, array elements and element to search

Constraints

size<100

Output Format

search for the given element

Sample Input 0

5
1 2 3 4 5
3
Sample Output 0

2
Sample Input 1

4
10 13 20 23
23
Sample Output 1

3
*/