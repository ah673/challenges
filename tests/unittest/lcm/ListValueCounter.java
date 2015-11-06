package unittest.lcm;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import strings.lcm.LeastCommonMultiple;

public class ListValueCounter {
	@Test
	public void countEmptyList(){
		Map<Integer, Integer> count = LeastCommonMultiple.provideCounts( Collections.<Integer>emptyList() );
		assertEquals( 0, count.size() ); 
	}
	
	@Test
	public void countSingle(){
		List<Integer> list = Arrays.asList( 5 );
		Map<Integer, Integer> numberCount = LeastCommonMultiple.provideCounts( list );
		assertEquals( 1, numberCount.size() );
		
		int count = numberCount.get( 5 );
		assertEquals( 1, count );
	}
	
	@Test
	public void countMultiple(){
		List<Integer> list = Arrays.asList( 5, 1, 3, 5, 1 );
		Map<Integer, Integer> numberCount = LeastCommonMultiple.provideCounts( list );
		assertEquals( 3, numberCount.size() );
		
		int count_5 = numberCount.get( 5 );
		assertEquals( 2, count_5 );
		
		int count_3 = numberCount.get( 3 );
		assertEquals( 1, count_3 );
		
		int count_1 = numberCount.get( 1 );
		assertEquals( 2, count_1 );
	}

}
