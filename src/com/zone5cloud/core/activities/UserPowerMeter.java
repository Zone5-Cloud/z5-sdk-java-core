package com.zone5cloud.core.activities;

import com.zone5cloud.core.enums.Equipment;
import com.zone5cloud.core.users.User;

public class UserPowerMeter {
	
	private Long id;
	
	private User user;
	
	private Long ts; 
		
	/** Ant+ id */
	private Integer manufacturerId;
	
	/** Ant+ manufacturer */
	private String manufacturer;
	
	/** Last battery level - volts */
	private Double battery;
	
	/** Last battery level - percentage */
	private Integer batteryP;
	
	private Integer zeroOffset;
	
	private Integer slope;

	/** Accumulated operating time (secs) */
	private Long operatingTime;
		
	/** Current version */
	private String version;
	
	/** Serial number */
	private String serial;
	
	/** Alternate serial number */
	private String altSerial;
	
	/** Power offset adjustment (+-%) */
	private Short adjP;
	
	/** Ant+ number */
	private Integer antid;
	
	/** Product name */
	private String product;
	
	/** User display name */
	private String name;
	
	/** Equipment mapping */
	private Equipment equipment;
	
	/** Has this meter been retired / no longer used */
	private Boolean retired;

	public UserPowerMeter() {
		
	}

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

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public Integer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Double getBattery() {
		return battery;
	}

	public void setBattery(Double battery) {
		this.battery = battery;
	}

	public Integer getBatteryP() {
		return batteryP;
	}

	public void setBatteryP(Integer batteryP) {
		this.batteryP = batteryP;
	}

	public Integer getZeroOffset() {
		return zeroOffset;
	}

	public void setZeroOffset(Integer zeroOffset) {
		this.zeroOffset = zeroOffset;
	}

	public Integer getSlope() {
		return slope;
	}

	public void setSlope(Integer slope) {
		this.slope = slope;
	}

	public Long getOperatingTime() {
		return operatingTime;
	}

	public void setOperatingTime(Long operatingTime) {
		this.operatingTime = operatingTime;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getAltSerial() {
		return altSerial;
	}

	public void setAltSerial(String altSerial) {
		this.altSerial = altSerial;
	}

	public Short getAdjP() {
		return adjP;
	}

	public void setAdjP(Short adjP) {
		this.adjP = adjP;
	}

	public Integer getAntid() {
		return antid;
	}

	public void setAntid(Integer antid) {
		this.antid = antid;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Boolean getRetired() {
		return retired;
	}

	public void setRetired(Boolean retired) {
		this.retired = retired;
	}
}
