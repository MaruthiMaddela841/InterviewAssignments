package in.ineuron.recursive;

public class Fibonacci_DynamicProgramming {
	public static void main(String[] args) {
		// Given Number N
		int N = 10;

		// Print first 10 term
		for (int i = 0; i < N; i++)
			System.out.print(fib(i) + " ");
	}

	private static int fib(int n) {

		// Declare an array to store
		// Fibonacci numbers.
		// 1 extra to handle case, n = 0
		int f[] = new int[n + 2];

		int i;

		// 0th and 1st number of
		// the series are 0 and 1
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {

			// Add the previous 2 numbers
			// in the series and store it
			f[i] = f[i - 1] + f[i - 2];
		}

		// Nth Fibonacci Number
		return f[n];
	}
}
