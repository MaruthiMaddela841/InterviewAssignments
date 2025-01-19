package in.ineuron.medium;

import java.util.Scanner;

public class LBP200 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
                arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+(arr[i]%k);
        }
        System.out.println(sum);

	}

}
/*Perfect math is an online math program. In once of the assignments the system displays a list of N number and a value K, and students need to calculate the sum of remainders after dividing all the numbers from the list of N numbers by K. The system need to develop a program to calcualte the correct answer for the assignment.
Write an algorithm to calcualte the correct answer for the assignment.

Input Format

size N and N elements and K value

Constraints

no

Output Format

an int value

Sample Input 0

5
1 2 3 4 5
3
Sample Output 0

6
Sample Input 1

5
7 3 2 10 4
5
Sample Output 1

11
*/