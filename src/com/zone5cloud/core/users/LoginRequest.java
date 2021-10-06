package com.zone5cloud.core.users;

import java.util.List;

public class LoginRequest extends AuthenticationRequest {
	
	/** User password */
	private String password;
	
	public LoginRequest() { /* default constructor */}
	
	public LoginRequest(String username, String password) {
		super(username, null, null, null, null);
		this.password = password;
	}
	
	public LoginRequest(String username, String password, List<String> accept, String billingCountry) {
		this(username, password, null, null, accept, billingCountry);
	}
	
	public LoginRequest(String username, String password, String clientId, String secret) {
		this(username, password, clientId, secret, null, null);
	}
	
	public LoginRequest(String username, String password, String clientId, String secret, List<String> accept, String billingCountry) {
		super(username, clientId, secret, accept, billingCountry);
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
