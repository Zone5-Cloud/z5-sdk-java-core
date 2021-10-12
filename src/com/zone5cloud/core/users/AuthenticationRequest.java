package com.zone5cloud.core.users;

import java.util.ArrayList;
import java.util.List;

public abstract class AuthenticationRequest {
	/** User email address */
	private String username;
	
	/** Set to true */
	private Boolean token;
	
	/** Your OAuth app clientId (optional for S-Digital systems) */
	private String clientId;
	
	/** Your OAuth app secret (not needed for S-Digital systems) */
	private String clientSecret;
	
	/** Allow for in-line acceptance of terms & conditions ids */
	private List<String> accept;
	
	private String billingCountry;
	
	protected AuthenticationRequest() {
		// serialisation default constructor
	}
	
	protected AuthenticationRequest(String username, String clientId, String secret, List<String> accept, String billingCountry) {
		this.token = true;
		this.username = username;
		this.clientId = clientId;
		this.clientSecret = secret;
		this.accept = accept;
		this.billingCountry = billingCountry;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}
	
	public void addAccept(String accept) {
		if (this.accept == null) {
			this.accept = new ArrayList<>(1);
		}
		
		this.accept.add(accept);
	}
}
