package com.sample.jbehave;

import com.sample.jbehave.exceptions.BusinessException;

/**
 * The <code>TimeConverter</code> interface represents convert
 * time to Berlin clock standard in the implementation.
 * 
 * @author Thangavel Loganathan
 *
 */

public interface TimeConverter {

	/**
	 * The <code>convertTime</code> method used for convert 
	 * to the Berlin clock standard format.
	 * @param aTime
	 * @return <code>String</code>
	 * @throws UbsBusinessException
	 */
    public String convertTime(String aTime) throws BusinessException;

}
