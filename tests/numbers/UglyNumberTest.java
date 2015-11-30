package numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class UglyNumberTest {

	@Test
	public void test_6_ugly() {
		int number = 6; 
		boolean isUgly = UglyNumber.isUgly( number );
		
		assertTrue( isUgly );
	}
	
	@Test
	public void test_8_ugly() {
		int number = 8; 
		boolean isUgly = UglyNumber.isUgly( number );
		
		assertTrue( isUgly );
	}
	
	@Test
	public void test_14_not_ugly(){
		int number = 14; 
		boolean isUgly = UglyNumber.isUgly( number );
		
		assertFalse( isUgly );
	}
	
	@Test
	public void test_1_ugly(){
		int number = 1; 
		boolean isUgly = UglyNumber.isUgly( number );
		
		assertTrue( isUgly );
	}

}
