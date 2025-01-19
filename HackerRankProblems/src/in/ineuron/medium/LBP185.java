package in.ineuron.medium;

import java.util.Scanner;

public class LBP185 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        int[] brr=new int[arr.length];
        for(int i=0;i<brr.length;i++){
             brr[i]=Integer.valueOf(arr[i]);
        }
        int min=0;
        for(int i=0;i<brr.length;i+=2){
            if(i==0){
               min=brr[i]-brr[i+1]; 
            }
            else{
                if(min<brr[i]-brr[i+1])
                    min=brr[i]-brr[i+1];
            }
        }
        System.out.println(min);

	}

}
/*There are 3 friends named Ronaldo,Messi,Rooney who worked at a compnay. Given thier monthly salaries and monthly expendictures, returns the highest saving amoung them.

Input Format

single line with 6 space seperated integers.

Constraints

no

Output Format

highest saving amoung the 3 of them

Sample Input 0

10 7 15 10 15 11
Sample Output 0

5
Sample Input 1

100 50 100 90 100 99
Sample Output 1

50
*/