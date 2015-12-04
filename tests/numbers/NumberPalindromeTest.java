package numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberPalindromeTest {

	@Test
	public void test_reverse_of_single_digit() {
		int x = 1;
		
		int reversedNumber = NumberPalindrome.reverseNumber( x );
		assertEquals( x, reversedNumber );
	}
	
	@Test
	public void test_reverse_of_double_digits() {
		int x = 12;
		
		int reversedNumber = NumberPalindrome.reverseNumber( x );
		assertEquals( 21, reversedNumber );
	}
	
	@Test
	public void test_reverse_of_negative_number() {
		int x = -12;
		
		int reversedNumber = NumberPalindrome.reverseNumber( x );
		assertEquals( -21, reversedNumber );
	}
	
	@Test
	public void test_palindrome_single_digit() {
		int x = 1;
		
		boolean palindrome = NumberPalindrome.isPalindrome( x );
		assertTrue( palindrome );
	}
	
	@Test
	public void no_palindrome_multiple_digits() {
		int x = 12;
		
		boolean palindrome = NumberPalindrome.isPalindrome( x );
		assertFalse( palindrome );
	}
	
	@Test
	public void palindrome_multiple_digit() {
		int x = 212;
		
		boolean palindrome = NumberPalindrome.isPalindrome( x );
		assertTrue( palindrome );
	}
	
	@Test
	public void no_palindrome_negative() {
		int x = -12;
		
		boolean palindrome = NumberPalindrome.isPalindrome( x );
		assertFalse( palindrome );
	}
	
	@Test
	public void palindrome_negative() {
		int x = -212;
		
		boolean palindrome = NumberPalindrome.isPalindrome( x );
		assertFalse( palindrome );
	}

}
