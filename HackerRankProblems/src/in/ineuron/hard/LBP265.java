package in.ineuron.hard;

import java.util.Scanner;

public class LBP265 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){
            int res=num%10;
            res=res*res;
            System.out.print(res);
            num=num/10;
        }

	}

}
/*Aryan is studying in the 5th standard. He is very interested in mathematical tricks and always wanted to play with numbers. Aryan would like to replace existing numbers with some other numbers. Today he decided to replace all digits of the number (which is greater than or equal to 2 digits) by its squares and print it in reverse order. Write a program to help him to replace numbers accordingly.

Input Format

a number

Constraints

no

Output Format

replaced all digits by its squares and revered number

Sample Input 0

12345
Sample Output 0

2516941
Sample Input 1

1234
Sample Output 1

16941
Sample Input 2

123
Sample Output 2

941
*/