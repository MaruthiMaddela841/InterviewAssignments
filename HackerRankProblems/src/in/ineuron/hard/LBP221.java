package in.ineuron.hard;

import java.util.Scanner;

public class LBP221 {

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
				if(arr1[i][j]!=arr2[i][j]) {
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
/*Implement a program to check whether the given matrices are equal or not

Input Format

a 3x3 matrix

Constraints

no

Output Format

Yes or No

Sample Input 0

1 2 3
4 5 6
7 8 9
1 2 3
4 5 6
7 8 9
Sample Output 0

Yes
Sample Input 1

1 2 3
4 5 6
7 8 9
1 0 0
0 1 0
0 0 1
Sample Output 1

No
Sample Input 2

1 0 0
0 1 0
0 0 1
1 0 0
0 1 0
0 0 1
Sample Output 2

Yes
*/