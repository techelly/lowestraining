package com.group4.incidentmanagement.exceptions;

public class UserNotFoundException extends Exception {
	
	private String message;

	
	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
	}


	public UserNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}


	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}


	public UserNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


	public UserNotFoundException(String message) {
		this.message = message;
	}
	
}
