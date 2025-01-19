package in.ineuron.hard;

import java.util.Scanner;

public class LBP211 {

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
         int sum=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==j)
                    sum*=arr[i][j];
            }
        }
        System.out.println(sum);

	}

}
/*Write a program to find the product of diagonal matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

find the product of diagonal matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

45
Sample Input 1

1 0 0
0 2 0
0 0 3
Sample Output 1

6
Sample Input 2

0 2 4
6 8 10
12 14 16
Sample Output 2

0
*/