package com.zone5cloud.core.users;

import java.util.List;

import com.zone5cloud.core.company.Company;
import com.zone5cloud.core.enums.Roles;
import com.zone5cloud.core.oauth.OAuthToken;
import com.zone5cloud.core.terms.TermsAndConditions;

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
	
	/** Refresh token */
	private String refresh;
	
	/** Bearer token expiry (ms since Epoch) */
	private Long tokenExp;
	
	/** Bearer token expiry (seconds from now) */
	private Integer expiresIn;
	
	private List<TermsAndConditions> updatedTerms;
	
	private Boolean needChangePassword;
	
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
	
	public String getRefresh() {
		return refresh;
	}

	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}

	public Long getTokenExp() {
		return tokenExp;
	}

	public void setTokenExp(Long tokenExp) {
		this.tokenExp = tokenExp;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public List<TermsAndConditions> getUpdatedTerms() {
		return updatedTerms;
	}

	public void setUpdatedTerms(List<TermsAndConditions> updatedTerms) {
		this.updatedTerms = updatedTerms;
	}

	public Boolean getNeedChangePassword() {
		return needChangePassword;
	}

	public void setNeedChangePassword(Boolean needChangePassword) {
		this.needChangePassword = needChangePassword;
	}	
	
	/** Convenience method to create an OAuthToken from this login response object */
	public OAuthToken getOAuthToken() {
		return new OAuthToken(this);
	}
}
