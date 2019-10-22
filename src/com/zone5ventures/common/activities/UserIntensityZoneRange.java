package com.zone5ventures.common.activities;

public class UserIntensityZoneRange {
	
	/** For zones which are relative to a percentage (ie % threshold), this is the min % for the range. For non relative zones (wkg, nm) this is an absolute value */
	private Double min;
	
	/** For zones which are relative to a percentage (ie % threshold), this is the max % for the range. For non relative zones (wkg, nm) this is an absolute value */
	private Double max;
	
	/** Name of the range / zone - ie endurance */
	private String name;
	
	/** The display colour */
	private String colour;
	
	/** The duration (seconds) that the athlete spent in this training zone */
	private Double duration;
	
	/** The percentage of time the athlete spent in this training zone */
	private Double percentage;
	
	/** Indicates if the zone ranges are defined as a % (ie % threshold) or absolute values */
	private String zoneUnits;
	
	public UserIntensityZoneRange() { }
	
	public String getZoneUnits() {
		return zoneUnits;
	}
	
	public void setZoneUnits(String zoneUnits) {
		this.zoneUnits = zoneUnits;
	}

	public Double getDuration() {
		return duration;
	}



	public void setDuration(Double duration) {
		this.duration = duration;
	}



	public Double getPercentage() {
		return percentage;
	}



	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}



	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
