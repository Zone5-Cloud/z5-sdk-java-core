package com.zone5cloud.core.users;

public abstract class AbstractUserThresholdPreference<T extends Number> {
	
	private Long testDate;
	
	private T threshold;
	
	protected AbstractUserThresholdPreference() { }
	
	public Long getTestDate() {
		return testDate;
	}

	public T getThreshold() {
		return threshold;
	}

	public void setThreshold(T threshold) {
		this.threshold = threshold;
	}

	public void setTestDate(Long testDate) {
		this.testDate = testDate;
	}
}
	
