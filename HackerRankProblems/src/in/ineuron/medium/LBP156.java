package in.ineuron.medium;

import java.util.Scanner;

public class LBP156 {
	
	public static String findString(int[] arr,String str){
        String res="";
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            res=res+Character.toString(str.charAt(num));
            
        }
        return res;
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findString(arr, str));

	}

}
/*
 * Create a function that takes two inputs: idx (an array of integers) and str
 * (a string). The function should return another string with the letters of str
 * at each index in idx in order.
 * 
 * Input Format
 * 
 * a string followed by size and an array
 * 
 * Constraints
 * 
 * output must be in lower case but input many not be.
 * 
 * Output Format
 * 
 * a string contained in the specified locations given in the array.
 * 
 * Sample Input 0
 * 
 * She is the love of my love 3 7 11 14 Sample Output 0
 * 
 * tle Sample Input 1
 * 
 * Relax and stay calm to avoid failures 3 3 6 12 Sample Output 1
 * 
 * aaa
 */