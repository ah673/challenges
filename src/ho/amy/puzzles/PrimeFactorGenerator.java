package ho.amy.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrimeFactorGenerator {
	public static Set<Integer> primeList = new TreeSet<Integer>( Arrays.asList( 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97) ); 
	
	public static List<Integer> primeFactorization( int number ){
		
		List<Integer> primeFactors = determineFactorsForNonPrimes( number );
		return primeFactors;
	}

	private static List<Integer> determineFactorsForNonPrimes( int number ) {
		if ( primeList.contains( number )){
			return Arrays.asList( number );
		} 
		List<Integer> primeFactors = new ArrayList<Integer>();
		for ( int prime : primeList ){
			if ( prime * prime > number ){
				break;
			} 
			if ( number % prime == 0 ){
				primeFactors.add( prime );
				primeFactors.addAll( determineFactorsForNonPrimes( number/prime ));
				break;
			}
		}
		
		return primeFactors;
	}

}
