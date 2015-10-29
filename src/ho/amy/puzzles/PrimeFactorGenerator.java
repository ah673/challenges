package ho.amy.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrimeFactorGenerator {
	public static Set<Integer> primeList = new TreeSet<Integer>( Arrays.asList( 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97) ); 
	
	public static List<Integer> primeFactorization( int number ){
		List<Integer> primeFactors = new ArrayList<Integer>();
		if ( primeList.contains( number )){
			primeFactors.add( number );
		}
		return primeFactors;
	}

}
