package com.cg.exception;

public class RecruitmentException extends Exception {

	/**
	 * 
	 */
	String message2;
	private static final long serialVersionUID = -2060774632392928876L;

	public RecruitmentException(String message)
	{
		message2=message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message2;
	}
	
	
}
