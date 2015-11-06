package unittest.stringsubsets;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.excelcolumntranslator.ExcelColumnTranslator;

public class ExcelColumnTranslatorTest {

	@Test
	public void testOneDigitValue() {
		ExcelColumnTranslator columnTranslator = new ExcelColumnTranslator();
		int value = columnTranslator.titleToNumber( "A" );
		assertEquals( 1, value );
	}
	
	@Test
	public void testTwoDigitValue() {
		ExcelColumnTranslator columnTranslator = new ExcelColumnTranslator();
		int value = columnTranslator.titleToNumber( "AA" );
		assertEquals( 26 + 1, value );
	}
	
	@Test
	public void testThreeDigitValue() {
		ExcelColumnTranslator columnTranslator = new ExcelColumnTranslator();
		int value = columnTranslator.titleToNumber( "ABA" );
		assertEquals( 26*26 + 26*2 + 1, value );
	}

}
