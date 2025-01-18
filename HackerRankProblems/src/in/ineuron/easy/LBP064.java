package in.ineuron.easy;

import java.util.Scanner;

public class LBP064 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char[] c= new char[]{'x','o'};
        int xcount=0;
        int ycount=0;
        for(int i=0;i<c.length;i++){
            char c1=c[i];
            for(int j=0;j<str.length();j++){
                if(c1==str.charAt(j)){
                    if(i==0){
                        xcount+=1;
                    }
                    else{
                        ycount+=1;
                    }
                }
            }
        }
        if(xcount==ycount)
            System.out.println("true");
        else if(xcount==0 && ycount==0)
            System.out.println("true");
        else
            System.out.println("false");

	}

}
/*Create a function that takes a string, check if it has the same number of x's and o's and returns either true or false.
1. return boolean value true or false.
2. returns true if the amount x's and o's are the same.
3. returns false if they are not the same amount.
4. the string can contains any character.
5. when 'x' and 'o' are not in the string, return true.

Input Format

a string

Constraints

No

Output Format

true or false

Sample Input 0

ooxx
Sample Output 0

true
Sample Input 1

xooxx
Sample Output 1

false
*/