package com.zone5ventures.core.day;

import com.zone5ventures.core.users.User;

public class UserDaySleep {
	
	private Long id;
	
	private User user;
	
	private Integer year;
	
	private Integer day;
	
	private String uuid;
	
	private String source;
	
	private Boolean isMainSleep;
	
	//@MappedField(MappedFieldType.percentage)
	private Integer sleepEfficiency;
	
	//@MappedField(MappedFieldType.durationmins)
	private Integer sleepTimeInBed;
	
	//@MappedField(MappedFieldType.durationmins)
	private Integer sleepMinsAsleep;
	
	//@MappedField(MappedFieldType.durationmins)
	private Integer sleepMinsAwake;
	
	//@MappedField(MappedFieldType.durationmins)
	private Integer sleepMinsToFallAsleep;

	private String sleepStartTime;
	
	private String sleepEndTime;
	
	//@MappedField(MappedFieldType.count)
	private Integer sleepTimesAwake;
	
	private Long timeOfWaking;
	
	private Long timeInBed;
	
	private Integer sleepRemMins;
	
	public UserDaySleep() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Boolean getIsMainSleep() {
		return isMainSleep;
	}

	public void setIsMainSleep(Boolean isMainSleep) {
		this.isMainSleep = isMainSleep;
	}

	public Integer getSleepEfficiency() {
		return sleepEfficiency;
	}

	public void setSleepEfficiency(Integer sleepEfficiency) {
		this.sleepEfficiency = sleepEfficiency;
	}

	public Integer getSleepTimeInBed() {
		return sleepTimeInBed;
	}

	public void setSleepTimeInBed(Integer sleepTimeInBed) {
		this.sleepTimeInBed = sleepTimeInBed;
	}

	public Integer getSleepMinsAsleep() {
		return sleepMinsAsleep;
	}

	public void setSleepMinsAsleep(Integer sleepMinsAsleep) {
		this.sleepMinsAsleep = sleepMinsAsleep;
	}

	public Integer getSleepMinsAwake() {
		return sleepMinsAwake;
	}

	public void setSleepMinsAwake(Integer sleepMinsAwake) {
		this.sleepMinsAwake = sleepMinsAwake;
	}

	public Integer getSleepMinsToFallAsleep() {
		return sleepMinsToFallAsleep;
	}

	public void setSleepMinsToFallAsleep(Integer sleepMinsToFallAsleep) {
		this.sleepMinsToFallAsleep = sleepMinsToFallAsleep;
	}

	public String getSleepStartTime() {
		return sleepStartTime;
	}

	public void setSleepStartTime(String sleepStartTime) {
		this.sleepStartTime = sleepStartTime;
	}

	public String getSleepEndTime() {
		return sleepEndTime;
	}

	public void setSleepEndTime(String sleepEndTime) {
		this.sleepEndTime = sleepEndTime;
	}

	public Integer getSleepTimesAwake() {
		return sleepTimesAwake;
	}

	public void setSleepTimesAwake(Integer sleepTimesAwake) {
		this.sleepTimesAwake = sleepTimesAwake;
	}

	public Long getTimeOfWaking() {
		return timeOfWaking;
	}

	public void setTimeOfWaking(Long timeOfWaking) {
		this.timeOfWaking = timeOfWaking;
	}

	public Long getTimeInBed() {
		return timeInBed;
	}

	public void setTimeInBed(Long timeInBed) {
		this.timeInBed = timeInBed;
	}

	public Integer getSleepRemMins() {
		return sleepRemMins;
	}

	public void setSleepRemMins(Integer sleepRemMins) {
		this.sleepRemMins = sleepRemMins;
	}
}
