package com.zone5cloud.core.oauth;

import com.google.gson.annotations.SerializedName;
import com.zone5cloud.core.users.LoginResponse;

public class OAuthToken extends AuthToken {
		
	@SerializedName("token_type")
	private String tokenType;
	
	@SerializedName("expires_in")
	private Integer expiresIn;
	
	private String scope;
	
	public OAuthToken() { }
	
	public OAuthToken(String token, String refresh, Long tokenExp) {
		setToken(token);
		setRefreshToken(refresh);
		setTokenExp(tokenExp);
	}
	
	public OAuthToken(LoginResponse login) {
		if (login != null) {
			setToken(login.getToken());
			setRefreshToken(login.getRefresh());
			setTokenExp(login.getTokenExp());
			if (login.getExpiresIn() != null) {
				setExpiresIn(login.getExpiresIn());
				setTokenExp(System.currentTimeMillis() + (login.getExpiresIn() * 1000));
			}
		}
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	
}
