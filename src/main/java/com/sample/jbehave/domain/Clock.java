package com.sample.jbehave.domain;

import org.apache.commons.lang.text.StrBuilder;
import com.google.common.base.Objects;

/**
 * The <code>Clock</code> class represents entity
 * of the Berlin clock and this entity contains the
 * getters and setters methods which is created for future use.
 * 
 * @author Thangavel Loganathan
 *
 */

public class Clock {

	/**
	 * secondsLight attribute has top yellow lamp of the Berlin clock
	 * represents seconds.
	 */
	private String secondsLight;
	
	/**
	 * fiveHourLight attribute has red lamp of the Berlin clock's second row
	 * and indicates 5 hours each lamp.
	 */
	
	private String fiveHourLight;
	
	/**
	 * oneHourLight attribute has red lamp of the Berlin clock's third row
	 * and indicates 1 hours each lamp.
	 */
	
	private String oneHourLight;
	
	/**
	 * fiveMinuteLight attribute has both red and yellow lamp of the Berlin clock's
	 * fourth row, indicates 1 hours each yellow lamp, and 5 hours each red lamp.
	 */
	
	private String fiveMinuteLight;
	
	/**
	 * oneMinuteLight attribute has the bottom yellow lamp of the Berlin clock
	 * represents one minute.
	 */
	
	private String oneMinuteLight;
	
	/**
	 * The <code>Clock</code> constructors accepts time parameters
	 * @param secondsLight
	 * @param fiveHourLight
	 * @param oneHourLight
	 * @param fiveMinuteLight
	 * @param oneMinuteLight
	 */
	public Clock(String secondsLight, String fiveHourLight, String oneHourLight, 
			String fiveMinuteLight,String oneMinuteLight) {
		this.secondsLight = secondsLight;
		this.fiveHourLight = fiveHourLight;
		this.oneHourLight = oneHourLight;
		this.fiveMinuteLight = fiveMinuteLight;
		this.oneMinuteLight = oneMinuteLight;
	}
	
	/**
	 * The <code>getSecondsLight</code> method used to get
	 * seconds.
	 * @return secondsLight
	 */
	public String getSecondsLight() {
		return secondsLight;
	}
	
	/**
	 * The <code>setSecondsLight</code> method used to set
	 * seconds.
	 * @param secondsLight
	 */
	public void setSecondsLight(String secondsLight) {
		this.secondsLight = secondsLight;
	}
	
	/**
	 * The <code>getFiveHourLight</code> method used to get
	 * Hours.
	 * @return fiveHourLight
	 */
	
	public String getFiveHourLight() {
		return fiveHourLight;
	}
	
	/**
	 * The <code>setFiveHourLight</code> method used to set
	 * Hours.
	 * @param fiveHourLight
	 */
	
	public void setFiveHourLight(String fiveHourLight) {
		this.fiveHourLight = fiveHourLight;
	}
	
	/**
	 * The <code>getOneHourLight</code> method used to get
	 * Hours.
	 * @return oneHourLight
	 */
	
	public String getOneHourLight() {
		return oneHourLight;
	}
	
	/**
	 * The <code>setOneHourLight</code> method used to set
	 * Hours.
	 * @param oneHourLight
	 */
	
	public void setOneHourLight(String oneHourLight) {
		this.oneHourLight = oneHourLight;
	}
	
	/**
	 * The <code>getFiveMinuteLight</code> method used to get
	 * Five Minutes.
	 * @return fiveMinuteLight
	 */
	
	public String getFiveMinuteLight() {
		return fiveMinuteLight;
	}
	
	/**
	 * The <code>setFiveMinuteLight</code> method used to set
	 * Five Minutes.
	 * @param fiveMinuteLight
	 */
	
	public void setFiveMinuteLight(String fiveMinuteLight) {
		this.fiveMinuteLight = fiveMinuteLight;
	}
	
	/**
	 * The <code>getOneMinuteLight</code> method used to get
	 * One Minutes.
	 * @return oneMinuteLight
	 */
	
	public String getOneMinuteLight() {
		return oneMinuteLight;
	}
	
	/**
	 * The <code>setOneMinuteLight</code> method used to set
	 * One Minutes.
	 * @param oneMinuteLight
	 */
	
	public void setOneMinuteLight(String oneMinuteLight) {
		this.oneMinuteLight = oneMinuteLight;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(obj == this){
			return true;
		}
		
		Clock that = (Clock) obj;
		
		return  Objects.equal(this.secondsLight, that.secondsLight) &&
				Objects.equal(this.fiveHourLight, that.fiveHourLight) &&
				Objects.equal(this.oneHourLight, that.oneHourLight) &&
				Objects.equal(this.fiveMinuteLight, that.fiveMinuteLight) &&
				Objects.equal(this.oneMinuteLight, that.oneMinuteLight) ;
	}
	
	@Override
	public int hashCode(){
		return Objects.hashCode(secondsLight,fiveHourLight,oneHourLight,fiveMinuteLight,oneMinuteLight);
	}
	
	@Override
	public String toString(){
		return new StrBuilder().appendWithSeparators(new String[]{ secondsLight, fiveHourLight, oneHourLight, 
	    				fiveMinuteLight, oneMinuteLight },System.lineSeparator()).toString();
	}
	
}
