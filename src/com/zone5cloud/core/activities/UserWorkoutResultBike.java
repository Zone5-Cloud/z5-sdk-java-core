package com.zone5cloud.core.activities;

public class UserWorkoutResultBike {
	
	/** Display name for the bike */
	private String name;
	
	/** Description of the bike */
	private String descr;
	
	/** Serial number of the bike */
	private String serial;
	
	/** External system legacy bike_id */
	private String uuid;
	
	/** External system bike id */
	private String bikeUuid;
	
	/** External system bike registration id to a particular user */
	private String registrationId;
	
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
	
	public String getBikeUuid() {
		return bikeUuid;
	}

	public void setBikeUuid(String uuid) {
		this.bikeUuid = uuid;
	}
	
	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String uuid) {
		this.registrationId = uuid;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}
