package in.ineuron.easy;

import java.util.Scanner;

public class LBP031 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int max=0;
		StringBuilder sb=new StringBuilder("");
		while(n1>0) {
			int min1=n1%10;
			int min2=n2%10;
			int min3=n3%10;
			if(min1<min2 && min1<min3) {
				sb.append(min1);
				if(min2<min3 && max<min3) {
					max=min3;
				}
				else {
					if(max<min2) {
						max=min2;
					}
				}
			}
			else if(min2<min1 && min2<min3) {
				sb.append(min2);
				if(min1<min3 && max<min3) {
					max=min3;
				}
				else {
					if(max<min1)
						max=min1;
				}
			}
			else {
				sb.append(min3);
				if(min2<min1 && max<min1) {
					max=min1;
				}
				else {
					if(max<min2)
						max=min2;
				}
			}
			n1=n1/10;
			n2=n2/10;
			n3=n3/10;
		}
		sb.append(max);
		System.out.println(sb.reverse());
	}

}

/*
"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (passwords). You have been asked to work on the module that is expected to generate PINs using three input numbers.

The three given input numbers will always consist of three digits each i.e. each of them will be in the range >=100 and <=999.

Bellow are the rules for generating the PIN.

The PIN should made up of 4 digits.
The unit (ones) position of the PIN should be the least of the units position of the three numbers.
The tens position of the PIN should be the least of the tens position of the three input numbers.
The hundreds position of the PIN should be least of the hundreds position of the three numbers.
The thousands position of the PIN should be the max of all digits in the three input numbers.
Input Format

three numbers

Constraints

all the numbers must be in the range of >=100 and <=999

Output Format

PIN value

Sample Input 0

123
582
175
Sample Output 0

8122
Sample Input 1

190
267
853
Sample Output 1

9150
Sample Input 2

123
456
789
Sample Output 2

9123
*/