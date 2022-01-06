package com.zone5cloud.core.oauth;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Capture the essentials of a token used in the bearer authorization header.
 * This can be either an OAuthToken or an OAuthTokenAlt (deprecated)
 * @author jean
 *
 */
public class AuthToken {
	@SerializedName(value = "access_token", alternate = "token")
	private String token;
	
	@SerializedName("refresh_token")
	private String refreshToken;

	private Long tokenExp;

	public String getToken() {
		return token;
	}

	public void setToken(String accessToken) {
		this.token = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Long getTokenExp() {
		return tokenExp;
	}

	public void setTokenExp(Long tokenExp) {
		this.tokenExp = tokenExp;
	}

	
	/**
	 * Get the formatted Authorization header value
	 * @return "Bearer <token>" or null if token is null
	 */
	public String getBearer() {
		return getToken() != null ? String.format("Bearer %s", getToken()) : null;
	}
	
	/** Test whether this token is expired, or about to expire in the next 30 seconds */
	public boolean isExpired() {
		return getTokenExp() != null && getTokenExp() < System.currentTimeMillis() + 30000;
	}
	
	/** Test whether the token is refreshable and requires refresh */
	public boolean requiresRefresh() {
		return getRefreshToken() != null && (getTokenExp() == null || isExpired());
	}
	
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AuthToken)) {
			return false;
		}
		
		AuthToken auth = (AuthToken)other;
		
		return equals(getToken(), auth.getToken()) &&
			   equals(getRefreshToken(), auth.getRefreshToken()) &&
			   equals(getTokenExp(), auth.getTokenExp());
	}
	
	private boolean equals(Object s1, Object s2) {
		if (s1 == null && s2 == null) {
			return true;
		}
		
		if (s1 == null && s2 != null) {
			return false;
		}
		
		return s1.equals(s2);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(getToken(), getRefreshToken(), getTokenExp());
	}
}
