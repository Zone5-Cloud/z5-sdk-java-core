package com.zone5ventures.core.activities;

public class UserWorkoutResultBike {
	
	/** Display name for the bike */
	private String name;
	
	/** Description of the bike */
	private String descr;
	
	/** Serial number of the bike */
	private String serial;
	
	/** External system bike_id */
	private String uuid;
	
	/** URL image */
	private String avatar;
	
	public UserWorkoutResultBike() { }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}
