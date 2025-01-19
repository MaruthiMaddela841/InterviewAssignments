package in.ineuron.hard;

import java.util.Scanner;

public class LBP223 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        boolean b=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num=arr1[i][j]-arr2[i][j];
                System.out.print(num+" ");
            }
            System.out.println();
        }

	}

}
/*Write a program to perform subtraction operation on two matrices

Input Format

two 3x3 matrices

Constraints

no

Output Format

resultent matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
1 0 0
0 1 0
0 0 1
Sample Output 0

0 2 3
4 4 6
7 8 8
Sample Input 1

1 2 3
4 5 6
7 8 9
1 1 1
1 1 1
1 1 1
Sample Output 1

0 1 2
3 4 5
6 7 8
*/