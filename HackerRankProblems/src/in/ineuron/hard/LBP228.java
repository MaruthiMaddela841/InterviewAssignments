package in.ineuron.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LBP228 {

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
        // Flatten the matrix into a list
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list2.add(arr[i][j]);
            }
            Collections.sort(list2,Comparator.reverseOrder());
                for(int x:list2){
                    list.add(x);
                }
        }
        //Collections.sort(list);
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = list.get(index++);
            }
        }

        // Print the sorted matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

	}

}
/*Implement a program to sort all the row wise elements in desc order

Input Format

a matrix

Constraints

no

Output Format

result matrix

Sample Input 0

1 3 2
4 5 6
7 9 8
Sample Output 0

3 2 1
6 5 4
9 8 7
Sample Input 1

1 0 0
0 1 0
0 0 1
Sample Output 1

1 0 0
1 0 0
1 0 0
*/