package com.zone5cloud.core;

import com.zone5cloud.core.oauth.AuthToken;

public interface Z5AuthorizationDelegate {
	void onAuthTokenUpdated(AuthToken token);
}
