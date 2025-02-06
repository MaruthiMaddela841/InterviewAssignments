package in.ineuron.hard;

import java.util.Scanner;

public class LBP256 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            int temp=num%10;
            if(temp%2==0){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);

	}

}
/*The media compnay "GlobalAdd" has received a batch of advertisements from different product brands. The batch of advertisements is a numeric value where each digit represnets the number of advertisements the media company has received from different product brands. Since the company banners permit only even numbers of advertisements to be displayed, the media company needs to know the totoal number of advertisements it will be able to display from the given batch.
Write an algorithm to calculate the total number of advertisements that will be displayed from the batch.

Input Format

an integer

Constraints

no

Output Format

count of advertisements

Sample Input 0

1234
Sample Output 0

2
Sample Input 1

136
Sample Output 1

1
*/