package strings.palindrome;
/**
 * Determine if a string is a palindrome
 * @author amyho
 *
 */
public class StringPalindrome {

	public static boolean isPalindrome( String s ){
		int i = 0; 
		int j = s.length() - 1; 
		
		String strToLowerCase = s.toLowerCase();
		while ( i < j ){
			while ( !Character.isLetterOrDigit( strToLowerCase.charAt( i ) ) && i < s.length() - 1 ){
				i++; 
			}
			while ( !Character.isLetterOrDigit(strToLowerCase.charAt( j ) ) && j > 0 ){
				j--;
			}
			if ( strToLowerCase.charAt( i ) != strToLowerCase.charAt( j ) ){ 
				return false;
			}
			i++; 
			j--;
		}
		return true;
	}
}
