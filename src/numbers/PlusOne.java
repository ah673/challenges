package numbers;


/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * @author amyho
 *
 */
public class PlusOne {
	public static int[] plusOne( int[] digits ){
		if( digits.length == 0 ){
			return new int[]{ 1 };
		}
		
		int lengthOfAnswer = determineLengthOfAnswer( digits );
		int[] answer = new int[ lengthOfAnswer ];
		
		boolean carry = true;
		int cursor = lengthOfAnswer - 1;
		for ( int i = digits.length - 1; i >= 0; i-- ){
			int digitToTransfer = digits[i];
			if ( carry ){
				digitToTransfer++;
				if ( digitToTransfer == 10 ){
					digitToTransfer = 0;
					carry = true;
				} else {
					carry = false;
				}
			}
			answer[cursor] = digitToTransfer;
			cursor--;
		}
		
		if ( carry ){
			answer[cursor] = 1;
		}
		
		return answer;
	}

	private static int determineLengthOfAnswer( int[] digits ) {
		boolean needLargerArray = needLargerArray( digits );
		if ( needLargerArray ){
			return digits.length + 1;
		}
		return digits.length;
		
	}

	private static boolean needLargerArray( int[] digits ) {
		boolean needLargerArray = false;
		for ( int i : digits ){
			if ( i == 9 ){
				needLargerArray = true;
			} else {
				needLargerArray = false;
				break;
			}
		}
		return needLargerArray;
	}
}
