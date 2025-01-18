package in.ineuron.easy;

import java.util.Scanner;

public class LBP081 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        for(int i=0;i<s.length;i++){
            String test=s[i];
            if(test.length()%2==0){
                System.out.print(test+" ");
            }
        }

	}

}
/*Write a program to print even length words in a string?

Input Format

a string from the user

Constraints

no

Output Format

list of strings with even length

Sample Input 0

hello world java
Sample Output 0

java
Sample Input 1

python is very easy
Sample Output 1

python is very easy
*/