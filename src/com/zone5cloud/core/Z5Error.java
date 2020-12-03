package com.zone5cloud.core;

import java.util.List;

public class Z5Error {

	private String error;
	private String message;
	private List<Z5ErrorItem> errors;
	
	public Z5Error() {}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Z5ErrorItem> getErrors() {
		return errors;
	}

	public void setErrors(List<Z5ErrorItem> errors) {
		this.errors = errors;
	}
	
	public Z5ErrorItem getErrorItem(int item) {
		return errors != null ? errors.get(item) : null;
	}
	
}
