package com.zone5cloud.core.thirdpartyconnections.connections;

import com.google.gson.annotations.SerializedName;

public class ConnectionsResponse {

	@SerializedName("app")
	private ConectionApp app;

	@SerializedName("type")
	private String type;

	@SerializedName("enabled")
	private boolean enabled;

	public ConectionApp getApp(){
		return app;
	}

	public String getType(){
		return type;
	}

	public boolean isEnabled(){
		return enabled;
	}
}