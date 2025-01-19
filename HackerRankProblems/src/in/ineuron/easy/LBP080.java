package in.ineuron.easy;

import java.util.Scanner;

//import java.util.regex.Pattern;

public class LBP080 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
//        boolean b=Pattern.matches("[#]{1}[0-9a-fA-F]{6}",str);
//        System.out.println(b);

	}

}
/*Create a function that determines whether a string is a valid hex code. A hex code must begin with a pound key # and is exactly 6 characters in length. Each character must be a digit from 0-9 or an alphabetic character from A-F. All alphabetic characters may be uppercase or lowercase.

Input Format

a string from the user

Constraints

no

Output Format

true or false

Sample Input 0

#CD5C5C
Sample Output 0

true
Sample Input 1

#CD5C5G
Sample Output 1

false
*/