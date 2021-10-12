package com.zone5cloud.core;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Z5ErrorItem {
	public static class Metadata {
		@SerializedName(value = "required")
		private List<String> requiredTerms;
		
		public List<String> getRequiredTerms() {
			return this.requiredTerms;
		}
		
		public void setRequiredTerms(List<String> terms) {
			this.requiredTerms = terms;
		}
	}

	private String field;
	private Integer code;
	private String message;
	private Metadata metadata;
	
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

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
