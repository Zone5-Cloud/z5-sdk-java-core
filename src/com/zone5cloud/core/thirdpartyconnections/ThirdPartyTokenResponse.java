package com.zone5cloud.core.thirdpartyconnections;

public class ThirdPartyTokenResponse {
	
	private Boolean success;
	
	private Boolean available;
	
	private ThirdPartyToken token;
	
	public ThirdPartyTokenResponse() { }

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public ThirdPartyToken getToken() {
		return token;
	}

	public void setToken(ThirdPartyToken token) {
		this.token = token;
	}
}
