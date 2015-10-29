package ho.amy.puzzles;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeastCommonMultiple {
	
	public static int leastCommonMultipleFrom1toN( int number ){
		Map<Integer, Integer> globalPrimeCounts = new HashMap<Integer, Integer>();
		for ( int i = 1; i <= number; i++ ){
			List<Integer> primeFactors = PrimeFactorGenerator.primeFactorization( i );
			
			Map<Integer, Integer> primeFactorCount = provideCounts( primeFactors );
			for ( int prime : primeFactorCount.keySet() ){
				if ( !globalPrimeCounts.containsKey( prime ) ){
					globalPrimeCounts.put( prime, 0 );
				}
				int maxCount = Math.max( primeFactorCount.get( prime ), globalPrimeCounts.get( prime ) );
				globalPrimeCounts.put( prime, maxCount );
			}
		}
		
		int leastCommonMultiple = multipleOutKeysRaisedToValues( globalPrimeCounts );
		return leastCommonMultiple;
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
	
	private static int multipleOutKeysRaisedToValues( Map<Integer, Integer> globalPrimeCounts ) {
		int value = 1;
		for ( int key : globalPrimeCounts.keySet() ){
			int count = globalPrimeCounts.get( key );
			double raised = Math.pow( key, count );
			value *= raised;
		}
		return value;
	}
}
