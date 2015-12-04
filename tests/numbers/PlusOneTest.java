package numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlusOneTest {

	@Test
	public void test_emptyArray() {
		int[] answer = PlusOne.plusOne( new int[]{} );
		assertEquals( 1, answer.length );
		assertEquals( 1, answer[0] );
	}
	
	@Test
	public void test_carry() {
		int[] answer = PlusOne.plusOne( new int[]{ 9 } );
		assertEquals( 2, answer.length );
		assertEquals( 1, answer[0] );
		assertEquals( 0, answer[1] );
	}
	

	@Test
	public void test_no_carry() {
		int[] answer = PlusOne.plusOne( new int[]{ 1 } );
		assertEquals( 1, answer.length );
		assertEquals( 2, answer[0] );
	}
	
	@Test
	public void test_multi_digits_all_carry() {
		int[] answer = PlusOne.plusOne( new int[]{ 9,9,9 } );
		assertEquals( 4, answer.length );
		assertEquals( 1, answer[0] );
		assertEquals( 0, answer[1] );
		assertEquals( 0, answer[2] );
		assertEquals( 0, answer[3] );
	}
	
	@Test
	public void test_multi_digits_some_carry() {
		int[] answer = PlusOne.plusOne( new int[]{ 9,8,9 } );
		assertEquals( 3, answer.length );
		assertEquals( 9, answer[0] );
		assertEquals( 9, answer[1] );
		assertEquals( 0, answer[2] );
	}
	
	@Test
	public void test_multi_digits_no_carry() {
		int[] answer = PlusOne.plusOne( new int[]{ 1, 2 } );
		assertEquals( 2, answer.length );
		assertEquals( 1, answer[0] );
		assertEquals( 3, answer[1] );
	}

}
