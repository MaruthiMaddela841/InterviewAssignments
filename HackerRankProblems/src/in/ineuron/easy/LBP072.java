package in.ineuron.easy;

import java.util.Scanner;

public class LBP072 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Hello "+name);
        }
        else{
            System.out.println("Bye "+name);
        }

	}

}
/*Write a function that takes a string name and number num (either 1 or 0) and return "Hello"+name if number is 1, otherwise "Bye"+name.

Input Format

a string from the user

Constraints

no

Output Format

a string

Sample Input 0

prakash
1
Sample Output 0

Hello prakash
Sample Input 1

java
0
Sample Output 1

Bye java
Sample Input 2

python
1
Sample Output 2

Hello python
*/