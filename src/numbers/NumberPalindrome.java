package numbers;

/**
 * Determine whether an integer is a palindrome. Negative numbers are not palindromes
 * @author amyho
 *
 */
public class NumberPalindrome {
	
	public static boolean isPalindrome( int x ) {
		if ( x < 0 ){
			return false;
		}
		int reversed = reverseNumber( x );
		return reversed == x;
	}

	public static int reverseNumber( int number ){
		int reversed = 0;
		while ( number / 10 != 0 ){
			int lastDigit = number % 10;
			reversed = reversed * 10 + lastDigit;
			number = number / 10;
		}
		reversed = reversed * 10 + number;
		
		return reversed;
	}
}
