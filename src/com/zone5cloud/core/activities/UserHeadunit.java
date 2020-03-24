package com.zone5cloud.core.activities;

import com.zone5cloud.core.users.User;

public class UserHeadunit {
	
	private String name;
	
	private String model;
	
	private String serial;
	
	private String product;
	
	private String hwVersion;
	
	private String swVersion;
	
	private Double build;
	
	private Double hwBuild;
	
	private Integer manufacturerId;
	
	private String manufacturer;
	
	private User user;
	
	private Boolean retired;
	
	public UserHeadunit() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getHwVersion() {
		return hwVersion;
	}

	public void setHwVersion(String hwVersion) {
		this.hwVersion = hwVersion;
	}

	public String getSwVersion() {
		return swVersion;
	}

	public void setSwVersion(String swVersion) {
		this.swVersion = swVersion;
	}

	public Double getBuild() {
		return build;
	}

	public void setBuild(Double build) {
		this.build = build;
	}

	public Double getHwBuild() {
		return hwBuild;
	}

	public void setHwBuild(Double hwBuild) {
		this.hwBuild = hwBuild;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getRetired() {
		return retired;
	}

	public void setRetired(Boolean retired) {
		this.retired = retired;
	}
}
