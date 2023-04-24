package com.group4.incidentmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity handleUserNotFoundExceptopm() {
		return new ResponseEntity("User with given id doesn't exists", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DepartmentDoesNotExistsException.class)
	public ResponseEntity handleDepartmentDoesNotExists() {
		return new ResponseEntity("Department doesn't exists", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NotAbleToSaveUserException.class)
	public ResponseEntity handleNotAbleToSaveUserException() {
		return new ResponseEntity("Unable to save the user", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
