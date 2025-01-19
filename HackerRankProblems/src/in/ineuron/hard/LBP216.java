package in.ineuron.hard;

import java.util.Scanner;

public class LBP216 {

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
         int flag=0;
        for (int i = 0; i < n; i++) {
            int max=arr[i][flag];
            for (int j = 0; j < m; j++) {
                if(max>arr[i][j]){
                    max=arr[i][j];
                }
            }
            System.out.println(max);
            flag++;
        }

	}

}
/*Implement a program to print min element in each row of a matrix

Input Format

a 3x3 matrix

Constraints

no

Output Format

print min element in each row of a matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

1
4
7
Sample Input 1

1 0 0 
0 2 0
0 0 3
Sample Output 1

0
0
0
Sample Input 2

-1 0 0 
0 -2 0
0 0 -3
Sample Output 2

-1
-2
-3
*/