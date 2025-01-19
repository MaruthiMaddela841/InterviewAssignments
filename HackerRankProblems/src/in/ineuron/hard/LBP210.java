package in.ineuron.hard;

import java.util.Scanner;

public class LBP210 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
         int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if((i==n-1 && j==m-1) || (i==0 && j==0))
                    sum+=arr[i][j];
            }
        }
        System.out.println(sum);

	}

}
/*Write a program to find sum of first and last element in a matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

sum of first and last element in matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

10
Sample Input 1

0 2 4
6 8 10
12 14 16
Sample Output 1

16
Sample Input 2

2 3 5
7 11 13
17 19 23
Sample Output 2

25
Sample Input 3

0 0 0
0 0 0
0 0 0
Sample Output 3

0
*/