package com.zone5cloud.core.activities;

import com.zone5cloud.core.users.User;

/** Rating of a prescribed workout */
public class UserWorkoutResultRating {

	private User user;
	
	private Long resultId;
	
	/** 1-5 (5 is best) */
	private Short overall;
	
	/** 1-5 (3 is best) */
	private Short duration;
	
	/** 1-5 (3 is best) */
	private Short intensity;
	
	public UserWorkoutResultRating() { }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getResultId() {
		return resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}

	public Short getOverall() {
		return overall;
	}

	public void setOverall(Short overall) {
		this.overall = overall;
	}

	public Short getDuration() {
		return duration;
	}

	public void setDuration(Short duration) {
		this.duration = duration;
	}

	public Short getIntensity() {
		return intensity;
	}

	public void setIntensity(Short intensity) {
		this.intensity = intensity;
	}
}
