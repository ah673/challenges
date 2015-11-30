package numbers;

public class AngleBetweenClockHands {
	private static final double DEGREES_IN_CIRCLE = 360.0;
	private static final double HOURS_ON_CLOCK = 12.0;
	private static final double MINUTES_ON_CLOCK = 60.0;
	public static double angleBetweenHands( int hour, int minutes ){
		
		double angleForHourHand = determineAngleForHourHand( hour, minutes );
		double angleForMinuteHand = determineAngleForMinuteHand( minutes );
		
		return Math.abs( angleForHourHand - angleForMinuteHand );
	}

	public static double determineAngleForMinuteHand( double minutes ) {
		double fractionOfClock = ( minutes / MINUTES_ON_CLOCK );
		double angle = fractionOfClock * DEGREES_IN_CIRCLE;
		
		return angle;
	}

	public static double determineAngleForHourHand( int hour, int minutes ) {
		double fractionOfClock = ( hour % HOURS_ON_CLOCK ) / HOURS_ON_CLOCK;
		double angle = fractionOfClock * DEGREES_IN_CIRCLE;
		angle += determineMinuteAdjustment( minutes );
		
		return angle;
	}


	private static double determineMinuteAdjustment( int minutes ) {
		double fractionOfMinutes = ( minutes / MINUTES_ON_CLOCK );
		double additionalAngle = ( 5 / MINUTES_ON_CLOCK ) * fractionOfMinutes * DEGREES_IN_CIRCLE;
		
		return additionalAngle;
		
	}

}
