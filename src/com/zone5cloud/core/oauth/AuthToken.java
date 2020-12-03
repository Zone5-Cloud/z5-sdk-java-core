package com.zone5cloud.core.oauth;

import java.util.Base64;
import java.util.Map;
import java.util.Objects;

import com.zone5cloud.core.Types;
import com.zone5cloud.core.utils.GsonManager;

/**
 * Capture the essentials of a token used in the bearer authorization header.
 * This can be either an OAuthToken or an OAuthTokenAlt (deprecated)
 * @author jean
 *
 */
public abstract class AuthToken {
	/** OAuth token */
	public abstract String getToken();
	/** Refresh token used to refresh */
	public abstract String getRefreshToken();
	/** Expiry as a unix timestamp in ms */
	public abstract Long getTokenExp();
	
	/**
	 * Get the formatted Authorization header value
	 * @return "Bearer <token>" or null if token is null
	 */
	public String getBearer() {
		return getToken() != null ? String.format("Bearer %s", getToken()) : null;
	}
	
	/** Test whether this token is expired, or about to expire in the next 30 seconds */
	public boolean isExpired() {
		return getTokenExp() != null && getTokenExp() < System.currentTimeMillis() + 30000;
	}
	
	/** If this token is a Cognito JWT then we can extract the username out of the token */
	public String extractUsername() {
		String jwt = getToken();
		if (jwt != null) {
			String[] segments = jwt.split("\\.");
			if (segments.length > 1) {
				try {
					String body = new String(Base64.getDecoder().decode(segments[1]));
					Map<String, String> map = GsonManager.getInstance().fromJson(body, Types.MAP);
					return map.get("email");
				}
				catch(Exception e) {
					// no username
					return null;
				}
			}	
		}
		
		return null;
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AuthToken)) {
			return false;
		}
		
		AuthToken auth = (AuthToken)other;
		
		return equals(getToken(), auth.getToken()) &&
			   equals(getRefreshToken(), auth.getRefreshToken()) &&
			   equals(getTokenExp(), auth.getTokenExp());
	}
	
	private boolean equals(Object s1, Object s2) {
		if (s1 == null && s2 == null) {
			return true;
		}
		
		if (s1 != null && s2 == null) {
			return false;
		}
		
		return s1.equals(s2);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(getToken(), getRefreshToken(), getTokenExp());
	}
}
