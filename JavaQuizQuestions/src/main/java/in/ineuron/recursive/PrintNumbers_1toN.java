package in.ineuron.recursive;

public class PrintNumbers_1toN {
	
	public static void main(String[] args) {
		
		int n=10;
		
		System.out.println("Descending::");
		printNumbersDesc(n);
		System.out.println();
		System.out.println("Ascending::");
		printNumbersAsc(n);
	}

//	private static int printNumbersAsc(int n) {
//		if(n==0) {
//			return n;
//		}
//		else {
//			System.out.print(printNumbersAsc(n-1)+" ");
//		}
//		
//		return n;
//		
//	}
	
	private static void printNumbersAsc(int n) {
	    if (n < 1) {
	        return; // Exit condition for invalid input
	    }
	    if (n == 1) {
	        System.out.print(1 + " "); // Base case: print the smallest number
	    } else {
	        printNumbersAsc(n - 1); // Recursive call
	        System.out.print(n + " "); // Print after the recursive call
	    }
	}

	private static void printNumbersDesc(int n) {
		if(n>=1) {
			System.out.print(n+" ");
			printNumbersDesc(n-1);	
		}	
	}

}
