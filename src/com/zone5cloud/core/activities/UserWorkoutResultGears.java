package com.zone5cloud.core.activities;

import com.zone5cloud.core.SearchableDataObject;
import com.zone5cloud.core.enums.BatteryStatus;

public class UserWorkoutResultGears extends SearchableDataObject {
	
	/** Minimum battery voltage reported */
	private Double minBattery;
	
	/** Average battery voltage reported */
	private Double avgBattery;
	
	/** Maximum battery voltage reported */
	private Double maxBattery;
	
	/** Battery status */
	private BatteryStatus batteryStatus;
	
	///** Network connection source (ie ant+/ble)  */
	//private SourceType source;

	/** ant+ ID */
	private Integer antId;
	
	/** FIT manufacturerId */
	private Integer manufacturerId;
	
	/** Name of the electronic shifting device */
	private String name;
	
	public UserWorkoutResultGears() { }

	public Double getMinBattery() {
		return minBattery;
	}

	public void setMinBattery(Double minBattery) {
		this.minBattery = minBattery;
	}

	public Double getAvgBattery() {
		return avgBattery;
	}

	public void setAvgBattery(Double avgBattery) {
		this.avgBattery = avgBattery;
	}

	public Double getMaxBattery() {
		return maxBattery;
	}

	public void setMaxBattery(Double maxBattery) {
		this.maxBattery = maxBattery;
	}

	public BatteryStatus getBatteryStatus() {
		return batteryStatus;
	}

	public void setBatteryStatus(BatteryStatus batteryStatus) {
		this.batteryStatus = batteryStatus;
	}

	public Integer getAntId() {
		return antId;
	}

	public void setAntId(Integer antId) {
		this.antId = antId;
	}

	public Integer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
