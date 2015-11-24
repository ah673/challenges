package numbers;

/**
 * Determine if a number is a power of two
 * @author amyho
 *
 */
public class PowerOfTwo {
	
	public static boolean isPowerOfTwo( int n ){
		while ( n > 1 ){
			if ( n % 2 != 0 ){
				return false;
			}
			n = n / 2; 
		}
		if ( n == 1 ){
			return true;
		}
		return false;
	}

}
