package in.ineuron.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LBP034 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        //Pattern p=Pattern.compile("[a-z]+[0-9]{1,}|[_]{1,}@gmail.com",Pattern.CASE_INSENSITIVE);
        Pattern p=Pattern.compile("[a-z]+[_|0-9]@gmail[.]com",Pattern.CASE_INSENSITIVE);
        Matcher m= p.matcher(s);
        boolean mf=m.find();
        if(mf)
            System.out.println("true");
        else
            System.out.println("false");

	}

}
/*
Email name should be starts with alphabet and should follw by number or underscore. It should contains either numbers or underscore finally ends with gmail.com only. Then given email id is true otherwise false.

Input Format

email id

Constraints

lowercase alphabet [a-z] followed by underscore or digit and gmail.com

Output Format

true or false

Sample Input 0

abc@gmail.com
Sample Output 0

false
Sample Input 1

abc1@gmail.com
Sample Output 1

true
Sample Input 2

abc_@gmail.com
Sample Output 2

true
*/