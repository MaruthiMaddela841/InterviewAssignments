package in.ineuron.easy;

import java.util.Scanner;

public class LBP042 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
            int innercount=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    innercount+=1;
                }
            }
            if(innercount==2){
                sum=sum+i;
            }
        }
        System.out.println(sum);

	}

}
/*
Jackson, a math student, is developing an application on prime numbers. for the given two integers on the display of the application, the user has to identify all the prime numbers within the given range (including the given values). afterwards the application will sum all those prime numbers. Jackson has to write an algorithm to find the sum of all the prime numbers of the given range. Write an algorithm to find the sum of all the prime numbers of the given range.

Input Format

two space sepearted integers RL and RR.

Constraints

no

Output Format

sum of the prime numbers between RL and RR.

Sample Input 0

2
10
Sample Output 0

17
Sample Input 1

45
89
Sample Output 1

682
Sample Input 2

3
12
Sample Output 2

26
*/