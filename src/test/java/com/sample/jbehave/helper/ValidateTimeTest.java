package com.sample.jbehave.helper;

import org.junit.Assert;

import com.sample.jbehave.helper.ValidateTime;

import junit.framework.TestCase;

/**
 * The <code>ValidateTimeTest</code> test class represents as utility class
 * where in validate the time in <code>testValidateTime</code> method.
 * 
 * @author Thangavel Loganathan
 *
 */

// 13:17:01

public class ValidateTimeTest extends TestCase {
	
	/**
	 * The <code>testValidateTime</code> method used to test
	 * given time format
	 * @param hour
	 * @param minutes
	 * @param seconds
	 * @return isValidTime
	 */
	public void testValidateTime(){
		Assert.assertEquals(true, ValidateTime.validateTime(12, 30, 23));
		Assert.assertNotEquals(true, ValidateTime.validateTime(32, 30, 23));
		
	}

}
