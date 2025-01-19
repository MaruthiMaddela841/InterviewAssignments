package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP186 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j=size/2;j<size-1;j++){
            for(int i=size/2;i<size-1;i++){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

	}

}
/*You are given a list of integers of size N, write an algorithm to sort the first K elements of the list in ascending order and the remaining elements in descending order.

Input Format

an arry size and elements

Constraints

no

Output Format

updated array

Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 2 5 4 3
Sample Input 1

8
1 8 2 7 3 6 4 5
Sample Output 1

1 2 3 4 8 7 6 5
*/