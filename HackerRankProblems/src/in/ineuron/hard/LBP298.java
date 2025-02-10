package in.ineuron.hard;

import java.util.Scanner;

public class LBP298 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int maxsum=0;
        int minsum=0;
        int[] arr=new int[3];
        arr[0]=n1;
        arr[1]=n2;
        arr[2]=n3;
        for(int i=0;i<3;i++){
            int num=arr[i];
            int max=num%10;
            int min=num%10;
            while(num>0){
                int temp=num%10;
                if(temp>max)
                    max=temp;
                else if(temp<min)
                    min=temp;
                num=num/10;
            }
            maxsum=maxsum+max;
            minsum=minsum+min;
        }
        System.out.println(maxsum-minsum);

	}

}
/*Implement a program to find absolute diff betwee sum of max digits and sum of min digits present in three integers n1,n2 and n3

Input Format

n1,n2 and n3

Constraints

no

Output Format

int value

Sample Input 0

5213
5698
2153
Sample Output 0

12
Sample Input 1

1212
1234
5678
Sample Output 1

7
*/