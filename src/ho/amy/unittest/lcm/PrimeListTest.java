package ho.amy.unittest.lcm;

import static org.junit.Assert.*;
import ho.amy.puzzles.lcm.PrimeFactorGenerator;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeListTest {
	
	@Test
	public void primeFactorsOfPrimeIsSelf(){
		List<Integer> primeFactors = PrimeFactorGenerator.primeFactorization( 2 );
		assertEquals(primeFactors.size(), 1 );
		int factor = primeFactors.iterator().next();
		assertEquals( factor, 2 );
	}
	
	@Test
	public void primeFactorsTest(){
		List<Integer> primeFactors = PrimeFactorGenerator.primeFactorization( 4 );
		assertEquals(primeFactors.size(), 2 );
		assertEquals( primeFactors, Arrays.asList( 2, 2 ));
		
		List<Integer> primeFactorsOf_12 = PrimeFactorGenerator.primeFactorization( 12 );
		assertEquals( primeFactorsOf_12.size(), 3 );
		assertEquals( primeFactorsOf_12, Arrays.asList( 2, 2, 3 ));
	}

}
