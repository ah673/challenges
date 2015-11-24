package numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOfTwoTest {

	@Test
	public void test_two() {
		boolean twoIsPowerOfTwo = PowerOfTwo.isPowerOfTwo( 2 );
		assertTrue( twoIsPowerOfTwo );
	}
	
	@Test
	public void test_four() {
		boolean fourIsPowerOfTwo = PowerOfTwo.isPowerOfTwo( 4 );
		assertTrue( fourIsPowerOfTwo );
	}
	
	@Test
	public void test_one() {
		boolean oneIsPowerOfTwo = PowerOfTwo.isPowerOfTwo( 1 );
		assertTrue( oneIsPowerOfTwo );
	}
	
	@Test
	public void test_zero() {
		boolean zeroIsPowerOfTwo = PowerOfTwo.isPowerOfTwo( 0 );
		assertFalse( zeroIsPowerOfTwo );
	}

}
