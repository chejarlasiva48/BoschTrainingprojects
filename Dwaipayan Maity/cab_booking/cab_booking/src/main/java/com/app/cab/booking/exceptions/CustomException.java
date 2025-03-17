package com.app.cab.booking.exceptions;

public class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CustomException(String errorMessage, String rootCause) {
		this.errorMessage = errorMessage;
		this.rootCause = rootCause;
	}

	private String errorMessage;
	private String rootCause;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getRootCause() {
		return rootCause;
	}
	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
