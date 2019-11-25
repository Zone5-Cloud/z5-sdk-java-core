package com.zone5ventures.core.users;


public class UserThresholdHeart extends AbstractUserThresholdPreference<Integer> {
	
	private Integer maxHr;
	
	public UserThresholdHeart() { }
	
	public UserThresholdHeart(int thresholdHeartRate, int maxHeartRate) {
		super.setThreshold(thresholdHeartRate);
		this.maxHr = maxHeartRate;
	}

	public Integer getMaxHr() {
		return maxHr;
	}

	public void setMaxHr(Integer maxHr) {
		this.maxHr = maxHr;
	}
}
