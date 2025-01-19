package in.ineuron.medium;

import java.util.Scanner;

public class LBP171 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		String que = "break,case,continue,default,defer,else,for,func,goto,if,map,range,return,struct,type,var";
		String[] arr = que.split(",");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str))
				count++;
		}
		if (count > 0)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
/*
 * One programming language has the following keywords that cannot be used as
 * identifiers.
 * break,case,continue,default,defer,else,for,func,goto,if,map,range,return,
 * struct,type,var write a program to find if the given word is a keyword or
 * not.
 * 
 * Input Format
 * 
 * string from the user
 * 
 * Constraints
 * 
 * con
 * 
 * Output Format
 * 
 * true or false
 * 
 * Sample Input 0
 * 
 * defer Sample Output 0
 * 
 * true Sample Input 1
 * 
 * class Sample Output 1
 * 
 * false Sample Input 2
 * 
 * default Sample Output 2
 * 
 * true
 */