package com.zone5cloud.core.thirdpartyconnections.connections;

import com.google.gson.annotations.SerializedName;

public class ConnectionsResponse {

    @SerializedName("app")
    private ConnectionApp app;

    @SerializedName("type")
    private String type;

    @SerializedName("enabled")
    private boolean enabled;

    public ConnectionApp getApp() {
        return app;
    }

    public String getType() {
        return type;
    }

    public boolean isEnabled() {
        return enabled;
    }
}