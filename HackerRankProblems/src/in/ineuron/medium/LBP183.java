package in.ineuron.medium;

import java.util.Scanner;

public class LBP183 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<size;i++){
            int num=arr[i];
            res=res+(num*(num+1));
        }
        System.out.println(res);

	}

}
/*Given an integer N and integer array A as the input, where N denotes the length of A write a program to find an integer the sum of all these product with successors.

Input Format

array size and elements

Constraints

no

Output Format

an int value

Sample Input 0

5
1 2 3 4 5
Sample Output 0

70
Sample Input 1

4
1 2 3 5
Sample Output 1

50
*/