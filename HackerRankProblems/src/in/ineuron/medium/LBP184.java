package in.ineuron.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LBP184 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] brr=Arrays.copyOf(arr,size);
        Arrays.sort(brr);
        int count=0;
        for(int i=0;i<size;i++){
            if(brr[i]==arr[i])
                count++;
        }
        System.out.print(count);

	}

}
/*You are given an array of integers, a of size n, Your task is to find the number of elements whose positions will remain unchanged after sorted in ascending order.

Input Format

array size and elements

Constraints

no

Output Format

unchanged count

Sample Input 0

5
1 2 5 3 4
Sample Output 0

2
Sample Input 1

10
1 10 2 9 3 8 4 7 5 6
Sample Output 1

1
*/