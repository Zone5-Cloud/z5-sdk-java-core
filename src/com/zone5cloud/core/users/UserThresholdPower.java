package com.zone5cloud.core.users;


public class UserThresholdPower extends AbstractUserThresholdPreference<Integer> {
	
	public UserThresholdPower() {}
	
	public UserThresholdPower(int thresholdWatts) {
		super.setThreshold(thresholdWatts);
	}
}
