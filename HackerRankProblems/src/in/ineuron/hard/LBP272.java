package in.ineuron.hard;

import java.util.Scanner;

public class LBP272 {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int max=0;
        while(num>0){
            int temp=num%10;
            if(temp>max){
               max=temp;          
            }
             num=num/10;

        }
        System.out.println(max);

	}

}
/*A company wishes to bucketize their item id's for better search operations. The bucket for the item ID is chosen on the basis of the maximum value of the digit in the item ID. Writean algorithm to find the bucket to which the item ID will be assigned.

Input Format

ItemId

Constraints

no

Output Format

bucket ID

Sample Input 0

32387634
Sample Output 0

8
Sample Input 1

12345
Sample Output 1

5
*/