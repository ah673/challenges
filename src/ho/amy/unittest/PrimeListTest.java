package ho.amy.unittest;

import static org.junit.Assert.*;
import ho.amy.puzzles.PrimeFactorGenerator;

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

}
