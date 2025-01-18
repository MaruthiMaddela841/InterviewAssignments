package in.ineuron.easy;

import java.util.Scanner;

public class LBP024 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);

	}

}

/*
Implement a program to find sum of even number between x and y both are inclusive.

Input Format

two int values

Constraints

no

Output Format

sum of even numbers between x and y

Sample Input 0

10
15
Sample Output 0

36
Sample Input 1

0
10
Sample Output 1

30
*/