package ho.amy.puzzles.string.subsets;

/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 */
public class ExcelColumnTranslator {
	public int titleToNumber(String s) {
		String lowerCased = s.toLowerCase();
		char[] characters = lowerCased.toCharArray();
		int lengthOfString = characters.length;
		int value = 0;
		for( int i = 0; i < lengthOfString; i++ ) {
			int valueOfLetter = valueOfLetter( characters[i] );
			value += valueOfLetter * Math.pow( 26, lengthOfString - 1 - i );
		}
		return value;
	}

	public int valueOfLetter( char character ) {
		return character - 'a' + 1;
	}
}
