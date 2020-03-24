package com.zone5cloud.core.oauth;

public class OAuthTokenAlt {
	
	private String token;
	
	private Long tokenExp;
		
	public OAuthTokenAlt() { }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getTokenExp() {
		return tokenExp;
	}

	public void setTokenExp(Long tokenExp) {
		this.tokenExp = tokenExp;
	}
}
