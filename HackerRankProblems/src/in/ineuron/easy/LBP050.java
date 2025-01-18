package in.ineuron.easy;

import java.util.Scanner;

public class LBP050 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int res=0;
        for(int i=n1;i<=n2;i++){
            int num=i;
            while(num!=0){
                int r=num%10;
                res=res+r;
                num=num/10;
            }
        }
        System.out.println(res);

	}

}
/*
Create a function that sums the total number of digits between two numbers inclusive. for example, if the numbers are 19 and 22, then (1+9)+(2+0)+(2+1)+(2+2)=19.

Input Format

two numbers from the user

Constraints

no

Output Format

sum of digits between n1 and n2

Sample Input 0

19
22
Sample Output 0

19
Sample Input 1

7
8
Sample Output 1

15
Sample Input 2

17
20
Sample Output 2

29
*/