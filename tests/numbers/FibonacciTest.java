package numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void fibonacci_baseCase() {
		int answer = Fibonacci.fibonacciRecursive( 1 );
		assertEquals( 1, answer );
		
		int answer_iterative = Fibonacci.fibonacciIterative( 1 );
		assertEquals( 1, answer_iterative );
	}
	
	@Test
	public void fibonacci_baseCase0() {
		int answer = Fibonacci.fibonacciRecursive( 0 );
		assertEquals( 0, answer );
		
		int answer_iterative = Fibonacci.fibonacciIterative( 0 );
		assertEquals( 0, answer_iterative );
	}
	
	@Test
	public void fibonacci_simpleCase() {
		int answer = Fibonacci.fibonacciRecursive( 2 );
		assertEquals( 1, answer );
		
		int answer_iterative = Fibonacci.fibonacciIterative( 2 );
		assertEquals( 1, answer_iterative );
	}
	
	
	@Test
	public void fibonacci_simpleCase_3() {
		int answer = Fibonacci.fibonacciRecursive( 3 );
		assertEquals( 2, answer );
		
		int answer_iterative = Fibonacci.fibonacciIterative( 3 );
		assertEquals( 2, answer_iterative );
	}
	
	@Test
	public void fibonacci_simpleCase_4() {
		int answer = Fibonacci.fibonacciRecursive( 4 );
		assertEquals( 3, answer );
		
		int answer_iterative = Fibonacci.fibonacciIterative( 4 );
		assertEquals( 3, answer_iterative );
	}

}
