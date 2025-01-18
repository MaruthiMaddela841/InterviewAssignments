package in.ineuron.easy;

import java.util.Scanner;

public class LBP100 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String check="ALP";
        int acount=0;
        if(str.length()>0){
        for(int i=0;i<str.length();i++){
            char c='A';
            if(c==str.charAt(i))
                acount+=1;
        }
        if(acount<=1){
            char[] arr=str.toCharArray();
            int lcount=0;
            for(int i=0;i<arr.length-1;i++){
                char c=arr[i];
                if(c=='L'){
                    if(arr[i]==arr[i+1])
                        lcount+=1;
                }
            }
            if(lcount<=1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
            
        else
            System.out.println("No");
        }
		
		 // Example test cases
        System.out.println(canBeRewarded("PPALLP")); // Output: Yes
        System.out.println(canBeRewarded("PPALLL")); // Output: No
        System.out.println(canBeRewarded("PPP"));    // Output: Yes

	}
	
	   public static String canBeRewarded(String record) {
	        // Count the number of 'A'
	        int absentCount = 0;
	        for (char c : record.toCharArray()) {
	            if (c == 'A') {
	                absentCount++;
	                if (absentCount > 1) {
	                    return "No"; // More than one 'A'
	                }
	            }
	        }

	        // Check for more than two consecutive 'L'
	        if (record.contains("LLL")) {
	            return "No"; // Found three consecutive 'L'
	        }

	        // Passed both conditions
	        return "Yes";
	    }

}
/*You are given a string representing an attendance record for a student. The record only contains the following three characters: 'A' : Absent. 'L' : Late. 'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Input Format

a string from the user

Constraints

non empty string

Output Format

Yes or No

Sample Input 0

PPALLP
Sample Output 0

Yes
Sample Input 1

PPALLL
Sample Output 1

No
Sample Input 2

PPP
Sample Output 2

Yes
*/