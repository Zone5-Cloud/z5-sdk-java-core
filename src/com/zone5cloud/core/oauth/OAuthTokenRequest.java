package com.zone5cloud.core.oauth;

import com.google.gson.annotations.SerializedName;
import com.zone5cloud.core.enums.GrantType;

public class OAuthTokenRequest {
	private String username;
	
	@SerializedName("refresh_token")
	private String refreshToken;
	
	private String password;
	
	@SerializedName("client_id")
	private String clientId;
	
	@SerializedName("client_secret")
	private String clientSecret;
	
	@SerializedName("grant_type")
	private GrantType grantType;
	
	@SerializedName("redirect_uri")
	private String redirect;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRefreshToken() {
		return refreshToken;
	}
	
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getClientId() {
		return clientId;
	}
	
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	public String getClientSecret() {
		return clientSecret;
	}
	
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	
	public GrantType getGrantType() {
		return grantType;
	}
	
	public void setGrantType(GrantType grantType) {
		this.grantType = grantType;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}
}
