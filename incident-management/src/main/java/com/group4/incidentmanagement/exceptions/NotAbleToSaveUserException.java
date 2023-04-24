package com.group4.incidentmanagement.exceptions;

public class NotAbleToSaveUserException  extends Exception{
	private String message;

	public NotAbleToSaveUserException() {
		// TODO Auto-generated constructor stub
	}

	public NotAbleToSaveUserException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NotAbleToSaveUserException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotAbleToSaveUserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NotAbleToSaveUserException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}
