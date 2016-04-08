package com.sample.jbehave.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.jbehave.TimeConverter;
import com.sample.jbehave.domain.Clock;
import com.sample.jbehave.exceptions.BusinessException;
import com.sample.jbehave.helper.TimeParseUtility;
import com.sample.jbehave.helper.ValidateTime;

/**
 * The <code>TimeConverterImpl</code> class implementation of
 * <code>TimeConverter</code> interface and does all the business
 * logic in it to generate Berlin clock format with the 
 * help of <code>TimeParseUtility</code> utility class.
 * 
 * @author Thangavel Loganathan
 *
 */

public class TimeConverterImpl implements TimeConverter {

	private static final Logger _LOG = LoggerFactory.getLogger(TimeConverterImpl.class);
	
	/**
	 * The <code>convertTime</code> method used to convert 
	 * the given time into Berlin Clock format with the all 
	 * validations.
	 * @return <code>Clock</code>
	 */
    public String convertTime(String aTime) throws BusinessException {
    	_LOG.info("<<<<<<<< : convertTime()");
    	Clock clock = null;
    	try {
    		_LOG.info("The Given time is: "+aTime);
    		String spiltTime [] = aTime.split(":");
			int hour = Integer.valueOf(spiltTime[0]);
			int minutes = Integer.valueOf(spiltTime[1]);
			int seconds = Integer.valueOf(spiltTime[2]);
			boolean isValided  = ValidateTime.validateTime(hour, minutes, seconds);
		
			if(isValided){
				_LOG.info("The Time validation is success");
				synchronized (this) {
					clock = new Clock(TimeParseUtility.secondsLightIllumination(seconds)
											, TimeParseUtility.fiveHourLightIllumination(hour)
											, TimeParseUtility.hourOrMinutesLightIllumination(hour,'R')
											, TimeParseUtility.fiveMinuteLightIllumination(minutes)
											, TimeParseUtility.hourOrMinutesLightIllumination(minutes,'Y'));
					_LOG.info("After convert into Berlin Clock time is: "+System.lineSeparator()+clock.toString());
				}
			}else{
				_LOG.info("The Time is not valid format, Please cross verify in the .story file.");
				throw new BusinessException("The Time is not valid format, Please cross verify in the .story file.");
			}
			
		} catch (NumberFormatException e) {
			_LOG.info("Characters cannot parsed into Int value, Please cross verify the Input time in .story file.");
			throw new BusinessException("Please check the input time whether it has character in it", e);
		} catch (ArrayIndexOutOfBoundsException ae){
			_LOG.info("Time, Hours, and Seconds not passed in the .story file, Please pass those three input in proper format");
			throw new BusinessException("Please pass the Time, Hours, and Seconds inputs properly ", ae);
		}
    	_LOG.info(">>>>>>>> : convertTime()");
    	return clock != null ? clock.toString() : "";
    }
	
}
