package com.group4.incidentmanagement.exceptions;

public class DepartmentDoesNotExistsException  extends Exception{
	private String message;

	public DepartmentDoesNotExistsException() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentDoesNotExistsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DepartmentDoesNotExistsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DepartmentDoesNotExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DepartmentDoesNotExistsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}
