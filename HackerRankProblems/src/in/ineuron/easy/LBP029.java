package in.ineuron.easy;

import java.util.Scanner;

public class LBP029 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

	}

}

/*
Write a program to check whether the given number is prime number or not. A number is said to prime if it is having only two factors. i.e. 1 and number itself.

Input Format

a number from the use

Constraints

n>1

Output Format

true or false

Sample Input 0

2
Sample Output 0

true
Sample Input 1

3
Sample Output 1

true
*/