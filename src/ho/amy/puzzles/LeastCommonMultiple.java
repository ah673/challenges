package ho.amy.puzzles;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeastCommonMultiple {
	
	public static int leastCommonFrom1toN( int number ){
		Map<Integer, Integer> primeCounts = new HashMap<Integer, Integer>();
		if ( number == 1 ){
			return number;
		}
		List<Integer> primeFactors = PrimeFactorGenerator.primeFactorization( number );
		Map<Integer, Integer> primeFactorCount = provideCounts( primeFactors );
		
		
	}

	public static Map<Integer, Integer> provideCounts( Collection<Integer> values ) {
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		for ( int value : values ){
			int newCount = 1;
			if( counts.containsKey( value )){
				int currentCountsForValue = counts.get( value );
				newCount += currentCountsForValue;
			}
			counts.put( value, newCount );
		}
		return counts;
		
	}
}
