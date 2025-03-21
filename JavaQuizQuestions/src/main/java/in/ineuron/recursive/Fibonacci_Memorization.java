package in.ineuron.recursive;

public class Fibonacci_Memorization {
	public static void main(String[] args) {
		int n=10;
		 int[] memo = new int[n + 1];
	        for (int i = 1; i <= n; i++) {
	            System.out.print(fibonacci(i, memo) + " ");
	        }
	}
	
	  public static int fibonacci(int n, int[] memo)
	    {
	        if (memo[n] != 0)
	            return memo[n];
	        if (n == 1 || n == 2)
	            return n-1;
	        else {
	            memo[n] = fibonacci(n - 1, memo)
	                      + fibonacci(n - 2, memo);
	            return memo[n];
	        }
	    }
}
