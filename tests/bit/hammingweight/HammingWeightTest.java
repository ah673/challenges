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

}
