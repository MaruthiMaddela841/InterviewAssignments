package in.ineuron.medium;

import java.util.Scanner;

public class LBP188 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        int num=sc.nextInt();
	        int res=num;
	        while(res>10){
	            int flag=0;
	          while(res!=0){
	            int temp=res;
	              temp=temp%10;
	              flag+=temp;
	            res=res/10;
	        }
	            res=flag;
	        }
	        System.out.println(res);

	}

}
/*Write a program to find the digital root of a given number. Digital root is the recursive sum of digits in the given number (until single digit is arrived)

Input Format

a number from the user

Constraints

no

Output Format

single digit number

Sample Input 0

2478
Sample Output 0

3
Sample Input 1

69798
Sample Output 1

3
*/