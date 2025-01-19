package in.ineuron.medium;

import java.util.Scanner;

public class LBP167 {
	
	 public static int fact(int num){
	        int res=1;
	        for(int i=1;i<=num;i++){
	            
	            res=res*i;
	        }
	        return res;
	    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = fact(num);
		int count = 0;
		while (res != 0) {
			int temp = res;
			temp = temp % 10;
			if (temp == 0) {
				count++;
			}
			res = res / 10;
		}
		System.out.println(count);

	}

}
/*
 * You are playing an online game. In the game, a numbers is displayed on the
 * screen. In order to win the game, you have to count the trailing zeros in the
 * factorial value of the given number. Write an algorithm to count the trailing
 * zeros in the factorial value of the given number.
 * 
 * Input Format
 * 
 * an integer num, representing the number displayed on the screen.
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * the count of trailing zeros in the factorial of the given number.
 * 
 * Sample Input 0
 * 
 * 5 Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * 0 Sample Output 1
 * 
 * 0
 */