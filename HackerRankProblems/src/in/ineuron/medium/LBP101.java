package in.ineuron.medium;

import java.util.Scanner;

public class LBP101 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<100){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        }

	}

}
/*Implement a program to read an array element and write on the screen.

Input Format

size of the array and array elements

Constraints

size<100

Output Format

the given array

Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 2 3 4 5
Sample Input 1

8
1 2 3 8 5 2 7 3
Sample Output 1

1 2 3 8 5 2 7 3
*/