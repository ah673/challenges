package numbers;

public class Fibonacci {
	
	public static int fibonacciRecursive( int n ){
		if ( n == 0 || n == 1 ){
			return n;
		}
		return fibonacciRecursive( n - 1 ) + fibonacciRecursive( n - 2 );
	}
	
	public static int fibonacciIterative( int n ){
		int[] cached = { 0, 1 };
		for ( int i = 2; i <= n; i++ ){
			cached[ i % 2 ] = cached[0] + cached[1];
		}
		return cached[ n % 2 ];
		
	}

}
