package in.ineuron.hard;

import java.util.Scanner;

public class LBP238 {

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
        boolean b=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]!=arr[j][i]){
                    b=false;
                    break;
                }
            }
        }
        if(b)
            System.out.println("Yes");
        else
            System.out.println("No");

	}

}
/*Implement a program to read a matrix and check whether the given matrix is symmertric matrix or not

Input Format

a 3x3 matrix

Constraints

no

Output Format

Yes or No

Sample Input 0

1 2 3
2 4 5
3 5 8
Sample Output 0

Yes
Sample Input 1

1 0 0
0 1 0
0 0 1
Sample Output 1

Yes
*/