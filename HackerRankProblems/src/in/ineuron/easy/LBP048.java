package in.ineuron.easy;

import java.util.Scanner;

public class LBP048 {

	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
	        String str= sc.nextLine();
	        String[] s=str.split(":");
	        int[] num= new int[s.length];
	        for(int i=0;i<s.length;i++){
	            num[i]=Integer.valueOf(s[i]);
	        }
	        int res=(num[0]*60)+num[1];
	        System.out.println(res);

	}

}
/*
Accept video length in minutes the format is mm:ss in String format, create a function that takes video length and return it in seconds.

Input Format

video length in mm:ss

Constraints

no

Output Format

length in seconds

Sample Input 0

01:00
Sample Output 0

60
Sample Input 1

13:56
Sample Output 1

836
Sample Input 2

02:01
Sample Output 2

121
*/