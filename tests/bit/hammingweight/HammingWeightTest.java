package bit.hammingweight;

import static org.junit.Assert.*;

import org.junit.Test;

public class HammingWeightTest {

	@Test
	public void hammingWeightOn1() {
		int number = 1;
		int numberOf1Bits = HammingWeight.numberOfOneBits( number );
		assertEquals( 1, numberOf1Bits );
	}
	
	@Test
	public void hammingWeightOn2() {
		int number = 2;
		int numberOf1Bits = HammingWeight.numberOfOneBits( number );
		assertEquals( 1, numberOf1Bits );
	}
	
	
	@Test
	public void hammingWeightOn7() {
		int number = 7;
		int numberOf1Bits = HammingWeight.numberOfOneBits( number );
		assertEquals( 3, numberOf1Bits );
	}
}
