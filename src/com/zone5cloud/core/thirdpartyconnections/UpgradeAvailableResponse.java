package com.zone5cloud.core.thirdpartyconnections;

import com.google.gson.annotations.SerializedName;

public class UpgradeAvailableResponse {
	@SerializedName("upgrade")
	private Boolean isUpgradeAvailable;

	public Boolean getIsUpgradeAvailable() {
		return isUpgradeAvailable;
	}
	
	public void setIsUpgradeAvailable(Boolean isAvailable) {
		this.isUpgradeAvailable = isAvailable;
	}
}
