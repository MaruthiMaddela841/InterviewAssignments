package in.ineuron.easy;

import java.util.Scanner;

public class LBP093 {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            int count=0;
            char ch=c[i];
            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(ch);
                break;
            }
        }

	}

}
/*Program to find first non-repeated character

Input Format

a non-empty string from the user

Constraints

no

Output Format

non-repeated character

Sample Input 0

aabcdbe
Sample Output 0

c
Sample Input 1

prakash
Sample Output 1

p
Sample Input 2

indian
Sample Output 2

d
Sample Input 3

india
Sample Output 3

n
*/