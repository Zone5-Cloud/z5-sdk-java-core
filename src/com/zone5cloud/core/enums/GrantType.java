package com.zone5cloud.core.enums;

import com.google.gson.annotations.SerializedName;

public enum GrantType {
	@SerializedName("password")
	USERNAME_PASSWORD,
	
	@SerializedName("refresh_token")
	REFRESH_TOKEN;
	
	@Override
	public String toString() {
		SerializedName name = null;
		try {
			name = getClass().getField(name()).getAnnotation(SerializedName.class);
		} catch (NoSuchFieldException e) {
			
		}
		return name != null ? name.value() : name();
	}
}
