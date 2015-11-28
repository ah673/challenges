package strings.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringPalindromeTest {

	@Test
	public void testEmptyString() {
		String value = "";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertTrue( isPalindrome );
	}
	
	@Test
	public void testOneLetterString(){
		String value = "a";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertTrue( isPalindrome );
	}
	
	@Test
	public void testNonPalindrome(){
		String value = "ab";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertFalse( isPalindrome );
	}
	
	@Test
	public void testPalindromeWithSpace(){
		String value = "a man a plan a canal panama";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertTrue( isPalindrome );
	}
	
	@Test
	public void palindromeWithCase(){
		String value = "aBba";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertTrue( isPalindrome );
	}
	
	@Test
	public void palindromeWithPunctuation(){
		String value = "a.";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertTrue( isPalindrome );
	}
	
	@Test
	public void spaceIsPalindrome(){
		String value = " ";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertTrue( isPalindrome );
	}
	
	@Test
	public void moreThanOneSpaceIsPalindrome(){
		String value = "  ";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertTrue( isPalindrome );
	}
	
	@Test
	public void palindromesWithMoreThanOneSpace(){
		String value = "abb  a";
		boolean isPalindrome = StringPalindrome.isPalindrome( value );
		
		assertTrue( isPalindrome );
	}

}
