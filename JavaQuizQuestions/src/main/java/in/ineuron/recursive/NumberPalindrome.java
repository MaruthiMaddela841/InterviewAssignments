package in.ineuron.recursive;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=454;
		int res=reverseNum(num,0);
		if(num==res) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	private static int reverseNum(int num, int res) {
		if(num==0) {
			return res;
		}
		int flag=num%10;
		res=res*10+flag;
		num=num/10;
		return reverseNum(num,res);
	}

}
