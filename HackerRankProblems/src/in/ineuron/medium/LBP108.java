package in.ineuron.medium;

import java.util.Scanner;

public class LBP108 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<100){
            int sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int num=arr[i];
            int temp=num%10;
            if(temp==3){
                sum=sum+num;
            }
        }
            System.out.println(sum);
    }

	}

}
/*Implement a program to read an array elements and print sum of elements ending with 3 in array.

Input Format

size of the array and array elements

Constraints

size<100

Output Format

sum of elements ending with 3

Sample Input 0

5
1 2 3 4 5
Sample Output 0

3
Sample Input 1

4
10 13 20 23
Sample Output 1

36
Sample Input 2

3
13 33 23
Sample Output 2

69
*/