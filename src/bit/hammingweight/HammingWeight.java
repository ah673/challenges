package bit.hammingweight;
/**
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has
 * @author amyho
 *
 */
public class HammingWeight {
	public static int numberOfOneBits( int n ){
		int count = 0;
		for ( int i = 0; i < 32; i++ ){
			boolean oneInPlace =  (n & ( 1 << i )) != 0;
			if ( oneInPlace ){
				count++;
			}
		}
		return count;
	}
}
