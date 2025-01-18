package in.ineuron.easy;

import java.util.Scanner;

public class LBP027 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int sum=0;
        while(i<=j){
            sum=sum+i;
            i++;
        }
        while(j>k){
            j--;
            sum=sum+j;
        }
        
        System.out.println(sum);

	}

}

/*
Given three integers i,j & k, a sequence sum to be the value of i+(i+1)+(i+2)..+j+(j-1)+(j-2)+..+k (increment from i until it equals to j, then decrement from j until equals k). Given values i,j,k. caluclate the sequence sum as described.
int getSequenceSum(int,int,int);

Input Format

Three int values

Constraints

no

Output Format

sum based on given constraints

Sample Input 0

5
9
6
Sample Output 0

56
Sample Input 1

0
5
-1
Sample Output 1

24
Sample Input 2

6
10
5
Sample Output 2

75
*/