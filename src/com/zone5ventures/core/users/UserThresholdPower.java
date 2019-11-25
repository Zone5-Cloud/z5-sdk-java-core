package com.zone5ventures.core.users;


public class UserThresholdPower extends AbstractUserThresholdPreference<Integer> {
	
	public UserThresholdPower() {}
	
	public UserThresholdPower(int thresholdWatts) {
		super.setThreshold(thresholdWatts);
	}
}
