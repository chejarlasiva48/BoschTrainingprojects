package com.app.cab.booking.exceptions;

import lombok.Data;

@Data
public class GeneralException {

	public GeneralException(String errorMessage, String rootCause) {
		this.errorMessage = errorMessage;
		this.rootCause = rootCause;
	}

	private String errorMessage;
	private String rootCause;
}
