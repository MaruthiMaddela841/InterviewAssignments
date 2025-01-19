package in.ineuron.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LBP163 {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
	        int size=sc.nextInt();
	        int[] arr= new int[size];
	        for(int i=0;i<size;i++){
	            arr[i]=sc.nextInt();
	        }
	        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int n:arr) {
	        	map.put(n,map.getOrDefault(n,0)+1);
	        }
	       for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
	    	   if(entry.getValue()==1) {
	    		   System.out.println(entry.getKey());
	    	   }
	       }

	}

}
/*Write a function that accepts an array of numbers (where each number appears three times except for one which appears only once) and finds that unique number in the array and returns it.

Input Format

array size and elements

Constraints

no

Output Format

return non-repeated number

Sample Input 0

4
2 2 3 2
Sample Output 0

3
Sample Input 1

7
0 1 0 1 0 1 99
Sample Output 1

99
*/