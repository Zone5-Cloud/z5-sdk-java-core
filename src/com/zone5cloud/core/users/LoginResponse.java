package com.zone5cloud.core.users;

import java.util.List;

import com.zone5cloud.core.company.Company;
import com.zone5cloud.core.enums.Roles;

/** Return object from a login */
public class LoginResponse {

	/** Collection of companies which this user belongs / has a relationship with */
	private List<Long> companies;
	
	/** List of roles which this user has */
	private List<Roles> roles;
	
	/** Primary branding company (if any) */
	private Company branding;
	
	/** The actual user */
	private User user;
	
	/** Bearer token */
	private String token;
	
	/** Bearer token expiry (ms since Epoch) */
	private Long tokenExp;
	
	public LoginResponse() { }

	public List<Long> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Long> companies) {
		this.companies = companies;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	public Company getBranding() {
		return branding;
	}

	public void setBranding(Company branding) {
		this.branding = branding;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getTokenExp() {
		return tokenExp;
	}

	public void setTokenExp(Long tokenExp) {
		this.tokenExp = tokenExp;
	}	
}
