package com.app.book_store.models;

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
