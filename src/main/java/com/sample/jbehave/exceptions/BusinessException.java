package com.sample.jbehave.exceptions;

/**
 * The <code>BusinessException</code> class represents
 * custom exception which used to display error stack trace to 
 * the end user.
 * 
 * @author Thangavel Loganathan
 *
 */

public class BusinessException extends Exception{

	/**
	 * The Default Serial Version Id
	 */
	
	private static final long serialVersionUID = 6836093199350008769L;
	
	/**
	 * The message attribute has error message to display in the console.
	 */
	
	private String message;
	
	/**
	 * The default construct to create instance.
	 */
	
	public BusinessException() {
		super();
	}
	
	/**
	 * The <code>BusinessException</code> constructor accepts
	 * <code>String</code> parameter and display error trace.
	 * 
	 * @param message
	 */
	
	public BusinessException(String message) {
		super(message);
		this.message = message;
	}
	
	/**
	 * The <code>BusinessException</code> constructor accepts
	 * <code>String</code>, <code>Throwable</code> parameters, and display error trace.
	 * 
	 * @param message
	 * @param cause
	 */
	
	public BusinessException(String message,Throwable cause) {
		super(message,cause);
		this.message = message;
	}

	/**
	 * The <code>getMessage</code>method displays the error message
	 * in the console.
	 * 
	 * @return the message
	 */
	
	public String getMessage() {
		return message;
	}
	
}
