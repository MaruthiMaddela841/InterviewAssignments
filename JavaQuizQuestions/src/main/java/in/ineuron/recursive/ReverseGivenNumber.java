package in.ineuron.recursive;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		
		int num=453;
		int res=0;
		while(num>0) {
			int flag=num%10;
			num=num/10;
			res=res*10+flag;
		}
		System.out.println("Using While::"+res);
		num=453;
		//System.out.print("Using Recursive::");
		//reverseNum(num);
		System.out.println("Using Recursive::"+reverseNum(num,0));
	}

//	private static void reverseNum(int num) {
//		if(num>0) {
//			int res=num%10;
//			System.out.print(res+"");
//			num=num/10;
//			reverseNum(num);
//		}
//		
//	}
	
	private static int reverseNum(int num, int reversed) {
	    if (num == 0) {
	        return reversed; // Base case: Return the accumulated reversed number
	    }
	    int remainder = num % 10; // Extract the last digit
	    reversed = reversed * 10 + remainder; // Append the digit to the reversed number
	    return reverseNum(num / 10, reversed); // Recursive call with updated values
	}

}
