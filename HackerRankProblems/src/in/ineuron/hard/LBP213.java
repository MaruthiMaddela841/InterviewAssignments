package in.ineuron.hard;

import java.util.Scanner;

public class LBP213 {

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
         int max=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);

	}

}
/*Implement a program to print max element in a matrix

Input Format

a 3x3 matrix

Constraints

no

Output Format

max element in matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

9
Sample Input 1

1 0 0
0 2 0
0 0 3
Sample Output 1

3
*/