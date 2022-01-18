package com.zone5cloud.core;

import java.net.URL;

import com.zone5cloud.core.oauth.AuthToken;
import com.zone5cloud.core.utils.ILogger;

public class ClientConfig {
    // The initial authorization token to be used in the Authorization header for all requests which require it.
    // token may be null and can be set later via setToken(), or automatically set with a login request
    private AuthToken token = null;

    // Authentication service API key, Your OAuth app clientId (optional for S-Digital systems)
    private String clientID = null;

    // Authentication service API secret, Cognito only. Set to null for Gigya keys.Your OAuth app secret (not needed for S-Digital systems)
    private String clientSecret = null;

    // Users email address
    private String userName = null;

    private URL zone5BaseUrl = null;
    
    private transient ILogger logger = null;

    public AuthToken getToken() { return token; }

    public void setToken(AuthToken token) { this.token = token; }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public URL getZone5BaseUrl() 
    { 
    	return zone5BaseUrl; 
    }

    public void setZone5BaseUrl(URL zone5BaseUrl) { 
    	this.zone5BaseUrl = zone5BaseUrl; 
    }

	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}
}
