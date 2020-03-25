package com.zone5cloud.core.users;


public class UserThresholdPace extends AbstractUserThresholdPreference<Double> {
	
	public UserThresholdPace() {}
	
	public UserThresholdPace(double thresholdPace) {
		super.setThreshold(thresholdPace);
	}
}
