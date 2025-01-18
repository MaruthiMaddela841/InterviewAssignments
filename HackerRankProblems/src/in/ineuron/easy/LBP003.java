package in.ineuron.easy;

import java.util.Scanner;

public class LBP003 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
           if((n%4==0 && n%100!=0) || (n%4==0 &&(n%100==0 && n%400==0)))
               System.out.println("True");
            else
                System.out.println("False"); 
        }

	}

}

//Implement a program to check whether the given year is leap year or not.
//
//Input Format
//
//Read year value as an integer from the user.
//
//Constraints
//
//Year>0
//Leap Year: It is exactly divisible by 4 except for century year, if it is a century year then it must be divisible by 400.
//
//Output Format
//
//True or False
//
//Sample Input 0
//
//1600
//Sample Output 0
//
//True
//Sample Input 1
//
//2020
//Sample Output 1
//
//True
//Sample Input 2
//
//2100
//Sample Output 2
//
//False