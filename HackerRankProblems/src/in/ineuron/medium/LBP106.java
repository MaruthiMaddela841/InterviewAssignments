package in.ineuron.medium;

import java.util.Scanner;

public class LBP106 {

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
            int rev=0;
            int num=arr[i];
            int res=num;
            if(num>0 && num<9){
                sum=sum+arr[i];
            }
            else{
                while(num!=0){
                    int temp;
                    temp=num%10;
                    rev=rev*10+temp;
                    num=num/10;
                }
            }
            if(rev==res){
                sum=sum+arr[i];
            }
        }
            System.out.println(sum);
        }

	}

}
/*Implement a program to read an array elements and print sum of all palindrome numbers in array.

Input Format

size of the array and array elements

Constraints

size<100

Output Format

sum of all palindrome numbers

Sample Input 0

5
1 2 3 4 5
Sample Output 0

15
Sample Input 1

3
121 122 123
Sample Output 1

121
Sample Input 2

3
111 222 333
Sample Output 2

666
*/