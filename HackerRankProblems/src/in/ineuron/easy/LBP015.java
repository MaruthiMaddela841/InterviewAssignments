package in.ineuron.easy;

import java.util.Scanner;

public class LBP015 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last;
        int sum=0;
        if(n>=0){
            while(n>0){
             last=n%10;
            n=n/10;
                if(n==0){
                    if(last==0){
                        System.out.println("No");
                    }
                    else if(sum>0){
                        System.out.println("Yes");
                    }
                    else if(sum==0){
                        System.out.println("No");
                    }
                    }
                else{
                    if(last==0){
                        sum=sum+1;
                    }
                }
                
            }
        }
		
//SOLUTION::2
//		Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        if(Character.toString(str.charAt(0)).equals("0")) {
//        	System.out.println("Not Duck");
//        }
//        else {
//        	int n=Integer.parseInt(str);
//        	if(n>=1 && n<=9) {
//        		System.out.println("Not Duck");
//        	}
//        	else {
//        		String sub=str.substring(1);
//        		if(sub.contains("0")) {
//        			System.out.println("Duck");
//        		}
//        		else {
//        			System.out.println("Not Duck");
//        		}
//        	}
//        }
	}

}

/*
Program to read a number and check whether it is duck number or not.
Hint: A duck number is a number which has zeros present in it, but no zero present in the begining of the number.

Input Format

a number from the user

Constraints

n>=0

Output Format

Yes or No

Sample Input 0

123
Sample Output 0

No
Sample Input 1

140
Sample Output 1

Yes
*/