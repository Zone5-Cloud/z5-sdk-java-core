package com.zone5cloud.core.oauth;

import com.google.gson.annotations.SerializedName;
import com.zone5cloud.core.users.LoginResponse;

public class OAuthToken extends AuthToken {
	
	@SerializedName(value = "access_token", alternate = "token")
	private String token;
	
	@SerializedName("refresh_token")
	private String refreshToken;
	
	@SerializedName("token_type")
	private String tokenType;
	
	@SerializedName("expires_in")
	private Integer expiresIn;
	
	private Long tokenExp;
	
	private String scope;
	
	public OAuthToken() { }
	
	public OAuthToken(String token, String refresh, Long tokenExp) {
		this.token = token;
		this.refreshToken = refresh;
		this.tokenExp = tokenExp;
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

	@Override
	public String getToken() {
		return token;
	}

	public void setToken(String accessToken) {
		this.token = accessToken;
	}

	@Override
	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
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

	@Override
	public Long getTokenExp() {
		return tokenExp;
	}

	public void setTokenExp(Long tokenExp) {
		this.tokenExp = tokenExp;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	
}
