package in.ineuron.medium;

import java.util.Scanner;

public class LBP105 {

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
            int count=0;
            int num=arr[i];
            for(int j=1;j<=num;j++){
                if(num%j==0){
                    count++;
                }
            }
            if(count==2){
                sum=sum+arr[i];
            }
        }
            System.out.println(sum);
        }

	}

}
/*Implement a program to read an array elements and print sum of all prime elements.

Input Format

size of the array and array elements

Constraints

size<100

Output Format

sum of all prime elements

Sample Input 0

5
1 2 3 4 5
Sample Output 0

10
Sample Input 1

8
1 2 3 8 5 2 7 3
Sample Output 1

22
Sample Input 2

4
11 22 33 44
Sample Output 2

11
*/