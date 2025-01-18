package in.ineuron.easy;

import java.util.Scanner;

public class LBP044 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        if(n1>=0 && n2>=0){
	        if(n1!=n2){
	            System.out.println(n1+n2);
	        }
	        else{
	            System.out.println((n1+n2)*2);
	        }
	        }

	}

}
/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

Input Format

two int values

Constraints

n1>=0 and n2>=0

Output Format

return sum or double sum

Sample Input 0

1
2
Sample Output 0

3
Sample Input 1

3
2
Sample Output 1

5
Sample Input 2

5
5
Sample Output 2

20
Sample Input 3

2
2
Sample Output 3

8
*/