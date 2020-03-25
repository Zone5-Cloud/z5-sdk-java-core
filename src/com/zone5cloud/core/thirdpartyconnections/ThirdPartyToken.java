package com.zone5cloud.core.thirdpartyconnections;

public class ThirdPartyToken {

	private String token;
	
	private String refresh_token;
	
	private String scope;
	
	private Integer expires_in;
	
	public ThirdPartyToken() { }
	
	public ThirdPartyToken(String token, String refresh_token, String scope, Integer expires_in) {
		this.token = token;
		this.refresh_token = refresh_token;
		this.scope = scope;
		this.expires_in = expires_in;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}
	
	
}
