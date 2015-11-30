package numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class AngleBetweenClockHandsTest {

	@Test
	public void test_noMinutes() {
		double angleBetweenHands = AngleBetweenClockHands.angleBetweenHands( 3, 0 );
		assertEquals( 90.0, angleBetweenHands, 0.00001 );
	}
	
	@Test
	public void testHourHandWithMinuteAdjustment() {
		double angleForHourHand = AngleBetweenClockHands.determineAngleForHourHand( 5, 24 );
		
		double angleForMinuteHand = AngleBetweenClockHands.determineAngleForMinuteHand( 24 );
		
		double angleBetweenHands = AngleBetweenClockHands.angleBetweenHands( 5, 24 );
		assertEquals( 162.0, angleForHourHand, 0.00001 );
		assertEquals( (24.0/60.0)*360.0, angleForMinuteHand, 0.00001 ); // 144
		assertEquals( 162.0 - 144.0, angleBetweenHands, 0.00001 );
	}
	
	@Test
	public void testMinutesAngle(){
		int minutes = 15;
		double angleForMinuteHand = AngleBetweenClockHands.determineAngleForMinuteHand( minutes );
		assertEquals( 90, angleForMinuteHand, 0.00001 );
	}

}
