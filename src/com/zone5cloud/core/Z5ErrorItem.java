package com.zone5cloud.core;

public class Z5ErrorItem {

	private String field;
	private Integer code;
	private String message;
	
	public Z5ErrorItem() {}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
