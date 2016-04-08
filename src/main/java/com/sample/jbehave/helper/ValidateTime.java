package com.sample.jbehave.helper;

import com.sample.jbehave.constants.Time;

/**
 * The <code>ValidateTime</code> class represents as utility class
 * where in validate the time in <code>validateTime</code> method.
 * 
 * @author Thangavel Loganathan
 *
 */

public class ValidateTime {
	
	/**
	 * The <code>validateTime</code> method used to validate
	 * the given time in .story file.
	 * @param hour
	 * @param minutes
	 * @param seconds
	 * @return isValidTime
	 */
	public static boolean validateTime(int hour, int minutes, int seconds){
		
		boolean isValidTime = false;
		
		if( hour <= Time.HOUR_FORMAT.getTime() && minutes <= Time.MIN_SECONDS_FORMAT.getTime() 
				&& seconds <= Time.MIN_SECONDS_FORMAT.getTime()){
			isValidTime = true;
		}
		return isValidTime;
	}

}
