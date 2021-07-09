package com.zone5cloud.core.thirdpartyconnections.connections;

import com.google.gson.annotations.SerializedName;

public class ConnectionUser {

    @SerializedName("id")
    private long id;

    @SerializedName("firstname")
    private String firstname;

    @SerializedName("lastname")
    private String lastname;

    @SerializedName("email")
    private String email;

    @SerializedName("isPremium")
    private boolean isPremium;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public boolean isPremium() {
        return isPremium;
    }
}