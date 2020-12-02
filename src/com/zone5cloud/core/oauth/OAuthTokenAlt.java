package com.zone5cloud.core.oauth;

@Deprecated
public class OAuthTokenAlt extends AuthToken {
	
	private String token;
	
	private Long tokenExp;
		
	public OAuthTokenAlt() { }

	@Override
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public Long getTokenExp() {
		return tokenExp;
	}

	public void setTokenExp(Long tokenExp) {
		this.tokenExp = tokenExp;
	}
	
	@Override
	public String getRefreshToken() {
		// there is no refresh on Gigya tokens
		return null;
	}
}
