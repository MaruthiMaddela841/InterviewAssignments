package in.ineuron.medium;

import java.util.Scanner;

public class LBP190 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("");
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
            int num1=Integer.parseInt(arr[i]);
            int num2=Integer.parseInt(arr[i+1]);
            if(num1>num2){
                if(num1-num2>2)
                    flag=1;
            }
        }
        if(flag==0)
            System.out.print("Yes");
        else
            System.out.print("No");

	}

}
/*A person went to an exhibition. A lucky draw is going on, where one should buy a ticket. And if they ticket number appear on the screen, that ticket will be considered as jackpot winner.
he knows the secret of picking up the ticket number, which will be considered for the jackpot.

sort the ticket number in the increasing order.
Now, the difference between the adjacent digits should not be more than 2.
If his ticket follows the above condition, then there are more chances to win the jackpot.

Given a ticket number, find whether the ticket is eligible to be part of jackpot or not. Print "Yes/No" based on the result.

Input Format

ticket number

Constraints

no

Output Format

Yes or No

Sample Input 0

171
Sample Output 0

No
Sample Input 1

123
Sample Output 1

Yes
*/