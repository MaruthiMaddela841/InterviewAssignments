package in.ineuron.easy;

import java.util.Scanner;

public class LBP028 {
	
	static int fibo(int n){
	    if(n==0 || n==1)
	        return n;
	    else{
	        return fibo(n-1)+fibo(n-2);
	    }
	    }

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        num=num+1;
        int res=fibo(num);
        System.out.println(res);

	}

}

/*
You are climbing a stair case. It takes n steps to reach to the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Input Format

a number from the user

Constraints

no

Output Format

number of ways

Sample Input 0

1
Sample Output 0

1
Sample Input 1

2
Sample Output 1

2
*/