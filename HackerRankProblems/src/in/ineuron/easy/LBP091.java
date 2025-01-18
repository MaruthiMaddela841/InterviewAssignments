package in.ineuron.easy;

import java.util.Scanner;

public class LBP091 {
	
static void findAppropriatePosition(String s){
        
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            char ch=c[i];
            int j=(int)ch;
            if(j>91){
            j=j-96;
            System.out.print(j+" ");
            }
            else if(j>=65 && j<=90){
                j=j-64;
                System.out.print(j+" ");
            }
        }
        
    }

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        String str=sc.nextLine();
	        findAppropriatePosition(str);

	}

}
/*Create a function that takes a string and replaces each letter with its appropriate position in the alphabet. "a" is 1, "b" is 2, "c" is 3, etc, etc.
Note: If any character in the string is n't a letter, ignore it.

Input Format

a string from the user

Constraints

non-empty string

Output Format

position of characters seperated by space

Sample Input 0

abc
Sample Output 0

1 2 3
Sample Input 1

xyz
Sample Output 1

24 25 26
*/