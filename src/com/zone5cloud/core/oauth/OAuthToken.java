package com.zone5cloud.core.oauth;

public class OAuthToken {
	
	private String access_token;
	
	private String refresh_token;
	
	private String token_type;
	
	private Integer expires_in;
	
	public OAuthToken() { }

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public Integer getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(Integer expires) {
		this.expires_in = expires;
	}
}
