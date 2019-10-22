package com.zone5ventures.common.users;

public class User {
	
	/** Unique user id (within Z5/TP database) */
	private Long id;
	
	/** Unique user uuid within single sign on domain */
	private String uuid;
	
	/** Unique email address */
	private String email;
		
	private String firstname;
	
	private String lastname;	
	
	/** URL to an avatar image */
	private String avatar;
	
	public User() {
		
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
}
