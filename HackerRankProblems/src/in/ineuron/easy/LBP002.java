package in.ineuron.easy;

import java.util.Scanner;

public class LBP002 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1 && n<=100){
            if (n%2==0){
                if(n>=2 && n<=5)
                    System.out.println("Not Weird");
                else if(n>=6 && n<=20)
                    System.out.println("Weird");
                else
                    System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
                }
        }

	}

}

//Given an integer n, perform the following conditional actions,
//If n is odd, print weird,
//If n is even and in the inclusive range of 2 to 5, print not weird,
//If n is even and in the inclusive range 6 to 20, print weird,
//If n is even and greater than 20, print not weird.
//
//Input Format
//
//An integer value from the user.
//
//Constraints
//
//1<=n<=100
//
//Output Format
//
//Weird or Not Weird
//
//Sample Input 0
//
//3
//Sample Output 0
//
//Weird
//Sample Input 1
//
//4
//Sample Output 1
//
//Not Weird
//Sample Input 2
//
//50
//Sample Output 2
//
//Not Weird