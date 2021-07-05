package com.zone5cloud.core.thirdpartyconnections.connections;

import com.google.gson.annotations.SerializedName;

public class ConnectionInitResponse {

    @SerializedName("url")
    private String confirmationUrl;

    public String getConfirmationUrl() {
        return confirmationUrl;
    }

    public void setConfirmationUrl(String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }
}
