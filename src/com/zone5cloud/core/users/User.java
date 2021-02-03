package com.zone5cloud.core.users;

import java.util.Map;

import com.zone5cloud.core.SearchableDataObject;

public class User extends SearchableDataObject {
	
	/** Unique user id (within Z5/TP database) */
	private Long id;
	
	/** Unique user uuid within single sign on domain */
	private String uuid;
	
	/** Unique email address */
	private String email;
	
	private String password;
		
	private String firstname;
	
	private String lastname;	
	
	/** URL to an avatar image */
	private String avatar;
	
	private String locale;
	
	private String timezone;
	
	private Map<String, String> identities;
	
	public User() {
		
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	public String getLocale() {
		return locale;
	}
	
	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Map<String, String> getIdentities() {
		return identities;
	}

	public void setIdentities(Map<String, String> identities) {
		this.identities = identities;
	}
}
