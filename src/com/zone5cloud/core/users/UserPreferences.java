package com.zone5cloud.core.users;

import com.zone5cloud.core.enums.UnitMeasurement;

public class UserPreferences {
	
	private UnitMeasurement metric;
	
	public UserPreferences() {}

	public UnitMeasurement getMetric() {
		return metric;
	}

	public void setMetric(UnitMeasurement metric) {
		this.metric = metric;
	}
}
