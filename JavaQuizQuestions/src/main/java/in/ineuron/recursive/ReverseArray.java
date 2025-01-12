package in.ineuron.recursive;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5};
		System.out.print("Using for::");
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.print("Using recursive::");
		reverseArray(num,num.length);
	}

	private static void reverseArray(int[] num, int length) {
	
		if(length>=1) {
			System.out.print(num[length-1]+" ");
			reverseArray(num,length-1);
		}
		
		
	}

}
