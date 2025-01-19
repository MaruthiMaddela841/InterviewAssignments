package in.ineuron.hard;

import java.util.Scanner;

public class LBP205 {

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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count=0;
                for(int k=2;k<=arr[i][j];k++){
                    if(arr[i][j]%k==0)
                        count++;
                }
                if(count==1){
                    sum=sum+arr[i][j];
                }
            }

        }
        System.out.println(sum);

	}

}
/*Write a program to find sum of all prime elements in the matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

sum of all prime elements

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

17
Sample Input 1

1 0 0
0 2 0
0 0 3
Sample Output 1

5
Sample Input 2

0 2 4
6 8 10
12 14 16
Sample Output 2

2
*/