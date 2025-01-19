package in.ineuron.hard;

import java.util.Scanner;

public class LBP218 {

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
                if(i==j)
                    sum+=arr[i][j];
            }
        }
        System.out.println(sum);

	}

}
/*Implement a program to find trace(sum of diagonal elements) of the given matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

print trace of the matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

15
Sample Input 1

1 0 0
0 1 0
0 0 1
Sample Output 1

3
*/