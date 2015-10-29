package ho.amy.unittest.lcm;

import static org.junit.Assert.*;
import ho.amy.puzzles.lcm.LeastCommonMultiple;

import org.junit.Test;

public class LCMTest {

	@Test
	public void LCM_1to1() {
		int lcm = LeastCommonMultiple.leastCommonMultipleFrom1toN( 1 );
		assertEquals( 1, lcm );
	}
	
	@Test
	public void LCM_1to10() {
		int lcm = LeastCommonMultiple.leastCommonMultipleFrom1toN( 10 );
		int expectedLcm = 2*2*2*3*3*5*7;
		assertEquals( expectedLcm, lcm );
	}
	
	@Test
	public void LCM_1to12() {
		int lcm = LeastCommonMultiple.leastCommonMultipleFrom1toN( 12 );
		int expectedLcm = 2*2*2*3*3*5*7*11;
		assertEquals( expectedLcm, lcm );
	}

}
