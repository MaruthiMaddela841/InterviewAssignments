package in.ineuron.recursive;

public class Factorial {

	public static void main(String[] args) {
		
		int n=5;
		
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
		System.out.println("Result through for::"+result);
		
		System.out.println("Result through recursive::"+findFactorial(n));
	}

	private static int findFactorial(int n) {
	    if (n < 0) {
	        throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
	    }
	    if (n == 0 || n == 1) {
	        return 1;
	    }
	    return n * findFactorial(n - 1); // Recursive case
	}

}
