package in.ineuron.easy;

import java.util.Scanner;

public class LBP061 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char c=str.charAt(0);
        int m=0;
        int n = Integer.parseInt(String.valueOf(str.charAt(1)));
        if((str.length()==2) && (c>='a' && c<='h') && (n>=1 && n<=8)){
            char[] characters=new char[]{'a','b','c','d','e','f','g','h'};
            for(int i=0;i<characters.length;i++){
                if(c==characters[i]){
                   m=i; 
                }
            }
            if(m%2!=0){
                if(n%2!=0){
                    System.out.println("true");
                }
                else
                    System.out.println("false");
            }
            else if(m%2==0){
                if(n%2==0){
                    System.out.println("true");
                }
                else
                    System.out.println("false");
            }
        }

	}

}
/*You are given coordinates, a string that represents the coordinates of a square of the chessboard. Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.

Input Format

coordinates from the user

Constraints

coordinates.length == 2 'a' <= coordinates[0] <= 'h' '1' <= coordinates[1] <= '8'

Output Format

true or false

Sample Input 0

a1
Sample Output 0

false
Sample Input 1

h3
Sample Output 1

true
Sample Input 2

c7
Sample Output 2

false
*/