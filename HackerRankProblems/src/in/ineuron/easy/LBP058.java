package in.ineuron.easy;

import java.util.Scanner;

public class LBP058 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[] c=s1.toCharArray();
        for(int i=0;i<c.length;i++){
            if(i==0){
                System.out.print(Character.toUpperCase(c[i]));
            }
            else{
            System.out.print(c[i]);
            }
        }
        System.out.print(s2);

	}

}
/*A word has been split into a left part and right part. Re-form the word by adding both halves together changing the first character to an upper case letter.

Input Format

two strings left and right

Constraints

No

Output Format

Concatenated String with first character as capital letter.

Sample Input 0

prakash
babu 
Sample Output 0

Prakashbabu
Sample Input 1

hacker
rank
Sample Output 1

Hackerrank
Sample Input 2

comp
lete
Sample Output 2

Complete
*/