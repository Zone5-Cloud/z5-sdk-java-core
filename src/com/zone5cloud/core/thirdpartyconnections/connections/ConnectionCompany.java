package com.zone5cloud.core.thirdpartyconnections.connections;

import com.google.gson.annotations.SerializedName;

public class ConnectionCompany {

	@SerializedName("privacyUrl")
	private String privacyUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("cls")
	private String cls;

	@SerializedName("url")
	private String url;

	public String getPrivacyUrl(){
		return privacyUrl;
	}

	public String getName(){
		return name;
	}

	public String getCls(){
		return cls;
	}

	public String getUrl(){
		return url;
	}
}