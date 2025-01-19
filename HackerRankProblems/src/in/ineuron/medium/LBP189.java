package in.ineuron.medium;

import java.util.Scanner;

public class LBP189 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int num2=num;
        while(num!=0){
            int temp=num;
            temp=temp%10;
            rev=rev*10+temp;
            num=num/10;
        }
        if(rev>num2)
            System.out.println(rev-num2);
        else
            System.out.println(num2-rev);

	}

}
/*Write a program to find the absolute difference between the original number and its reserved number.

Input Format

a number from the user

Constraints

no

Output Format

absolute difference

Sample Input 0

245
Sample Output 0

297
Sample Input 1

923
Sample Output 1

594
Sample Input 2

1234
Sample Output 2

3087
*/