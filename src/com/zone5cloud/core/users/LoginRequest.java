package com.zone5cloud.core.users;

import java.util.List;

public class LoginRequest {
	
	/** User email address */
	private String username;
	
	/** User password */
	private String password;
	
	/** Set to true */
	private Boolean token;
	
	/** Your OAuth app clientId (optional for S-Digital systems) */
	private String clientId;
	
	/** Your OAuth app secret (not needed for S-Digital systems) */
	private String clientSecret;
	
	/** Allow for in-line acceptance of terms & conditions ids */
	private List<String> accept;
	
	public LoginRequest() { }
	
	public LoginRequest(String username, String password, String clientId, String secret) {
		this.token = true;
		this.username = username;
		this.password = password;
		this.clientId = clientId;
		this.clientSecret = secret;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getToken() {
		return token;
	}

	public void setToken(Boolean token) {
		this.token = token;
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
	
	public List<String> getAccept() {
		return accept;
	}
	
	public void setAccept(List<String> accept) {
		this.accept = accept;
	}
}
