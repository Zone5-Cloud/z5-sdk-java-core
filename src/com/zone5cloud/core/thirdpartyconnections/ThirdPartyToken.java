package com.zone5cloud.core.thirdpartyconnections;

import com.google.gson.annotations.SerializedName;

public class ThirdPartyToken {

	private String token;
	
	@SerializedName("refresh_token")
	private String refreshToken;
	
	private String scope;
	
	@SerializedName("expires_in")
	private Integer expiresIn;
	
	public ThirdPartyToken() { }
	
	public ThirdPartyToken(String token, String refreshToken, String scope, Integer expiresIn) {
		this.token = token;
		this.refreshToken = refreshToken;
		this.scope = scope;
		this.expiresIn = expiresIn;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}
	
	
}
