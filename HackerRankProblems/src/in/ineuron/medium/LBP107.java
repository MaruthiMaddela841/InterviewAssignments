package in.ineuron.medium;

import java.util.Scanner;

public class LBP107 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<100){
            int sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int num=arr[i];
            int res=num;
            
            if(num==0 || num==1){
                sum=sum+1;
            }
            else if(num==2){
                sum=sum+2;
            }
            else{
                if(num>9){
                    int factsum=0;
                     while(num!=0){
                     int fact=1;
                     int temp=num%10;
                     for(int j=1;j<=temp;j++){
                       fact=fact*j;
                        }
                     factsum=factsum+fact;  
                     num=num/10;
                 }
                if(factsum==res)
                         sum=sum+arr[i];
                    
                     }
            }
        }
        
            System.out.println(sum);
        }

	}

}
/*Implement a program to read an array elements and print sum of all strong numbers in array.

Input Format

size of the array and array elements

Constraints

size<100

Output Format

sum of all strong numbers

Sample Input 0

4
1 2 145 40585
Sample Output 0

40733
Sample Input 1

5
1 2 3 4 5
Sample Output 1

3
Sample Input 2

1
145
Sample Output 2

145
*/