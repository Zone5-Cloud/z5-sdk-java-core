package com.zone5cloud.core.users;

import java.util.List;

public class RefreshRequest extends AuthenticationRequest {
	
	/** Refresh Token */
	private String refresh;
	
	public RefreshRequest() { /* default constructor */ }
	
	public RefreshRequest(String username, String refreshToken) {
		this(username, refreshToken, null, null, null, null);
	}
	
	public RefreshRequest(String username, String refreshToken, String clientId, String clientSecret) {
		this(username, refreshToken, clientId, clientSecret, null, null);
	}
	
	public RefreshRequest(String username, String refreshToken, String clientId, String clientSecret, List<String> accept, String billingCountry) {
		super(username, clientId, clientSecret, accept, billingCountry);
		setRefresh(refreshToken);
	}

	public String getRefresh() {
		return refresh;
	}

	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}
	
	
}
