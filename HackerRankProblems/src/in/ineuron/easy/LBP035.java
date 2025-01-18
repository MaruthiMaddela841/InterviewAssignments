package in.ineuron.easy;

import java.util.Scanner;

public class LBP035 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int rem=0;
            int innercount=0;
            rem=num%10;
            if(rem==1 || rem==0){
                num=num/10;
                continue;
            }
            for(int i=1;i<=rem;i++){
                if(rem%i==0){
                    innercount+=1;
                }
            }
            if(innercount!=2){
                sum=sum+rem;
            }
            num=num/10;
        }
        System.out.println(sum);

	}

}

/*
 * The IT company "Soft ComInfo" has decided to transfer its messages through the N/W using new encryption technique. The company has decided to encrypt the data using the non-prime number concept. The message is in the form of a number and the sum of non-prime digits present in the message is used as the encryption key.
Write an algorithm to determine the encryption key.
note: Digit 1 and 0 are considered as a prime number.

Input Format

The input consists of an integer numMsg representing the numeric form of the message.

Constraints

no

Output Format

print an integer representing the encryption key.

Sample Input 0

45673
Sample Output 0

10
Sample Input 1

123
Sample Output 1

0
 */