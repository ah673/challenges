package numbers;

/**
 * Check whether a given number is an ugly number ( positive numbers whose prime factors only include 2, 3, 5 )
 * 6 and 8 are ugly while 14 is not
 * @author amyho
 *
 */
public class UglyNumber {

	public static boolean isUgly( int num ){
		
		while ( num >= 2 ){
            if( num % 2 == 0 ){
                num = num / 2;
            } else if ( num % 3 == 0 ){
                num = num / 3;
            } else if ( num % 5 == 0 ){
                num = num / 5;
            } else {
                break;
            }
        }
        
        if ( num == 1 ){
            return true;
        }
        return false;
	}
}
