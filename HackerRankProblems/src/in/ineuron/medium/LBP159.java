package in.ineuron.medium;

import java.util.Scanner;

public class LBP159 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                count++;
            }
        }
        if(count==arr.length){
            System.out.println("true");
        }
        else
            System.out.println("false");

	}

}
/*Write a function that returns true if all parameters are truthy, and false otherwise

Input Format

an array size and array

Constraints

no

Output Format

true or false

Sample Input 0

3
1 2 3
Sample Output 0

true
Sample Input 1

6
3 2 5 0 2 8
Sample Output 1

false
*/