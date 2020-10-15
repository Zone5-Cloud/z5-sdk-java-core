package com.zone5cloud.core.thirdpartyconnections;

import com.google.gson.annotations.SerializedName;

public class PushRegistration {
	private String token;
	private String platform;
	@SerializedName("device_id")
	private String deviceId;
	
	public PushRegistration(String token, String platform, String deviceId) {
		this.token = token;
		this.platform = platform;
		this.deviceId = deviceId;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String device_id) {
		this.deviceId = device_id;
	}
}
