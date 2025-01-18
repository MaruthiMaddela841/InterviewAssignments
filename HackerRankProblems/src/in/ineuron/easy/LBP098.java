package in.ineuron.easy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LBP098 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        String str=sc.nextLine();
	        boolean b=Pattern.matches("[0-9]*",str);
	        if(b)
	            System.out.println("Yes");
	        else
	            System.out.println("No");

	}

}
/*Implement a program to check if a string contains only digits.

Input Format

a string from the user

Constraints

no

Output Format

Yes or No

Sample Input 0

abc123
Sample Output 0

No
Sample Input 1

123456
Sample Output 1

Yes
Sample Input 2

prakash22
Sample Output 2

No
*/