package in.ineuron.hard;

import java.util.Scanner;

public class LBP224 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input matrix dimensions
		System.out.println("Enter the number of rows and columns (n x m):");
		int n = sc.nextInt();
		int m = sc.nextInt();

		// Initialize matrices
		int[][] matrix1 = new int[n][m];
		int[][] matrix2 = new int[m][n]; // For proper multiplication, the second matrix should be m x n
		int[][] result = new int[n][n]; // Resultant matrix dimensions: n x n

		// Input first matrix
		System.out.println("Enter elements of the first matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		// Input second matrix
		System.out.println("Enter elements of the second matrix:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		// Perform matrix multiplication
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = 0;
				for (int k = 0; k < m; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		// Print resultant matrix
		System.out.println("Resultant Matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
/*
 * Write a program to perform multiplication operation on two matrices
 * 
 * Input Format
 * 
 * two 3x3 matrices
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * resultent matrix
 * 
 * Sample Input 0
 * 
 * 1 2 3 4 5 6 7 8 9 1 0 0 0 1 0 0 0 1 Sample Output 0
 * 
 * 1 2 3 4 5 6 7 8 9 Sample Input 1
 * 
 * 1 0 0 0 1 0 0 0 1 1 0 0 0 1 0 0 0 1 Sample Output 1
 * 
 * 1 0 0 0 1 0 0 0 1 Sample Input 2
 * 
 * 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 Sample Output 2
 * 
 * 30 36 42 66 81 96 102 126 150
 */