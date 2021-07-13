package com.zone5cloud.core.thirdpartyconnections.connections;

import com.google.gson.annotations.SerializedName;

public class ConnectionApp {

    @SerializedName("company")
    private ConnectionCompany company;

    @SerializedName("user")
    private ConnectionUser connectionUser;

    public ConnectionCompany getCompany() {
        return company;
    }

    public ConnectionUser getUser() {
        return connectionUser;
    }
}