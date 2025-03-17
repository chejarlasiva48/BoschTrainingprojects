package com.app.cab.booking.controllers;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.cab.booking.exceptions.CustomException;
import com.app.cab.booking.exceptions.GeneralException;

@RestControllerAdvice
public class GeneralExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public GeneralException handleException(CustomException exception) {
		GeneralException ex = new GeneralException(exception.getErrorMessage(), exception.getRootCause());
		return ex;
	}

	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public GeneralException handleSqlException(SQLIntegrityConstraintViolationException exception) {
		String rootCause = exception.getMessage();
		if (rootCause.toLowerCase().contains("duplicate")) {
			rootCause = "Duplicate entry detected";
		}
		GeneralException ex = new GeneralException("Exception while updating database", rootCause);
		return ex;
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public GeneralException handlePostRequestArgumentsException(MethodArgumentNotValidException exception) {
		GeneralException ex = new GeneralException("Exception while updating database", "Invalid method arguments");
		return ex;
	} 
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public GeneralException handleInvalidDataTypePostRequestException(HttpMessageNotReadableException exception) {
		GeneralException ex = new GeneralException("Exception while updating database", "Method arguments dataType mismatch");
		return ex;
	}

}
